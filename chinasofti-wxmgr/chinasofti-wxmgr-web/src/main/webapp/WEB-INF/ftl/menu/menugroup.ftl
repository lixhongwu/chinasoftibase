<script type="text/javascript" src="js/common.js"></script>
<!-- 显示菜单组表格 -->
<div class="easyui-layout" data-options="fit:true">
	<!-- 菜单组的toolbar -->
	<div id="user-toolbar-2">
		<div class="user-toolbar-button">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add"onclick="openAdd()" plain="true">添加</a>
			<a href="#"class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()"plain="true">修改</a>
			<a href="#" class="easyui-linkbutton"iconCls="icon-remove" onclick="remove()" plain="true">删除</a> 
			<a href="#"class="easyui-linkbutton" iconCls="icon-excel"onclick="submitMenu()" plain="true">将该组菜单刷新至微信服务器</a>
		</div>
		<div class="user-toolbar-search">
			<label>用户名：</label> <input type="text" id="name" name="name" /> <a
				href="#" class="easyui-linkbutton" iconCls="icon-search"
				onclick="doSearch()">开始检索</a>
		</div>
	</div>

	<!-- 显示数据,数据表格列对齐 -->
	<table id="tbMenuGroup" class="easyui-datagrid" title="微信组名称列表"
		data-options="singleSelect:true,collapsible:true,url:'',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'ids',width:250,align:'center'">微信组ID</th>
				<th data-options="field:'title',width:200,align:'center'">微信菜单组名称</th>
				<th data-options="field:'isShow',width:200,align:'center'">是否为微信当前使用菜单</th>
				<th data-options="field:'appid',width:300,align:'center'">菜单组描述</th>
				<th align="center"data-options="field:'level',width:100,formatter:menuView2">查看</th>
			</tr>
		</thead>
	</table>
	<div id="pagination"
		style="background: #efefef; border: 1px solid #ccc;"></div>
	<!-- 显示菜单组结束 -->
		
	<!-- 显示菜单 -->
	<div id="menuDialog" title="菜单页面" class="easyui-dialog"data-options="closed:true,draggable:false,inline:true"style="width: 100%; height: 100%">
		<div id="menu-toolbar">
			<div class="menu-toolbar-button">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"onclick="openAddLevelOneMenu()" plain="true">添加一级菜单</a>
				<a href="#"class="easyui-linkbutton" iconCls="icon-excel"onclick="submitMenu()" plain="true">将该组菜单刷新至微信服务器</a>
			</div>
		</div>
		<form id="menuForm" action="">
		<!-- 显示数据,数据表格列对齐 -->
		<table id="menuTable" class="easyui-treegrid" 
			data-options="method: 'get',rownumbers: true,showFooter: true,idField:'id',treeField:'title' ">
	</table>
	</form>
	</div>
</div>

<!-- 一级菜单添加表格 -->
<div id="menuAddDialog"  class="easyui-dialog"data-options="closed:true,iconCls:'icon-save'"style="width: 500px; heigh:400px; padding: 10px">
	<form id="menuAddForm" method="post">
		<table id="addOne">
			<tr>
				<td width="100" align="right">一级菜单名称:</td>
				<td><input type="text" id="title" name="title"  /></td>
			</tr>
			<tr>
			<td width="100" align="right">菜单类型:</td>
				<td><input type="radio" id="menuurl" name="menutype" onclick="url.disabled='';keyword.disabled='disabled';" />跳转页面</td>
			</tr>
			<tr>
				<td width="100" align="right"></td>
				<td><input type="radio" id="menuclick" name="menutype" onclick="keyword.disabled='';url.disabled='disabled';" />发送消息</td>
			</tr>
			<tr>
			<td width="100" align="right">URL链接：</td>
				<td><input type="text" id="url" name="url" style="width:250px;"/>
				</td>
			</tr>
			<tr>
				<td width="100" align="right">关键字：</td>
				<td><input type="text" id="keyword"  name="keyword" />
				</td>
			</tr>
			<tr>	
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="sort" name="sort" class="easyui-textbox" /></td>
			</tr>
			<input type="hidden" id ="addMenuGid" name ="gid" >
			<input  type="hidden" id ="addMenuPid" name ="pid" >
		</table>
	</form>
</div>


<!-- 二级菜单添加表格 -->
<div id="menuTwoAddDialog"  class="easyui-dialog"data-options="closed:true,iconCls:'icon-save'"style="width: 500px; heigh:400px; padding: 10px">
	<form id="menuTwoAddForm" method="post">
		<table id="addTwo">
			<tr>
				<td width="100" align="right">一级菜单名称:</td>
				<td><input type="text" id="title" name="title" value="" disabled="disabled" /></td>
			</tr>
			<tr>
				<td width="100" align="right">二级菜单名称:</td>
				<td><input type="text" id="title" name="title"  /></td>
			</tr>
			<tr>
			<td width="100" align="right">菜单类型:</td>
				<td><input type="radio" id="menuTwoUrl" name="menutype" onclick="url.disabled='';keyword.disabled='disabled';" />跳转页面</td>
			</tr>
			<tr>
				<td width="100" align="right"></td>
				<td><input type="radio" id="menuclick" name="menutype" onclick="keyword.disabled='';url.disabled='disabled';" />发送消息</td>
			</tr>
			<tr>
			<td width="100" align="right">URL链接：</td>
				<td><input type="text" id="url" name="url" style="width:250px;"/>
				</td>
			</tr>
			<tr>
				<td width="100" align="right">关键字：</td>
				<td><input type="text" id="keyword"  name="keyword" />
				</td>
			</tr>
			<tr>	
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="sort" name="sort" class="easyui-textbox" /></td>
			</tr>
			<input type="hidden" id ="addTwoMenuGid" name ="gid" >
			<input  type="hidden" id ="addTwoMenuPid" name ="pid" >
		</table>
	</form>
</div>

<!-- 菜单组添加表格 -->
<div id="menuGroupAddDialog" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px">
	<form id="menuGroupAddForm" method="post">
		<table id="add">
			<tr>
				<td width="100" align="right">微信菜单组名称:</td>
				<td><input type="text" id="title" name="title"
					class="user-text" /></td>
			</tr>
			<tr>
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="sort" name="sort" class="user-text" /></td>
			</tr>
			<tr>
				<td width="100" align="right">菜单组描述:</td>
				<td><textarea rows="3" cols="25" name="appid"></textarea></td>
			</tr>
		</table>
	</form>
</div>

<!-- 修改菜单组表格 -->
<div id="menuGroupEditDialog" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px;">
	<form id="menuGroupEditForm" method="post">
		<table id="update">
			<tr>
				<td width="100" align="right">微信菜单组名称:</td>
				<td><input type="text" id="title" name="title"class="user-text" /></td>
			</tr>
			<tr>
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="sort" name="sort" class="user-text" /></td>
			</tr>
			<tr>
				<td width="100" align="right">菜单组描述:</td>
				<td><textarea rows="3" cols="25" name="appid"></textarea></td>
			</tr>
			<tr>
				<td><input type="text" id="ids" hidden="hidden" name="ids" class="user-text" /></td>
			<tr>
		</table>
	</form>
</div>


<!-- End of easyui-dialog -->
<script type="text/javascript">
	$(function() {
		// 获取表格datagrid的ID属性
		var tableID = $("table.easyui-datagrid").attr("id");
		//获取分页工具条元素
		var pageId = $('#pagination');
		//此处设置自己的url地址
		var url = '/wxmenu/grouplist';
		tdload(tableID, pageId, url);

	});


	function submitMenu() {

	}
	//查看菜单
	function menuView2(value, row, index) {
		var lookBtn ='<button style="background:#51A351" onclick="menuView(\''+ row.ids + '\')">' 
		+ '<span style="color: #FFFFFF">查看</span></button>';
		return lookBtn;
	}
    
	//定义全局变量,菜单组的ids;
	var menugruopids;
	//查看菜单详情
	function menuView(ids) {
		//将菜单组ids赋值为全局变量
		menugruopids =ids;
		$('#menuTable').treegrid({    
		    url:'wxmenu/menulist/'+ids,
		    type:'get',
		    idField:'id',    
		    treeField:'title', 
		     columns:[[{
		    	title:'菜单级别',
		    	field:'level',
		    	formatter: 
		    	function(value,row,index){
					if (value==1){
						return "<b><span style='color:#2B2B2B'>一级菜单</span></b>";
					} else {
						return "<span style='color:#AAAAAA'>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp二级菜单</span>";
					}
				},width:100 },
	              {title:'菜单名称',field:'title',width:180},
	              {field:'keyword',title:'关键字',width:80,align:'center'},    
	              {field:'url',title:'菜单链接',width:320},
	              {field:'sort',title:'排序',width:40,align:'center'},
	              {
	  		    	title:'操作',
	  		    	field:'id',
	  		    	align:'left',
	  		    	formatter: 
	  		    	function(value,row,index){
	  					if (value<5){
	  						return  "<input type='button' value='编辑' onclick='openEditMenu()' >&nbsp&nbsp&nbsp&nbsp<input type='button' value='删除' onclick='deleteMenu()' >&nbsp&nbsp<input type='button' value='添加二级菜单' onclick='openAddLevelTwoMenu()' >" ;
	  					} else {
	  						return "<input type='button' value='编辑' onclick='openEditMenu()' >&nbsp&nbsp&nbsp&nbsp<input type='button' value='删除' onclick='deleteMenu()' >" ;
	  					}
	  				},width:240 },
		          ]]   
		});  
		$('#menuDialog').dialog("open");

	}
	
	//编辑菜单
	
	function openEditMenu(){
		alert("editMenu");
		
	}
	
	//删除菜单
	function deleteMenu(){
		
		//$('#menuTable').treegrid('select');
		
		var items = $('#menuTable').treegrid('getSelected');
		var ids = [];
		 if (items.length < 1) {
			$.messager.alert('温馨提醒', '请选中要删的数据');
			return;
		} 
		$.messager.confirm('信息提示', '确定要删除该记录？', function(result) {
			if (result) {
				$(items).each(function() {
					ids.push(this.ids);
				});
				//alert(ids);
				$.ajax({
					url : '/wxmenu/deleteMenu/' + ids,
					type : 'POST',
					success : function(data) {
						if (data == 200) {
							$.messager.alert('信息提示', '删除成功！', 'info');
							$('#menuTable').treegrid('reload')
							//$('#pagination').pagination('select');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
					}
				});
			}
		});
	}
	
	//打开添加一级菜单
	function openAddLevelOneMenu(){
		
		var item= $('#menuTable').treegrid('getRoots');
		
		if(item.length < 3){
			
			$('#menuAddForm').form('clear');
			$('#addMenuGid').val(menugruopids);
			$('#addMenuPid').val(menugruopids);
			$('#menuAddDialog').dialog({
				closed : false,
				modal : true,
				title : "添加信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : addLevelOneMenu
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuAddDialog').dialog('close');
					}
				} ]
			});
			$('#menuurl').click();
		}else{
			$.messager.alert('信息提示', '最多只能添加三个一级菜单！', 'info');
		}
	}
	//添加一级菜单
	function addLevelOneMenu(){
		
		$('#menuAddForm').form('submit', {
			url : '/wxmenu/addmenu',
			type : 'POST',
			success : function(data) {
				//alert(data);
				if (data > 0) {
					$('#menuTable').treegrid('reload');
					$('#menuAddDialog').dialog('close');
					$.messager.alert('信息提示', '提交成功！', 'info');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
		
	}
	
	//打开添加二级菜单
	function openAddLevelTwoMenu(){
		
		var node = $('#menuTable').treegrid('getSelected');
		//alert(node.id);
		
		//alert(JSON.stringify(node));
		
		var item= $('#menuTable').treegrid('getChildren',node.id);
		alert(item.length);
		if(item.length <4 ){
			
			$('#menuTwoAddForm').form('clear');
			$('#addTwoMenuGid').val(menugruopids);
			$('#addTwoMenuPid').val(menugruopids);
			$('#menuTwoAddDialog').dialog({
				closed : false,
				modal : true,
				title : "添加信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : addLevelOneMenu
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuTwoAddDialog').dialog('close');
					}
				} ]
			});
			$('#menuTwoUrl').click();
		}else{
			$.messager.alert('信息提示', '最多只能添加五个二级菜单！', 'info');
		}
	}
	
	//添加二级菜单
	function addLevelTwoMenu(){
		alert("添加二级菜单");
	}

	/**
	 * Name 添加菜单组记录
	 */
	function add() {

		$('#menuGroupAddForm').form('submit', {
			url : '/wxmenu/addmenugroup',
			type : 'POST',
			success : function(data) {
				//alert(data);
				if (data > 0) {
					$('#pagination').pagination('select');
					$('#menuGroupAddDialog').dialog('close');
					$.messager.alert('信息提示', '提交成功！', 'info');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/**
	 * Name 删除菜单组记录
	 */
	function remove() {
		var items = $('#tbMenuGroup').datagrid('getSelections');
		var ids = [];
		if (items.length < 1) {
			$.messager.alert('温馨提醒', '请选中要删的数据');
			return;
		}
		$.messager.confirm('信息提示', '确定要删除该记录？', function(result) {
			if (result) {
				$(items).each(function() {
					ids.push(this.ids);
				});
				$.ajax({
					url : '/wxmenu/deleteMenuGroup/' + ids,
					type : 'POST',
					success : function(data) {
						if (data == 200) {
							$.messager.alert('信息提示', '删除成功！', 'info');
							$('#tbMenuGroup').datagrid('reload')
							$('#pagination').pagination('select');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
					}
				});
			}
		});
	}

	/**
	 * Name 打开添加菜单组窗口
	 */
	function openAdd() {
		$('#menuGroupAddForm').form('clear');
		$('#menuGroupAddDialog').dialog({
			closed : false,
			modal : true,
			title : "添加信息",
			buttons : [ {
				text : '确定',
				iconCls : 'icon-ok',
				handler : add
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#menuGroupAddDialog').dialog('close');
				}
			} ]
		});
	}

	/**
	 * Name 打开修改窗口
	 */
	function openEdit() {
		var row = $("#tbMenuGroup").datagrid('getSelected');
		if (row) {
			//alert(JSON.stringify(row));
			$('#menuGroupEditDialog').dialog('open').dialog({
				closed : false,
				modal : true,
				title : "修改订单信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : edit
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuGroupEditDialog').dialog('close');
					}
				} ]
			});
			$('#menuGroupEditForm').form('load', row);
		} else {
			$.messager.alert('信息提示', '请选中要修改的数据');
		}
	}

	/*
	 *修改
	 */
	function edit() {
		$('#menuGroupEditForm').form('submit', {
			url : '/wxmenu/updatemenugroup',
			type : 'POST',
			//data:$('#menuEditForm').serialize(),
			success : function(data) {
				//alert(data);
				if (data == 200) {
					$.messager.alert('信息提示', '提交成功！', 'info');
					$('#menuGroupEditDialog').dialog('close');
					$('#pagination').pagination('select');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/* 
	 *查询
	 */
	function doSearch() {
		$.ajax({
			type : 'POST',
			url : '/user/list', //用户请求数据的URL
			data : {
				'usernames' : $('#usernames').val(),
				'departmentnames' : $('#departmentnames').val(),
				'pageNumber' : 1,
				'pageSize' : 10
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert(textStatus);
			},
			success : function(data) {
				data = eval("(" + data + ")");
				$('#tbMenuGroup').datagrid('loadData', data.rows);
				$('#pagination').pagination({
					total : data.total
				});
			}
		});
	}

	/*
	 *清除搜索框内容
	 */
	function doClear() {
		document.getElementById("departmentnames").value = "";
		document.getElementById("usernames").value = "";
	}
</script>


