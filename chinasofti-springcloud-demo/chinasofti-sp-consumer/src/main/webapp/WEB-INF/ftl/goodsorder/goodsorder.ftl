<script type="text/javascript">
	/**
	* Name 添加记录
	*/
	function add(){
	
		$('#orderAddForm').form('submit', {
			url:'/goodsorder/add',
			type:'POST',
			success:function(data){
				if(data){
					$('#orderAddDialog').dialog('close');
					$.messager.alert('信息提示','提交成功！','info');
					$('#orderDataGrid').datagrid('reload');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	
		
	}
	
	/**
	* Name 修改记录
	*/
	function edit(){
		$('#orderEditForm').form('submit', {
			url:'/goodsorder/update',
			type:'POST',
			success:function(data){
				if(data){
					$('#orderEditDialog').dialog('close');
					$.messager.alert('信息提示','提交成功！','info');
					$('#orderDataGrid').datagrid('reload');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}
	
	/**
	* Name 删除记录
	*/
	function remove(){
	
		var items = $('#orderDataGrid').datagrid('getSelections');
		var ids = [];
		
		/*alert(JSON.stringify(items));*/
		
		
		if(items.length < 1){
			$.messager.alert('信息提示','请选中要删的数据');
			return ;
		}
	
		$.messager.confirm('信息提示','确定要删除该记录？', function(result){
			if(result){
				$(items).each(function(){
					ids.push(this.ids);	
				});
				/*alert(ids);*/
				$.ajax({
					url:'/goodsorder/delete/' + ids,
					type:'POST',
					success:function(data){
						if(data){
							$.messager.alert('信息提示','删除成功！','info');
							$('#orderDataGrid').datagrid('reload')
						}
						else
						{
							$.messager.alert('信息提示','删除失败！','info');		
						}
					}	
				});
			}	
		});
	}
	
	/**
	* Name 打开添加窗口
	*/
	function openAdd(){
		$('#orderAddForm').form('clear');
		$('#orderAddDialog').dialog({
			closed: false,
			modal:true,
            title: "添加订单信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: add
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#orderAddDialog').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEdit(){
		var row = $("#orderDataGrid").datagrid('getSelected');
		if (row) {
			$('#orderEditDialog').dialog('open').dialog({
				closed: false,
				modal:true,
	            title: "修改订单信息",
	            buttons: [{
	                text: '确定',
	                iconCls: 'icon-ok',
	                handler: edit
	            }, {
	                text: '取消',
	                iconCls: 'icon-cancel',
	                handler: function () {
	                    $('#orderEditDialog').dialog('close');                    
	                }
	            }]
	        });
			$('#orderEditForm').form('load',row);
		} else {
			$.messager.alert('信息提示','请选中要修改的数据');
		}
	}	
	
	/**
	* Name 分页过滤器
	*/
	function pagerFilter(data){            
		if (typeof data.length == 'number' && typeof data.splice == 'function'){// is array                
			data = {                   
				total: data.length,                   
				rows: data               
			}            
		}        
		var dg = $(this);         
		var opts = dg.datagrid('options');          
		var pager = dg.datagrid('getPager');          
		pager.pagination({                
			onSelectPage:function(pageNum, pageSize){                 
				opts.pageNumber = pageNum;                   
				opts.pageSize = pageSize;                
				pager.pagination('refresh',{pageNumber:pageNum,pageSize:pageSize});                  
				dg.datagrid('loadData',data);                
			}          
		});           
		if (!data.originalRows){               
			data.originalRows = (data.rows);       
		}         
		var start = (opts.pageNumber-1)*parseInt(opts.pageSize);          
		var end = start + parseInt(opts.pageSize);        
		data.rows = (data.originalRows.slice(start, end));         
		return data;       
	}
	
	/* 
	*加载分页
	*/
	$('#orderDataGrid').datagrid({
		loadFilter:pagerFilter
	});
	
	/* 
	*条件查询
	*/
	function doSearch(){
		$('#orderDataGrid').datagrid('load',{
			bigorderId:$('#bigorderId').val()
		});
		
	}
	
	/**
	* 清空搜索条件
	*/
	function clearAll(){
		$("#bigorderId").textbox('setValue');
		$('#orderDataGrid').datagrid("load", {
		});
	}
	
	
	/**
	* Name 载入数据
	*/
	/* $('#orderDataGrid').datagrid({
		url:'/goods/select/1',
		loadFilter:pagerFilter,		
		rownumbers:true,
		singleSelect:true,
		pageSize:20,           
		pagination:true,
		multiSort:true,
		fitColumns:false,
		fit:true,
		columns:[[
			{ checkbox:true},
			{ field:'ids',title:'商品id',width:50,sortable:true},
			{ field:'goodsType',title:'商品类型',width:50,sortable:true},
			{ field:'goodsCode',title:'商品编号',width:50},
			{ field:'vendorids',title:'供应商id',width:50},
			{ field:'title',title:'标题',width:50},
			
		]]
	}); */
</script>

<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="orderToolbar">
        <div class="orderoolbarButton">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-print" onclick="openAdd()" plain="true">打印</a>
        </div>
        <!-- <div class="orderToolbarSearch">
            <label>大订单编号：</label>
            <input id="bigorderId_input" name="bigorderId" class="easyui-textbox" style="width:100px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">查询</a>
            <a onclick="doClear()" href="#" class="easyui-linkbutton" iconCls="icon-reload">清  空 </a> 
        </div> -->
        <div>
			<form action="" id="orderSearchForm">
				<span>大订单编号:</span> <input name="bigorderId" id="bigorderId" class="easyui-textbox" />
				<a class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="doSearch()">查询</a>
				<a class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="clearAll()">清空</a>
			</form>
		</div>
    </div>

    <table id="orderDataGrid" class="easyui-datagrid" url="/goodsorder/list"
		rownumbers="true" pagination="true" singleSelect="false">
		<!-- data-options="url:/goodsorder/list,rownumbers:true,pagination:true,loadFilter:pagerFilter,
    singleSelect:false,fitColumns:true"> -->
	<thead>
		<tr>
			<th field="ck" checkbox="true" width="50" sortable="true">多选框</th>
			<th field="bigorderId" width="15%" align="center">大订单编号</th>
			<th field="vendorIds" width="15%" align="center">商户编号</th>
			<th field="userIds" width="15%" align="center">用户编号</th>
			<th field="contIdentityno" width="15%" align="center">收件人证件号</th>
			<th field="contPostcode" width="15%" align="center">邮编</th>
			<th field="contAddress" width="23%" align="center">详细地址</th>
		</tr>
	</thead>
	</table>
</div>

<!-- 添加表格 -->
<div id="orderAddDialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="orderAddForm" method="post">
        <table>
        	<tr>
                <td width="60" align="right">ID:</td>
                <td><input name="ids" class="easyui-textbox" /></td>
            </tr>
        	<tr>
                <td width="60" align="right">大订单编号:</td>
                <td><input name="bigorderId" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td width="60" align="right">商户编号:</td>
                <td><input name="vendorIds" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right">用户编号:</td>
                <td><input name="userIds" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right">收件人证件号:</td>
                <td><input name="contIdentityno" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">邮编:</td>
                <td><input name="contPostcode"class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">支付状态:</td>
                <td><input name="payStatus"class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">订单状态:</td>
                <td><input name="status"class="easyui-textbox" /></td>
            </tr>
        </table>
    </form>
</div>
<!-- 修改dialog -->
<div id="orderEditDialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="orderEditForm" method="post">
        <table>
        	<tr>
                <td width="60" align="right">ID:</td>
                <td><input name="ids" class="easyui-textbox" readonly="readonly"/></td>
            </tr>
        	<tr>
                <td width="60" align="right">大订单编号:</td>
                <td><input name="bigorderId" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td width="60" align="right">商户编号:</td>
                <td><input name="vendorIds" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right">用户编号:</td>
                <td><input name="userIds" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right">收件人证件号:</td>
                <td><input name="contIdentityno" class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">邮编:</td>
                <td><input name="contPostcode"class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">支付状态:</td>
                <td><input name="payStatus"class="easyui-textbox" /></td>
            </tr>
            <tr>
                <td align="right" align="right">订单状态:</td>
                <td><input name="status"class="easyui-textbox" /></td>
            </tr>
        </table>
    </form>
</div>
<!-- End of easyui-dialog -->
