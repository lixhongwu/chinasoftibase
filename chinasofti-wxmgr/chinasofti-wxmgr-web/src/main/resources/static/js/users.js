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







// 给用户添加标签
function  taggingUsers() {
	$('#Users-edit-dialog').dialog('open').dialog('setTitle', '添加标签');
	$('#Users-edit-form').form('clear');
	// 清空预览图片
	url = '/wxuserUsers/addUsers';
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