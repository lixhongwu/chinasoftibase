<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="wu-toolbar-2">
        <div class="wu-toolbar-button">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-excel" onclick="print()" plain="true">导出</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-print" onclick="print()" plain="true">打印</a>
        </div>
        <div class="wu-toolbar-search">
            <label>商品类型：</label> 
			<input type="text" id="goodstype" name="goodstype" />
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始检索</a>
        </div>
    </div>
    
    <!-- 数据显示datagrid -->
    <table id="tt-goodsinfo" class="easyui-datagrid" toolbar="#wu-toolbar-2"></table>
    
    <!-- <table id="tt" class="easyui-datagrid" 
		url="/goods/select/all"
		rownumbers="true" pagination="true" singleSelect="true" loadMsg="正在加载数据..." >
	<thead>
		<tr>
			<th field="ids" width="20%" align="center">商品ID</th>
			<th field="goodsType" width="20%" align="center">商品类型</th>
			<th field="goodsCode" width="20%" align="center">商品编号</th>
			<th field="vendorids" width="20%" align="center">供应商ID</th>
			<th field="title" width="20%" align="center">标题</th>
		</tr>
	</thead>
	</table> -->
</div>

<!-- 添加表格 -->
<div id="wu-dialog-2" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="wu-form-2" method="post" action="/goods/add">
        <table id="add">
        	<tr>
                <td width="60" align="right">商品ID:</td>
                <td><input type="text" id="ids" name="ids" class="wu-text" /></td>
            </tr>
            <tr>
                <td width="60" align="right">商品类型:</td>
                <td><input type="text" id="goodsType" name="goodsType" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">商品编号:</td>
                <td><input type="text" id="goodsCode" name="goodsCode" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">供应商id:</td>
                <td><input type="text" id="vendorids" name="vendorids" class="wu-text" /></td>
            </tr>
            <tr>
                <td valign="top" align="right">标题:</td>
                <td><input type="text" id="title" name="title"class="wu-text" /></td>
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
	
		$('#wu-form-2').form('submit', {
			url:'/goods/add',
			type:'POST',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog-2').dialog('close');
					$('#tt-goodsinfo').datagrid('reload')
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
	
		var items = $('#tt-goodsinfo').datagrid('getSelections');
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
							$('#tt-goodsinfo').datagrid('reload')
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
		$('#wu-form-2').form('clear');
		$('#wu-dialog-2').dialog({
			closed: false,
			modal:true,
            title: "添加信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: add
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#wu-dialog-2').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 查询数据并打开修改窗口
	*/
	function openEdit(){

		var items = $('#tt-goodsinfo').datagrid('getSelections');
		var ids = [];
		
		$(items).each(function(){
			ids.push(this.ids);
		});
		if(ids.length < 1){
			$.messager.alert('温馨提醒','请选择一条数据');
		}
		$.ajax({
			url:'/goods/select/' + ids,
			type:'POST',
			success:function(data){
				
				if(data){
					var obj = eval('(' + data + ')');
					$('#ids').val(obj.ids);
					$('#goodsType').val(obj.goodsType);
					$('#goodsCode').val(obj.goodsCode);
					$('#vendorids').val(obj.vendorids);
					$('#title').val(obj.title);
					
					$('#ids').attr('readonly','readonly');
					
					/*打开界面*/
					$('#wu-dialog-2').dialog({
							closable:false,
							closed: false,
							modal:true,
				            title: "修改信息",
				            buttons: [{
				                text: '确定',
				                iconCls: 'icon-ok',
				                handler: function(){
				                	$('#wu-form-2').form('submit', {
				            			url:'/goods/update',
				                		type:'POST',
				                		success:function(data){
				                			if(data){
				                				$.messager.alert('信息提示','提交成功！','info');
				                				$('#wu-dialog-2').dialog('close');
				                				$('#ids').attr('readonly',false);
				                				$('#tt-goodsinfo').datagrid('reload')
				                			}
				                		}
				                	});
				                }
				            }, {
				                text: '取消',
				                iconCls: 'icon-cancel',
				                handler: function () {
				                    $('#wu-dialog-2').dialog('close');
				                    $('#ids').attr('readonly',false);
				                }
							          }]
				        });
						
					}
				
			}	
		});
		
	}
	
	
	/* 
	*查询
	*/
	function doSearch(){
		$('#tt-goodsinfo').datagrid('load',{
			goodsType:$('#goodstype').val(),
			title:$('#title').val()
		});
		
	}
	
	
	
	/**
	* 分页过滤器
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
	$('#tt-goodsinfo').datagrid({
		url:'/goods/list',
		loadFilter:pagerFilter,		
		rownumbers:true,
		singleSelect:true,           
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			/*{ checkbox:true},*/
			{ field:'ids',title:'商品ID',width:100},
			{ field:'goodsType',title:'商品类型',width:180},
			{ field:'goodsCode',title:'商品编号',width:100},
			{ field:'vendorids',title:'供应商ID',width:100},
			{ field:'title',title:'标题',width:100}
		]]
	});
	
	
	/**
	* Name 修改记录
	function edit(){
		$('#wu-form-2').form('submit', {
			url:'',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog-2').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}*/

</script>