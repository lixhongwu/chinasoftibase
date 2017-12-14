
<script type="text/javascript" src="js/common.js"></script>

<div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'center',border:false">
		<!-- 工具栏 -->
		<div id="message_toolbar">
			<div class="wu-toolbar-button">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" id="send">发送</a> <a href="#" class="easyui-linkbutton"
					iconCls="icon-refresh" id="synchr" plain="true">同步</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-add1" id="userSelected"
					plain="true">用户选择</a> <input type="text"
					style="position: absolute; right: 120px;" id="titleText" /> <a href="#"
					class="easyui-linkbutton" iconCls="icon-search"
					style="position: absolute; right: 25px;" onclick="searchByTitle()" >标题搜索</a>

			</div>
		</div>

		<!-- datagrid表格 -->
		<div id="tmpMessage-datagrid"></div>

		<!-- 详情列表 -->
		<div id="detailWin" class="easyui-window"
			data-options="closed:true ,width:450,height:280 ,title:'详情'">
			<table>
				<tr>
					<td>模板ID</td>
					<td><input type="text" id="val1" style="width: 350px;"
						readonly="true " /></input></td>
				</tr>
				<tr>
					<td>内容</td>
					<td><textarea type="text" id="val2"
							style="width: 350px; height: 180px;"></textarea></td>
				</tr>
			</table>
		</div>

		<!-- 发送列表 -->
		<div id="sendWin" class="easyui-window"
			style="height: 150px; width: 310px;"
			data-options="closed:true  ,title:'详情(*请确认所要发送的用户是否正确！)'">
			<form action="" id="sendForm" method="post">
				<table id="tableValue">
				</table>
				<div style="position: absolute; right: 25px;">
					<a id="sendInfo" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-save'" plain="true">发送</a>
				</div>
			</form>

		</div>
		<!-- 用户列表弹窗 -->
		<div id="userWin" class="easyui-dialog"
			data-options="closed:true ,width:450,height:280 ,title:'用户信息'">
			<table id="user-datagrid"></table>
		</div>
		<input type="hidden" id="openid" /> <input type="hidden"
			id="username" />

	</div>
</div>





<script type="text/javascript">
	$("#tmpMessage-datagrid")
			.datagrid(
					{
						url : "message/getTemplateList",
						height : 400,
						width:1000,
						rownumbers : true,
						singleSelect : true,
						pageSize : 20,
						pagination : true,//底部显示分页栏
						// 允许多列排序
						multiSort : true,
						// 自动伸缩
						//fitColumns : true,
						columns : [ [
								{
									field : 'rowNum',
									title : '序号',
									width : 100,
									sortable : true,
									align : 'center'
								},
								{
									field : 'template_id',
									title : '模板ID',
									width : 400,
									sortable : true,
									align : 'center'
								},
								{
									field : 'title',
									title : '标题',
									width : 350,
									sortable : true,
									align : 'center'
								},
								/* {
									field : 'industry1',
									title : '一级行业',
									width : 100,
									align : 'center'
								},
								{
									field : 'deputy_industry',
									title : '二级行业',
									width : 100,
									align : 'center'
								}, */
								{
									field : 'opertion',
									title : '操作',
									width : 100,
									align : 'center',
									formatter : function(value, row, index) {
										var id = row.template_id;
										if (value == "" || value == undefined) {
											return "<a href='javascript:void(0);'><span style='color:blue' onclick="
													+ "openDetail('"
													+ id
													+ "') >详情</span></a>";
										} else {
											return value;
										}
									}
								}

						] ]
					});

	//详情信息
	function openDetail(template_id) {
		$("#detailWin").window("open");

		$.ajax({
			url : 'message/getTemplateContent',
			type : 'POST',
			data : {
				"template_id" : template_id
			},
			dataType : 'json',
			success : function(data) {
				putValue(data);
			}
		});
	}

	function putValue(data) {
		var json = eval(data);
		$.each(data, function(index, obj) {
			var templateID = data[index].templateID;
			var templateContent = data[index].templateContent;

			$("#val1").val(templateID);
			$("#val2").val(templateContent);
		});
	}
	//发送模板
	$("#send")
			.click(
					function() {
					 	var	openid=$("#openid").val();
						if(openid !=""){
							var row = $("#tmpMessage-datagrid").datagrid(
							"getSelected");
							if (row == null) {
								alert("请选择一行！");
								return;
							} else {
								var content = row.content;
								var template_id = row.template_id;
								var str = content.split("}}");
								var num = str.length - 3;
								var newContent = content.replace("{{first.DATA}}",
										"").replace("{{remark.DATA}}", "");
								for (var i = 1; i <= num; i++) {
									var ms = "{{keyword" + i + ".DATA}}";
									newContent = newContent.replace(ms, ",");
								}
								var kk = newContent.split(",");
								var table = "";
								var sumTd = 0;
								for (var i = 0; i < kk.length - 1; i++) {
									var mid = "keyword" + (i + 1);
									table += "<tr><td>"
											+ kk[i]+":"
											+ "</td> <td><input type='text' style='width:150px;' name='"+mid+"'/>"
											+ "</td></tr>";
									sumTd++;
								}
								var username = $("#username").val();
								$("#tableValue")
										.html(
												"<tr><td>用户名</td><td><input readonly='true' value='"+username+"' name='username' style='width:150px;'/></td></tr><tr><td>模板ID</td><td><input readonly='true' value='"+template_id+"' name='template_id' style='width:150px;'/></td></tr><tr><td>URL</td><td><input  name='url' style='width:150px;'/></td></tr><tr><td>通知标题:</td><td> <input id='first' name='first' style='width:150px;'/></td></tr>"
														+ table
														+ "<tr><td >结束语:</td><td> <input id='remark' name='remark' style='width:150px;'/></td></tr>"+
														"<input type='hidden' name='openid' style='width:150px;' value='"+openid+"'/>");
							}
							//重置div高度
							//sumTd+3  输入框的数量
							var h = (sumTd+5) * 25 + 40;
							$("#sendWin").height(h);
							$("#sendWin").window("open");
						}else{
							alert("请先选择一个用户");
							return;
						}
						
					});
	
		
	//发送消息
 	$("#sendInfo").click(function(){
		//alert();
		$('#sendForm').form('submit', {    
		    url:'message/sendTemplateInfo',    
		    onSubmit: function(){    
		        // do some check    
		        // return false to prevent submit;    
		    },    
		    success:function(data){ 
		    	$("#sendWin").window("close");
		    }    
		});  
	}); 
	
	//同步微信服务器数据到本地数据库
	$("#synchr").click(function(){
		$.ajax({
			url:'message/refresh',
			type:"POST",
			dataType:"json",
			data:{},
			success:function(){
				//重载表格
				$('#tmpMessage-datagrid').datagrid('reload');   
			},
			error:function(){
				//重载表格
				$('#tmpMessage-datagrid').datagrid('reload');
			}
		});
	});
	
	//获取用户列表
	$("#userSelected").click(function(){
		//弹个窗
		 $('#userWin').dialog({    
		    title: '用户选择',    
		    width: 500,    
		    height: 310,    
		    closed: false,    
		    cache: false,    
		    modal: true ,
		    toolbar:[{
		    	text:"确定",
		    	iconCls:'icon-save',
		    	handler:function(){
		    		selected()
		    	}
		    }]
		});  
		//$("#userWin").window("open");
		$("#user-datagrid").datagrid({
			 url:'message/userList', 
			 	height : 240,
				rownumbers : true,
				singleSelect : true,
				pageSize : 20,
				pagination : true,//底部显示分页栏
				// 允许多列排序
				multiSort : true,
				// 自动伸缩
				fitColumns : true,
			    columns:[[    
			        {field:'nickname',title:'Name',width:100,align:'center'},    
			        {field:'openid',title:'openid',width:200,align:'center'}    
			    ]]
		});
	});
	
	//点击确定，赋值并关闭
	function selected(){
		var row = $("#user-datagrid").datagrid(
		"getSelected");
	if(row == null){
		alert("请选择一行！");
		return;
	}else{
	 	openid = row.openid;
	 	$("#openid").val(openid);
	 	$("#username").val(row.nickname);
	}
	$("#userWin").dialog("close");
}
	
	function searchByTitle(){
		var titleText = $("#titleText").val();
		$("#tmpMessage-datagrid")
		.datagrid(
				{
					url : "message/searchByTitle",
					height : 400,
					rownumbers : true,
					singleSelect : true,
					pageSize : 20,
					queryParams:{titleText:titleText},
					pagination : true,//底部显示分页栏
					// 允许多列排序
					multiSort : true,
					// 自动伸缩
					fitColumns : true,
					columns : [ [
							{
								field : 'rowNum',
								title : '序号',
								width : 50,
								sortable : true,
								align : 'center'
							},
							{
								field : 'template_id',
								title : '模板ID',
								width : 100,
								sortable : true,
								align : 'center'
							},
							{
								field : 'title',
								title : '标题',
								width : 100,
								sortable : true,
								align : 'center'
							},
							/* {
								field : 'industry1',
								title : '一级行业',
								width : 100,
								align : 'center'
							},
							{
								field : 'deputy_industry',
								title : '二级行业',
								width : 100,
								align : 'center'
							}, */
							{
								field : 'opertion',
								title : '操作',
								width : 50,
								align : 'center',
								formatter : function(value, row, index) {
									var id = row.template_id;
									if (value == "" || value == undefined) {
										return "<a href='javascript:void(0);'><span style='color:blue' onclick="
												+ "openDetail('"
												+ id
												+ "') >详情</span></a>";
									} else {
										return value;
									}
								}
							}

					] ]
				});
	}
</script>

