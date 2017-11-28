<script type="text/javascript" src="js/sendmessager.js">
</script>
<div class="easyui-layout" data-options="fit:true">
		<form id="sendForm" method="post">
			<div class="wu-toolbar-search">
				<label>消息类型：</label>
				 <select id="messager_type"   style="width: 100px">
					<option value="">请选择</option>
					<option value="1">文本</option>
					<option value="0">图片</option>
				 </select>
					<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add1'" id="userSelect" plain='true' >用户选择</a>
			</div>
			<div>
				<label>文本内容：</label>
				<!-- <span id="textContent"></span> --> 
				<input id="content" name="content" type="text" style="width:300px">&nbsp;&nbsp; 
				<a id="send" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'"  onclick="sendAll();">发送</a>  
			</div>
			<input type="hidden" id="openid" name="openid"/>
			<input type="hidden" id="mediaid" name="mediaid"/>
		</form>
		<!-- 素材列表dialog -->
		<div id="materiallist"></div>
	</div>
	<!-- 用户列表dialog -->
	<div id="userlist" >
		<table id="usertable" class="easyui-datagrid"></table> 
	</div>