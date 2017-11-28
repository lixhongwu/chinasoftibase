<script type="text/javascript" src="js/users.js">
</script>
<div class="easyui-layout" data-options="fit:true">
	<!-- Begin of toolbar -->
	<div id="Users-toolbar" >
		<div class="wu-toolbar-button">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="taggingUsers()" plain="true">标记标签</a> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="untaggingUsers()" plain="true">取消标签</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="addBlackUsers()" plain="true">添加黑名单</a>
				<!-- <a href="#" class="easyui-linkbutton" iconCls="icon-excel" onclick="showUsers()" plain="true">查看用户</a> -->
				<a href="#" class="easyui-linkbutton" iconCls="icon-refresh" onclick="synchroUsers()" plain="true">同步用户到本地</a>
		</div>
		<form id="user_SearchForm">
			<div class="wu-toolbar-search">
				<label>昵称：</label> 
				<input id="user_search_nickname" name="nickname" class="easyui-textbox" style="width: 100px" /> 
				<label>是否关注：</label> 
				<select id="user_search_subscribe" name="subscribe" class="easyui-combobox" style="width: 50px">
					<option value="">选择</option>
					<option value="1">是</option>
					<option value="0">否</option>
				</select>  
				<label>性别：</label>
				 <select id="user_search_sex" name="sex" class="easyui-combobox" style="width: 50px">
					<option value="">选择</option>
					<option value="1">男</option>
					<option value="2">女</option>
					<option value="3">未知</option>
				</select> 
				<label>用户标签：</label> 
				<input id="user_search_tagidList" name="tagidList" class="easyui-combobox" style="width: 80px">
				<label>关注起始日期：</label>
				<input id="user_search_subscribeTime" name="subscribeTime" type="text" class="easyui-datebox"  style="width: 100px" ></input>  
				<label>黑名单：</label>
				 <select id="user_search_black" name="black" class="easyui-combobox" style="width: 60px">
					<option value="">选择</option>
					<option value="0">未拉入</option>
					<option value="1">已拉黑</option>
				</select> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="user_search()">开始检索</a> 
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit-clear" onclick="user_clear()" >清除</a>
			</div>
		</form>
	</div>

	<!-- 数据显示datagrid -->
	<table id="users-datagrid" class="easyui-datagrid" toolbar="#Users-toolbar"
		data-options="url:'/wxuser/findusersbypage',
						checkbox:true,
    				 	 fitColumns:false,
       				 pagination:true,
       				 sortName:'ids',
       				 sortOrder:'asc',
        			 title:'微信用户列表',
       				 iconCls:'icon-man',
       				 striped:true,
       				 collapsible:true,
       				 pageSize:10,
       				 pageList: [10, 20, 30]">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th field="nickname"  width="13%" align="center" data-options="sortable:true">昵称</th>
				
				<th field="sex"   width="5%" align="center" data-options="formatter:sexFormatter,sortable:true" >性别</th>
				<th field="country"   width="7%" align="center" >国家</th>
				<th field="province"   width="10%" align="center"  data-options="sortable:true" >省份</th>
				<th field="city"   width="10%" align="center"  data-options="sortable:true" >城市</th>
				<th field="subscribeTime"width="10%" align="center" data-options="sortable:true">关注时间</th>
				<th field="tagidList"  width="10%" align="center"  data-options="sortable:true" >标签</th>
				<th field="subscribe"  width="6%" align="center" data-options="formatter:taggingFormatter,sortable:true">关注否</th>
				<th field="black"  width="6%" align="center"  data-options="sortable:true" >黑名单</th>
				<th field="remark"  width="8%" align="center"  data-options="sortable:true" >备注名</th>
				<th field="remarkstates"  width="10%" align="center" data-options="formatter:remarkFormatter">操作</th> 
			</tr>
		</thead>
	</table>
	<!-- 编辑框 -->
	<div id="Users-edit-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save',inline:true" style="width: 400px;height: 200px;padding:10px" buttons="#Users-edit-dialog-button">
		<form id="Users-edit-form" method="post"  >
			 <input id="user_ids" name="ids" type="hidden"> 
			<table align="center" >
				<tr >
					<th  nowrap="nowrap" >昵称:</th>
					<td >
						<input id="user_nickname" style="width: 180px" type="text" disabled="disabled" name="nickname" class="easyui-textbox" />
						<span style="color:gray"><font size="1">不可编辑</font></span>					
					</td>
				</tr>
				<tr>
					<th nowrap="nowrap" >备注名:</th>
					<td >
						<input id="user_remark" style="width: 180px" type="text" name="remark" class="easyui-textbox" />
						<span style="color:gray"><font size="1">0~30个字符</font></span>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="Users-edit-dialog-button">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUserRemark()">保存</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#Users-edit-dialog').dialog('close')">取消</a>
	</div>

</div>
