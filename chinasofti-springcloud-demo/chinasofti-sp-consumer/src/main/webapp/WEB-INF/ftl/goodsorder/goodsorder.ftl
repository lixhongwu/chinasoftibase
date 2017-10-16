<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="orderToolbar">
        <div class="orderoolbarButton">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-print" onclick="openAdd()" plain="true">打印</a>
        </div>
        <div class="orderToolbarSearch">
            <label>支付状态：</label> 
            <select class="easyui-combobox" panelHeight="auto" style="width:120px">
                <option value="-1">选择支付状态</option>
                <option value="0">未支付</option>
                <option value="1">已支付</option>
                <option value="2">取消</option>
            </select>
            <label>大订单编号：</label><input class="order-text" style="width:100px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
        </div>
    </div>

<<<<<<< HEAD
    <table id="orderDataGrid" class="easyui-datagrid" 
=======
    <table id="tt-goodsorder" class="easyui-datagrid" 
>>>>>>> branch 'version1.2' of https://github.com/lixhongwu/chinasoftibase.git
		url="/goodsorder/list"
		rownumbers="true" pagination="true" singleSelect="false">
	<thead>
		<tr>
			<th field="ck" checkbox="true" width="50" sortable="true">多选框</th>
			<th field="bigorderId" width="15%" align="center">大订单编号</th>
			<th field="vendorIds" width="15%" align="center">商户编号</th>
			<th field="userIds" width="15%" align="center">用户编号</th>
			<th field="contIdentityno" width="15%" align="center">收件人证件号</th>
			<th field="contPostcode" width="15%" align="center">邮编</th>
			<th field="contAddress" width="27%" align="center">详细地址</th>
		</tr>
	</thead>
	</table>
</div>

<!-- 添加表格 -->
<div id="orderAddDialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="orderAddForm" method="post">
        <table>
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
        </table>
    </form>
</div>
<!-- 修改dialog -->
<div id="orderEditDialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="orderEditForm" method="post">
        <table>
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
        </table>
    </form>
</div>
<!-- End of easyui-dialog -->
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
					$.messager.alert('信息提示','提交成功！','info');
					$('#orderAddDialog').dialog('close');
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
			url:'/goodsorder/edit',
			type:'POST',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#orderAddDialog').dialog('close');
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
					url:'/goods/delete/' + ids,
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
			$('#orderEditDialog').dialog('open').dialog('setTitle','Edit User');
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