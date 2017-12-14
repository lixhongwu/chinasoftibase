<script type="text/javascript" src="js/menu.js"></script>
<!-- 显示菜单组表格 -->
<div class="easyui-layout" id="menu_easyui-layout" data-options="fit:true">
	<!-- 菜单组的toolbar -->
	<div id="menu-toolbar-main">
		<div class="menu-toolbar-button">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add"onclick="openAdd()" plain="true">添加</a>
			<a href="#"class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()"plain="true">修改</a>
			<a href="#" class="easyui-linkbutton"iconCls="icon-remove" onclick="remove()" plain="true">删除</a> 
			<a href="#"class="easyui-linkbutton" iconCls="icon-excel"onclick="synchroMenu()" plain="true">同步微信菜单至本地服务器</a>
		</div>
	</div>
	<!-- 显示数据,数据表格列对齐 -->
	<table id="menu-datagrid" class="easyui-datagrid" toolbar="#menu-toolbar-main"
		data-options="url:'/wxmenu/grouplist',
					 singleSelect:true,
					 fit:true,
    				 fitColumns:false,
    				 sortName:'is_show',
       				 sortOrder:'asc',
       				 pagination:true,
        			 title:'微信菜单组列表',
       				 iconCls:'icon-man',
       				 striped:true,
       				 collapsible:true,
       				 pageSize:10,
       				 pageList: [10, 20, 30]">
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
	<!-- 显示菜单 -->
	<div id="menuDialog" title="菜单页面" class="easyui-dialog"data-options="closed:true,draggable:false,inline:true" style="width:100%; height: 100%">
		<div id="menu-toolbar">
			<div class="menu-toolbar-button">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"onclick="openAddLevelOneMenu()" plain="true">添加一级菜单</a>
				<a href="#"class="easyui-linkbutton" iconCls="icon-excel"onclick="submitMenu()" plain="true">将该组菜单刷新至微信服务器</a>
			</div>
		</div>
		<form id="menuForm" action="">
		<!-- 显示数据,数据表格列对齐 -->
			<table id="menuTable" class="easyui-treegrid" style="height:500px"
				data-options="method: 'get',rownumbers: true,showFooter: true,idField:'id',treeField:'title' ">
			</table>
		</form>
	</div>
	<!-- 显示菜单组结束 -->
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
				<td><input type="text" id="url" name="url"  style="width:250px;"/>
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
			<tr>
			<td>
			<input type="hidden" id ="addMenuGid" name ="gid" >
			<input  type="hidden" id ="addMenuPid" name ="pid" >
			</td></tr>
		</table>
	</form>
</div>

<!-- 菜单编辑表格1 -->
<div id="menuEditDialog"  class="easyui-dialog"data-options="closed:true,iconCls:'icon-save'"style="width: 500px; heigh:400px; padding: 10px">
	<form id="menuEditForm" method="post">
		<table id="editOne">
			<tr>
				<td width="100" align="right">一级菜单名称:</td>
				<td><input type="text" id="edittitle" name="title"  /></td>
			</tr>
			<tr>
			<td width="100" align="right">菜单类型:</td>
				<td><input type="radio" id="menuediturl" name="menutype" onclick="url.disabled='';keyword.disabled='disabled';" />跳转页面</td>
			</tr>
			<tr>
				<td width="100" align="right"></td>
				<td><input type="radio" id="menueditclick" name="menutype" onclick="keyword.disabled='';url.disabled='disabled';" />发送消息</td>
			</tr>
			<tr>
			<td width="100" align="right">URL链接：</td>
				<td><input type="text" id="editurl" name="url" style="width:250px;"/>
				</td>
			</tr>
			<tr>
				<td width="100" align="right">关键字：</td>
				<td><input type="text" id="editkeyword"  name="keyword" />
				</td>
			</tr>
			<tr>	
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="editsort" name="sort" class="easyui-textbox" /></td>
			</tr>
			<tr>
			<td>
			<input  type="hidden" id ="editMenuIds" name ="ids" >
			<input type="hidden" id ="editMenuGid" name ="gid" >
			<input  type="hidden" id ="editMenuPid" name ="pid" >
			</td>
			</tr>
		</table>
	</form>
</div>

<!-- 菜单编辑表格2 -->
<div id="menuEditDialog2"  class="easyui-dialog"data-options="closed:true,iconCls:'icon-save'"style="width: 500px; heigh:400px; padding: 10px">
	<form id="menuEditForm2" method="post">
		<table id="editOne2">
			<tr>
				<td width="100" align="right">一级菜单名称:</td>
				<td><input type="text" id="edittitle2" name="title"  /></td>
			</tr>
			<tr>	
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="editsort2" name="sort" class="easyui-textbox" /></td>
			</tr>
			<tr>
			<td>
			<input  type="hidden" id ="editMenuIds2" name ="ids" >
			<input type="hidden" id ="editMenuGid2" name ="gid" >
			<input  type="hidden" id ="editMenuPid2" name ="pid" >
			</td>
			</tr>
		</table>
	</form>
</div>


<!-- 二级菜单添加表格 -->
<div id="menuTwoAddDialog"  class="easyui-dialog"data-options="closed:true,iconCls:'icon-save'"style="width: 500px; heigh:400px; padding: 10px">
	<form id="menuTwoAddForm" method="post">
		<table id="addTwo">
			<tr>
				<td width="100" align="right">一级菜单名称:</td>
				<td><input type="text" id="ptitle" name="ptitle" value="" disabled="disabled" /></td>
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
				<td><input type="text" id="url" name="url"  style="width:250px;"/>
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
			<tr>
			<td>
			<input type="hidden" id ="addTwoMenuGid" name ="gid" >
			<input  type="hidden" id ="addTwoMenuPid" name ="pid" >
			</td></tr>
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