// 搜索
function tags_search() {
	$("#tags-datagrid").datagrid("load", {
		'name' : $('#tags_search_name').val()
	});
}

// 将微信服务器的标签同步到本地数据库
function synchroTags(){
	
	$.messager.confirm('操作确认', '确定要同步标签吗？', function(r) {
		if(r){
			$.post('wxusertags/synchrotags', {}, function(result) {
				if (result == 200) {
					$.messager.alert('同步消息', '同步成功！', 'info');
					$('#tags-datagrid').datagrid('reload');
				} else {
					$.messager.alert('同步消息', '同步失败！', 'error');
				}
			}, 'json');
		}
	});
}

// 清空搜索框
function tags_clear() {
	$("#tags_search").form('reset');
	$('#tags-datagrid').datagrid('load', {});
}

// 添加
function addTags() {
	$('#tags-edit-dialog').dialog('open').dialog('setTitle', '添加标签');
	$('#tagsid_tr').prop("hidden",'hidden');
	$('#tags-edit-form').form('clear');
	//重名
	$('#tag_name_check_font').attr('hidden',true);
	$('#tags_add_button').linkbutton('enable');
	// 清空预览图片
	tagName="";
	url = '/wxusertags/addtags';
}
// 编辑
function editTags() {
	$('#tags-edit-form').form('clear');
	$('#tagsid_tr').prop("hidden",false);
	//重名提示
	$('#tags_add_button').linkbutton('enable');
	$('#tag_name_check_font').attr('hidden',true);
	var row = $('#tags-datagrid').datagrid('getSelected');
	tagName=row.name;
	//alert(tagName);
	if (row <= 0) {
		$.messager.alert('提示', '请选择要编辑的标签!');
	} else {
		$('#tags-edit-dialog').dialog('open').dialog('setTitle', '编辑标签');
		$('#tags-edit-form').form('load', row);
		url = '/wxusertags/updatetags';
	}
}
// 保存
function saveTags() {
	$('#tags-edit-form').form('submit', {
		url : url,
		onSubmit : function() {
			return $(this).form('validate');
		},
		success : function(result) {
			if (result != 200) {
				$.messager.alert('添加消息', '添加失败！', 'error');
			} else {
				$('#tags-edit-dialog').dialog('close'); // close the dialog
				$('#tags-datagrid').datagrid('reload'); // reload the user data
				$.messager.alert('添加消息', '添加成功！', 'info');
			}
		}
	});
}
// 删除
function deleteTags() {
	var row = $('#tags-datagrid').datagrid('getSelected');

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
			$.post('wxusertags/deletetagbyid', {
				ids : row.ids
			}, function(result) {
				if (result == 200) {
					$.messager.alert('删除消息', '删除成功！', 'info');
					$('#tags-datagrid').datagrid('reload');
				} else if (result.errmgs) {
					$.messager.alert('删除消息', result.errmgs, 'error');
				} else {
					$.messager.alert('删除消息', '删除失败！', 'error');
				}
			}, 'json');
		}
	});
}


$(function() {
	//绑定防止同名校验
	$('#tag_name_id').blur(function(){
		var url='wxusertags/checktagname';
		var name = $('#tag_name_id').val();
		$.post(url,{'name':name},function(r){
			if(r==200){
				$('#tag_name_check_font').attr('hidden',false);
				$('#tags_add_button').linkbutton('disable');
			}else{
				$('#tag_name_check_font').attr('hidden',true);
				$('#tags_add_button').linkbutton('enable');
			}
		},'json');
	});
	
	
	//加载完毕后,显示div
	//$('#tags_easyui-layout').attr('hidden',false)

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