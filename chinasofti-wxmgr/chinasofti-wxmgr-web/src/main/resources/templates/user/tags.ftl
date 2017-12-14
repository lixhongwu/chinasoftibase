<script type="text/javascript" src="js/tags.js">
</script>
<div class="easyui-layout" id="tags_easyui-layout" data-options="fit:true"  >
	<!-- Begin of toolbar -->
	<div id="Tags-toolbar" >
		<div class="wu-toolbar-button">
		<form id="tags_search">
			<table >
			<tr  >
			<td width="35%">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="addTags()" plain="true">添加标签</a> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="editTags()" plain="true">修改标签</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="deleteTags()" plain="true">删除</a>
			</td>
			<td width="35%">
			<span class="wu-toolbar-search">
				<label >标签名称：</label> 
				<input id="tags_search_name" name="name" class="easyui-textbox" style="width: 120px" /> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="tags_search()">搜索</a> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit-clear" onclick="tags_clear()" >清除</a>
				</span>
			</td>
			<td align="right" width="30%">
				<a href="#" class="easyui-linkbutton" iconCls="icon-refresh" onclick="synchroTags()" plain="true">同步标签到本地</a>
			</td>
			</tr>
			</table>		
		</form>
		</div>
	</div>

	<!-- 数据显示datagrid -->
	<table id="tags-datagrid" class="easyui-datagrid" toolbar="#Tags-toolbar"
		data-options="url:'/wxusertags/findTagsByPage',
					 fit:true,
    				 fitColumns:false,
       				 pagination:true,
       				 sortName:'ids',
       				 sortOrder:'asc',
        			 title:'用户标签列表',
       				 iconCls:'icon-man',
       				 striped:true,
       				 singleSelect:true,
       				 collapsible:true,
       				 pageSize:10,
       				 pageList: [10, 20, 30]">
		<thead>
			<tr>
				<th field="ids"  width="15%" align="center" data-options="sortable:true">标签Id</th>
				<th field="name"   width="15%" align="center" >标签名称</th>
				<th field="fansnum"  width="15%" align="center"  data-options="sortable:true">标签用户数量</th>
				<th field="description"  width="25%" align="center" >标签描述</th>
			</tr>
		</thead>
	</table>
	<!-- 编辑框 -->
	<div id="tags-edit-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save',inline:true" style="width: 400px;height: 200px;padding:10px" buttons="#tags-edit-dialog-button">
		<form id="tags-edit-form" method="post"  >
			<table align="center"  >
				<tr><td></td></tr>
				<tr id="tagsid_tr" >
					<th  nowrap="nowrap" >标签ID:</th>
					<td >
						<input style="width: 180px" type="text" readonly="readonly" name="ids" class="easyui-textbox" />
						<span style="color:gray"><font size="1">不可编辑</font></span>					
					</td>
				</tr>
				<tr>
					<th nowrap="nowrap" >标签名称:</th>
					<td >
						<input id="tag_name_id" style="width: 180px" type="text" required="required"  name="name" class="easyui-validatebox" data-options="validType:'length[2,10]'" />
						<span><font size="1" color='gray'>2~10个字符</font></span>
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
						<span><font id="tag_name_check_font" hidden="hidden" size="1" color='red'>该标签名已存在</font></span>
					</td>
				</tr>
				<tr>
					<th nowrap="nowrap">标签描述:</th>
					<td >
						<input style="width: 180px" type="text"  name="description" class="easyui-validatebox" data-options="validType:'length[0,50]'" />
						<span style="color:gray"><font size="1">0-50个字符</font></span>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="tags-edit-dialog-button">
		<a id="tags_add_button" href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveTags()">添加</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#tags-edit-dialog').dialog('close')">取消</a>
	</div>

</div>
