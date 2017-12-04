// 搜索
function user_search() {
	$("#users-datagrid").datagrid("load", {
		'nickname' : $('#user_search_nickname').val(),
		'subscribe' : $('#user_search_subscribe').val(),
		'sex' : $('#user_search_sex').val(),
		'tagidList' : $('#user_search_tagidList').val(),
		'subscribeTime' : $('#user_search_subscribeTime').val(),
		'black' : $('#user_search_black').val()
	});
}

//清空搜索框
function user_clear() {
	$("#user_SearchForm").form('reset');
	$('#users-datagrid').datagrid('load', {});
}

// 将微信服务器的标签同步到本地数据库
function synchroUsers(){
	
	$.messager.confirm('操作确认', '确定要用户到本地数据库吗？', function(r) {
		if(r){
			$.post('wxuser/synchrousers', {}, function(result) {
				if (result == 200) {
					$.messager.alert('同步用户', '同步成功！', 'info');
					$('#users-datagrid').datagrid('reload');
				} else {
					$.messager.alert('同步用户', '同步失败！', 'error');
				}
			}, 'json');
		}
	});
}
//判断性别显示
function sexFormatter(value) {
	if (value == 1) {
		return '<span style="color:#292929">男</span>';
	} else if (value == 2) {
		return '<span style="color:#CD5C5C">女</span>';
	} else {
		return '<span style="color:gray">未知</span>';
	}
}
//判断关注显示
function taggingFormatter(value) {
	if (value == 1) {
		return '<span style="color:#292929">关注</span>';
	} else if (value == 0) {
		return '<span style="color:gray">未关注</span>';
	}
}

//判断黑名单显示
function blackFormatter(value) {
	if (value == 1) {
		return '<span style="color:black">已拉黑</span>';
	}
}

//添加备注按钮
function remarkFormatter(value, row, index){
	return '<button id="remarkButton" style="color:gray" onclick="remarkUser(\''
	+row.remark+ '\',\'' + row.ids+ '\',\'' + row.nickname+ '\')">添加/编辑备注</button>';
} 

//打开编辑添加框。
function remarkUser(remark,ids,nickname){
	$('#Users-edit-form').form('load',{
		ids:ids,
		nickname:nickname,
		remark:remark
	});
	$('#Users-edit-dialog').dialog('open').dialog('setTitle', '添加备注');
	url='/wxuser/addremark';
}

//添加备注
function saveUserRemark() {
	$('#Users-edit-form').form('submit', {
		url : url,
		onSubmit : function() {
			return $(this).form('validate');
		},
		success : function(result) {
			if (result != 200) {
				$.messager.alert('添加备注', '添加失败！', 'error');
			} else {
				$('#Users-edit-dialog').dialog('close'); // close the dialog
				$('#users-datagrid').datagrid('reload'); // reload the user data
				$.messager.alert('添加消息', '添加成功！', 'info');
			}
		}
	});
}

// 将用户添加到黑名单
function addblackusers() {
	var url = "/wxuser/addblackusers";
	var name = "拉入黑名单";
	var row = $('#users-datagrid').datagrid('getChecked');
	var ids = getCheckedRows(row, 20);
	if (ids != null) {
		//alert(ids);
		doUsersPost(url, ids, name);
	}
}

//取消用户的黑名单
function unblackusers() {
	var url = "/wxuser/unblackusers";
	var name = "取消黑名单";
	var row = $('#users-datagrid').datagrid('getChecked');
	var ids = getCheckedRows(row, 20);
	if (ids != null) {
		doUsersPost(url, ids, name);
	}
}

//判断选择的行，并拼接所选择行的ids,row行的数据,num:每次做多能操作的行数,如返回null则选择有误.
function getCheckedRows(row, num) {
	if (row != '' && row != null) {
		if (row.length > num) {
			$.messager.alert('提示', '一次最多能操作' + num + '位用户', 'info');
			return null;
		}
		var ids = '';
		for (var i = 0; i < row.length - 1; i++) {
			ids +=row[i].ids + ",";
		}
		ids += row[row.length - 1].ids ;
		return ids;
	} else {
		$.messager.alert('提示', '请选择要操作的行', 'info');
		return null;
	}
}

//post提交请求,url:路径,ids:拼接的ids字符串,name:该操作的名称
function doUsersPost(url, ids, name) {
	$.messager.confirm('操作确认', '确定要将以上用户' + name + '吗？', function(r) {
		if (r) {
			$.post(url, {
				'ids' : ids
			}, function(result) {
				if (result == 200) {
					$.messager.alert('提示消息', name + '成功！', 'info');
					$('#users-datagrid').datagrid('reload');
				} else if (result.errmgs) {
					$.messager.alert('提示消息', result.errmgs, 'error');
				} else {
					$.messager.alert('提示消息', name + '失败！', 'error');
				}
			}, 'json');
		}
	});
}






// 给用户取消标签
function untaggingUsers() {
	$('#Users-edit-form').form('clear');
	var row = $('#Users-datagrid').datagrid('getSelected');
	if (row <= 0) {
		$.messager.alert('提示', '请选择要编辑的标签!');
	} else {
		$('#Users-edit-dialog').dialog('open').dialog('setTitle', '编辑标签');
		$('#Users-edit-form').form('load', row);
		url = '/wxuserUsers/updateUsers';
	}
}

// 删除
function deleteUsers() {
	var row = $('#Users-datagrid').datagrid('getSelected');

	if (row <= 0) {
		$.messager.alert('提示', '请选择要删除的标签', 'info');
		return;
	}

	if (row.fansnum > 100000) {
		$.messager.alert('提示', '该标签用户超过10W个,无法直接删除,请先解绑标签', 'info');
		return;
	}

	$.messager.confirm('操作确认', '确定要删除此标签吗？', function(r) {
		if (r) {
			$.post('wxuserUsers/deletetagbyid', {
				ids : row.ids
			}, function(result) {
				if (result == 200) {
					$.messager.alert('删除消息', '删除成功！', 'info');
					$('#Users-datagrid').datagrid('reload');
				} else if (result.errmgs) {
					$.messager.alert('删除消息', result.errmgs, 'error');
				} else {
					$.messager.alert('删除消息', '删除失败！', 'error');
				}
			}, 'json');
		}
	});

}


// 加载分类名称
function loadClassName() {
	$.ajax({
		url : '/goodsCheck/reqGoodsClassName',
		type : "GET",
		success : function(data) {
			data = eval("(" + data + ")");
			$('#_className').combobox({
				valueField : 'name',
				textField : 'name',
				data : data.rows,
			})
		}
	});
}


$(function() {
	//先加载页面后,再显示页面
	//$('#user_easyui-layout').attr('hidden',false)
	
	$('#selectusertags').combobox({
	     url:'/advertise/findAdPostionAll',
	     method:'GET',
	     valueField:'ids',
		 textField:'name'
		});

	// //日期验证
	// $.extend($.fn.validatebox.defaults.rules, {
	// equaldDate: {
	// validator: function (value, param) {
	// var start = $(param[0]).datetimebox('getValue'); //获取开始时间
	// return value > start; //有效范围为当前时间大于开始时间
	// },
	// message: '结束日期应大于开始日期!' //匹配失败消息
	// }
	// });

});