<div class="easyui-layout" data-options="fit:true">
	<!-- begin of toolbar -->
	<div id="wu-toolbar-2">
		<div clas="wu-toolbar-button">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
		</div>
		<div class="wu-toolbar-search">
			<lable>客服名称：</lable><input type="text" id="kefuSearch" name="kefu"/>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始搜索</a>
		</div>
	</div>
	
	<!-- 数据显示datagrid -->
	<table id="kefu-account" class="easyui-datagrid" toolbar="#wu-toolbar-2"></table>
</div>
<!-- 添加表格 -->
<div id="wu-dialog-2" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px;padding:10px;">
	<form  id="wu-form-2" method="post">
		<table id="add">
			<tr>
				<td width="60" align="right">客户账号:</td>
				<td><input type="text" id="account" name="account" class="wu-text" /></td>
			</tr>
			<tr>
				<td width="60" align="right">工号:</td>
				<td><input type="text" id="ids" name="ids" class="wu-text" /></td>
			</tr>
			<tr>
				<td width="60" align="right">昵称:</td>
				<td><input type="text" id="nickname" name=nickname class="wu-text" /></td>
			</tr>
			<tr>
				<td width="60" align="right">密码:</td>
				<td><input type="text" id="password" name="password" class="wu-text" /></td>
			</tr>
		</table>
	</form>
</div>
<!-- end of easyui-dialog -->
<script type="text/javascript">
	//添加纪录
	function add(){
		$("#wu-form-2").form('submit',{
			url:'/wxkefu/add',
			type:'POST',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog-2').dialog('close');
					$('#kefu-account').datagrid('reload')
				}else{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}
	
	//删除记录
	function remove(){
		var items = $('#kefu-account').datagrid('getSelections');
		var ids = [];
		
		if(items.length < 1){
			$.messager.alert('信息提示','请选择要删除的客服');
			return ;
		}
		$.messager.confirm('信息提示','确定要删除该记录?',function(result){
			if(result){
				$.ajax({
					type:'post',
					url:'/wxkefu/delete',
					data:{"kefu-account":items[0].ke_account},
					success:function(data){
						if(data){
							$.messager.alert('信息提示','删除成功！','info');
							$('#kefu-account').datagrid('reload');
						}else {
							$.messager.alert('信息提示','删除失败！','info');	
						}
					}
				});
			}
		});
	}
	//打开添加窗口
	function openAdd(){
		$('#wu-form-2').form('clear');
		$('#wu-dialog-2').dialog({
			closed: false,
			modal: true,
			title: "添加客服信息",
			buttons: [{
				text: '确定',
				iconCls: 'icon-ok',
				handler: add
			},{
				text: '取消',
				iconCls: 'icon-cancel',
				handler: function(){
					 $('#wu-dialog-2').dialog('close');
				}
			}]
		});
	}
	//查询数据并打开修改窗口
	function openEdit(){
		$('#wu-form-2').form('clear');
		var row = $("#kefu-account").datagrid('getSelected');
		if(row){
			$('#wu-dialog-2').dialog('open').dialog({
				closed: false,
				modal: true,
				closable: false,
				title: "修改客服",
				buttons: [{
					text: '确定',
					iconCls: 'icon-ok',
					handler: edit
				},{
					text: '取消',
					iconCls: 'icon-cancel',
					handler: function(){
						$('#wu-dialog-2').dialog('close');
					}
				}]
			});
			$('#wu-form-2').form('load',row);
		}else {
			$.messager.alert('信息提示','请选择要修改的数据');	
		}
	}
	//修改
	function edit(){
		$('#wu-form-2').form('submit',{
			url:'/wxkefu/update',
			type:'POST',
			data:$('#wu-form-2').serialize(),
			success:function(data){
				if(data > 0){
					$.messager.alert('信息提示','提交成功','info');
					$('#wu-dialog-2').dialog('close');
				}else {
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}
	//查询
	function doSearch(){
		$('#kefu-account').datagrid('load',{
			kefu:$('#kefuSearch').val(),
			title:$('#title').val()
		});
	}
	//清除搜索框内容
	function doClear(){
		document.getElementById("kefuSearch").value="";
	}
	/**
	* 分页过滤器
	*/
	
	function pagerFilter(data) {
		if (typeof data.length == 'number' && typeof data.splice == 'function') {// is array                
			data = {
				total : data.length,
				rows : data
			}
		}
		var dg = $(this);
		var opts = dg.datagrid('options');
		var pager = dg.datagrid('getPager');
		pager.pagination({
			onSelectPage : function(pageNum, pageSize) {
				opts.pageNumber = pageNum;
				opts.pageSize = pageSize;
				pager.pagination('refresh', {
					pageNumber : pageNum,
					pageSize : pageSize
				});
				dg.datagrid('loadData', data);
			}
		});
		if (!data.originalRows) {
			data.originalRows = (data.rows);
		}
		var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
		var end = start + parseInt(opts.pageSize);
		data.rows = (data.originalRows.slice(start, end));
		return data;
	}
	//载入数据
	$('#kefu-account').datagrid({
		url:'/wxkefu/findAll',
		loadFilter:pagerFilter,
		rownumbers:true,
		singleSelect:true,
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
					{field:'account',title:'客服账号',width:100},          
					{field:'ids',title:'工号',width:100},          
					{field:'nickname',title:'昵称',width:100},          
					{field:'password',title:'密码',width:100}         
		          
		]]
	});
</script>