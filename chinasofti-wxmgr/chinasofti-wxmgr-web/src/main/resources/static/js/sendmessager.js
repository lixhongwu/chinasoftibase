$('#content').textbox({    
    iconCls:'icon-man', 
    multiline : true
})
$('#send').linkbutton({    
    iconCls: 'icon-ok'   
}); 


$("#userSelect").click(function(){
	$('#userlist').dialog({    
	    title: '用户列表',    
	    width: 600,    
	    height: 400,    
	    closed: false,    
	    cache: false,    
	    modal: true,
	    toolbar:[{
	    	text:'确定',
	    	iconCls:'icon-save',
	    	handler:function(){
	    		var data  = $('#usertable').datagrid("getSelected");
	    		var openId = data.openid;
	    		//alert(openId);
	    		$("#openid").val(openId);
	    		//关闭
	    		$("#userlist").dialog("close");
	    	}
	    }]
	}); 
	$('#usertable').datagrid({    
	    url:'kefu/findUserByPage',
		rownumbers:true,
		singleSelect:true,
		pageSize:20,           
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
	    columns:[[    
	        {field:'id',title:'序号',width:50},    
	        {field:'nickname',title:'昵称',width:100},    
	        {field:'openid',title:'用户id',width:150,align:'right'}    
	    ]]    
	});
});

$("#messager_type").bind("change",function(){
	var val = $('#messager_type').val();
//	var text1 = "<input id='content' name='content' type='text' style='width:300px' >&nbsp;&nbsp; ";
//	var text2 = "<input id='content' name='content' type='text' style='width:300px' readonly='true'>&nbsp;&nbsp; "
	if(val == 1){
//		$("#textContent").html(text1);
	}else if(val == 0){
//		$("#textContent").html(text2);
		 $('#materiallist').datagrid({
				url:'wxmaterial/findAll',
				rownumbers:true,
				singleSelect:true,
				pageSize:20,           
				pagination:true,
				multiSort:true,
				fitColumns:true,
				fit:true,
				columns:[[
					{ field:'mediaId',title:'文件编号',width:100,sortable:true},
					{ field:'fileName',title:'文件名称',width:180,sortable:true},
					{ field:'createTime',title:'创建时间',width:100,formatter: function(value,row,index){
						if (value != null){
							return new Date(parseInt(value)).toLocaleString().replace(/:\d{1,2}$/,'');
						} else {
							return "";
						}
					}
	},
					{ field:'flag',title:'素材类型',width:100,formatter: function(value,row,index){
						if (value == 0){
							return "临时素材";
						} else {
							return "永久素材";
						}
					}},
					{ field:'filePath',title:'上传路径',width:100},
					{ field:'url',title:'文件路径',width:100}
				]],
				
			}); 

	}
});

/*$(document).ready(function(){
	var text1 = "<input id='content' name='content' type='text' style='width:300px'>&nbsp;&nbsp; ";
	$("#textContent").html(text1);
});*/

function sendAll(){

	var  meval = $("#messager_type").val();
	if(meval == ""){
		alert("请选择消息类型");
		return;
	}else if(meval == '1'){
		//判断是否选择了用户
		var usr = $("#openid").val();
		if(usr==""){
			alert("请选择一个用户");
			return;
		}else{
			//发送文本消息
			var content = $("#content").val();
			$("#sendForm").form('submit',{
				url: 'kefu/sendText',    
				onSubmit: function(){    
			    },    
			    success:function(data){    
//			        alert(data)    
			    }    
			});
		}
	}else if(meval == '0'){
		var usr = $("#openid").val();
		var data = $("#materiallist").datagrid("getSelected");
		if(data == null){
			alert("请选择一行");
			return;
		}
		if(usr==""){
			alert("请选择一个用户");
			return;
		}else {
			//发送素材消息
			var openid =$("#openid").val();
//			var media_id = data.mediaId;
			$("#mediaid").val(data.mediaId);
			var media_id = $("#mediaid").val();
//			alert(media_id);
			$("#sendForm").form('submit',{
				url: 'kefu/sendMessager',    
				onSubmit: function(){    
			    },    
			    success:function(data){    
//			        alert(data)    
			    }    
			});
		}
	}
}