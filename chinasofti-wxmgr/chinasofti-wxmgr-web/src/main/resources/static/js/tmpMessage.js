/**
 * 初始化
 */
$(document).ready(function() {
	list();

});
var flag = "0";

/**
 * 表格
 */
function list(){
	
	$("#message-datagrid").datagrid({
		url : "message/getList",
		height : 400,
		rownumbers : true,
		singleSelect : true,
		pageSize : 20,
		pagination : true,
		// 允许多列排序
		multiSort : true,
		// 自动伸缩
		fitColumns : true,
		columns : [ [ {
			field : 'message_id',
			title : 'id',
			width : 20,
			sortable : true,
			checkOnSelect:false,
			hidden:true
		}, {
			field : 'rule_name',
			title : '规则名称',
			width : 100,
			sortable : true,
			align:'center'
		},  {
			field : 'key_words',
			title : '关键词',
			width : 100,
			align:'center'
		},{
			field : 'content',
			title : '内容',
			width : 100,
			align:'center'
		}, {
			field : 'opertion',
			title : '操作',
			width : 100,
			align:'center'
			
		}] ]
	});
}

//赋值给input的 message_id
function setId(){
	alert();
	var message_id="";
	var  row= $("#message-datagrid").datagrid("getSelected");
	message_id = row.message_id;
	$("#message_id").val(message_id);
};
//增加
$("#save").click(function(){
	flag = "0";
	var url="message/add";
	 $("#editform").form("submit",{
		url:url,
		onSubmit:function(){
			//表单验证
		},
		
		success:function(data){
			//console.log(data);
			
			/*  data=eval("("+data+")");//转json
			if(data.success){
				$.message.show({
					title:"提示",
					msg:"保存成功"
					+
				});
			}  */ 
			$('#editwin').window('refresh', list());  
			//list();
			$('#editwin').window('close');
		},
		onLoadSuccess:function(data){
			//
			
		}
	}); 
});
//修改
$("#updatesave").click(function(){
	var url="message/edit";
	setId();
	 $("#updateform").form("submit",{
		url:url,
		onSubmit:function(){
			//表单验证
		},
		
		success:function(data){
			//console.log(data);
			
			/*  data=eval("("+data+")");//转json
			if(data.success){
				$.message.show({
					title:"提示",
					msg:"保存成功"
					+
				});
			}  */ 
			$('#editwin').window('refresh', list());  
			$('#updatewin').window('close');
		},
		onLoadSuccess:function(data){
			//
			
		}
	}); 
});

/**
 * 消息新增，打开窗口编辑框
 */
function message_add() {
	$("#editwin").window("open");
}



/**
 * 消息内容更改
 */
function message_edit() {
	$("#updatewin").window("open");
}

/**
 *消息删除 
 */

function message_remove() {
	var message_id="";
	var  row= $("#message-datagrid").datagrid("getSelected");
	 message_id = row.message_id;
	$.ajax({
		url:"message/delete",
		type:"post",
		data:{"message_id":message_id},
		dataType:"json",
		success:function(data){
			$('#editwin').window('refresh', list());  
		},
		error:function(){
			
		}
	});
}


/**
 * 过滤搜索
 */
function search_message(){
	alert();
	
	
}
