<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/tmpMessage.js"></script>
<!-- 整体布局块 -->
<div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'center',border:false">
		<!-- 工具栏 -->
		<div id="message-toolbar">
			<div class="wu-toolbar-button">
				<a href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-add" plain="true" id="ff"
					onclick="$('#editwin').window('open')">添加</a> <a
					href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-edit" plain="true" onclick="message_edit()">修改</a> <a
					href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-remove" plain="true" onclick="message_remove()">删除</a>

				<input type="text" style="position: absolute; right: 120px;" id="rule_name"/> <a
					href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-search" style="position: absolute; right: 25px;"
					onclick="search_message()">搜索</a>
			</div>
		</div>
		<!-- 表格 -->
		<div id="message-datagrid"></div>

		<!-- 编辑窗口 -->
		<div id="editwin" class="easyui-window"
			data-options="title:'新增消息',width:450,height:260 ,closed:true">
			<form id="editform" method="post">
				<table>

					<tr>
						<td>规则名称</td>
						<td><input type="text" name="rulename" /></td>
					</tr>
					<tr>
						<td>关键词</td>
						<td><input type="text" name="keywords" /></td>
					</tr>

					<tr>
						<td>内容</td>
						<td><textarea type="text" name="content"
								style="width: 300px; height: 100px;" /></td>
					</tr>

				</table>
				<br>
				<div style="position: absolute; right: 25px;">
					<a id="save" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-save'">保存</a>
				</div>

			</form>
		</div>
		<!-- 编辑窗口 -->
		<div id="updatewin" class="easyui-window"
			data-options="title:'新增消息',width:450,height:260 ,closed:true">
			<form id="updateform" method="post">
				<table>

					<input type="hidden" name="message_id" id="message_id" />

					<tr>
						<td>规则名称</td>
						<td><input type="text" name="rulename" /></td>
					</tr>
					<tr>
						<td>关键词</td>
						<td><input type="text" name="keywords" /></td>
					</tr>

					<tr>
						<td>内容</td>
						<td><textarea type="text" name="content"
								style="width: 300px; height: 100px;" /></td>
					</tr>

				</table>
				<br>
				<div style="position: absolute; right: 25px;">
					<a id="updatesave" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-save'">保存</a>
				</div>

			</form>
		</div>
	</div>

</div>
<
<script type="text/javascript">
<!--
	//-->
	//保存
</script>

