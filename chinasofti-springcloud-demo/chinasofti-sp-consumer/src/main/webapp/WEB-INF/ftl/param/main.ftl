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
            <label>参数名称：</label> 
			<input type="text" id="aaa" name="goodstype" />
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始检索</a>
        </div>
    </div>
     <!-- 数据显示datagrid -->
    <table id="tt-paraminfo" class="easyui-datagrid" toolbar="#wu-toolbar-2"></table>
    
    <!-- <table id="tt" class="easyui-datagrid" 
		url="/param/list"
		rownumbers="true" pagination="true" singleSelect="true" loadMsg="正在加载数据..." >
	<thead>
		<tr>
			<th field="ids" width="20%" align="center">参数ID</th>
			<th field="num" width="20%" align="center">编号</th>
			<th field="seq" width="20%" align="center">排序</th>
			<th field="paramterName" width="20%" align="center">参数名称</th>
			<th field="valuees" width="20%" align="center">参数值</th>
		</tr>
	</thead>
	</table> -->
</div>

<!-- 添加表格 -->
<div id="wu-dialog-2" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="wu-form-2" method="post" action="/param/add">
        <table id="add">
        	<tr>
                <td width="60" align="right">参数ID:</td>
                <td><input type="text" id="ids" name="ids" class="wu-text" /></td>
            </tr>
            <tr>
                <td width="60" align="right">编号:</td>
                <td><input type="text" id="num" name="num" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">排序:</td>
                <td><input type="text" id="seq" name="seq" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">参数名称:</td>
                <td><input type="text" id="paramterName" name="paramterName" class="wu-text" /></td>
            </tr>
            <tr>
                <td valign="top" align="right">参数值:</td>
                <td><input type="text" id="valuees" name="valuees"class="wu-text" /></td>
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
			url:'/param/add',
			type:'POST',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog-2').dialog('close');
					$('#tt-paraminfo').datagrid('reload')
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
	
		var items = $('#tt-paraminfo').datagrid('getSelections');
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
					url:'/param/delete/' + ids,
					type:'POST',
					success:function(data){
						if(data){
							$.messager.alert('信息提示','删除成功！','info');
							$('#tt-paraminfo').datagrid('reload')
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

		var items = $('#tt-paraminfo').datagrid('getSelections');
		var ids = [];
		console.info(items);
		$(items).each(function(){
			ids.push(this.ids);
		});
		if(ids.length < 1){
			$.messager.alert('温馨提醒','请选择一条数据');
		}
		$.ajax({
			url:'/param/select/' + ids,
			type:'POST',
			success:function(data){
				
				if(data){
					var obj = eval('(' + data + ')');
					console.info(obj);
					$('#ids').val(obj.ids);
					$('#num').val(obj.num);
					$('#seq').val(obj.seq);
					$('#paramterName').val(obj.paramterName);
					$('#valuees').val(obj.valuees);
					
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
				            			url:'/param/update',
				                		type:'POST',
				                		success:function(data){
				                			if(data){
				                				$.messager.alert('信息提示','提交成功！','info');
				                				$('#wu-dialog-2').dialog('close');
				                				$('#ids').attr('readonly',false);
				                				$('#tt-paraminfo').datagrid('reload')
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
	function doSearch(){
		$('#tt-paraminfo').datagrid('load',{
			paramterName:$('#paramterName').val(),
			valuees:$('#valuees').val()
		});	
	}
		*/
	
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
	$('#tt-paraminfo').datagrid({
		url:'/param/list',
		loadFilter:pagerFilter,		
		rownumbers:true,
		singleSelect:true,           
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			/*{ checkbox:true},*/
			{ field:'ids',title:'参数ID',width:100},
			{ field:'num',title:'参数编号',width:180},
			{ field:'seq',title:'排序',width:100},
			{ field:'paramterName',title:'参数名称',width:100},
			{ field:'valuees',title:'参数值',width:100}
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

	