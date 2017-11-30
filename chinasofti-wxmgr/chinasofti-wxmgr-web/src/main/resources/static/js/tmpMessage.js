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
		}] ]
	});
}

//赋值给input的 message_id
function setId(){
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
	var  row= $("#message-datagrid").datagrid("getSelected");
	if(row ==null){
		alert("请选择所需修改的数据！");
		return;
	}
	var rulename=row.rule_name;
	var keywords=row.key_words;
	var content=row.content;
	$("#rulename").val(rulename);
	$("#keywords").val(keywords);
	$("#content").val(content);
	$("#updatewin").window("open");
}

/**
 *消息删除 
 */

function message_remove() {
	var message_id="";
	var  row= $("#message-datagrid").datagrid("getSelected");
	if(row==null){
		alert("请选择所需删除的数据！");
		return;
	}
	 message_id = row.message_id;
	 $.messager.confirm('确认','你确认要删除记录吗？',function(r){
		 if(r){
			 $.ajax({
				 url:"message/delete",
				 type:"post",
				 data:{"message_id":message_id},
				 dataType:"json",
				 success:function(data){
				 },
				 error:function(){
					 
				 }
			 });
		 }
		 $('#editwin').window('refresh', list());  
	 });
}


/**
 * 过滤搜索
 */
function search_message(){
	var keyText = $("#keyText").val();
	$("#message-datagrid").datagrid({
		url : "message/searchBykey",
		height : 400,
		queryParams:{
			keyText: keyText,
			
		},

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
		}] ]
	});
	/*$.ajax({
		url:"message/searchBykey",
		data:{"keyText":keyText},
		type:"POST",
		dataType:"json",
		success:function(){
			//$('#message-datagrid').datagrid('reload');  
		}
	});*/
}
