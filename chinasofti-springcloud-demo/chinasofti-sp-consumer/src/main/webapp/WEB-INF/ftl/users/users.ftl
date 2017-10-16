<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="user-toolbar-2">
        <div class="user-toolbar-button">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-excel" onclick="print()" plain="true">导出</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-print" onclick="print()" plain="true">打印</a>
        </div>
        <div class="user-toolbar-search">
            <label>用户名：</label> 
			<input type="text" id="name" name="name" />
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始检索</a>
        </div>
    </div>
    	
    <!-- 数据显示datagrid -->
    <table id="ut" class="easyui-datagrid" toolbar="#user-toolbar-2"></table>
    
     <--<table id="ut" class="easyui-datagrid" 
		url="/users/list"
		rownumbers="true" pagination="true" singleSelect="true" loadMsg="正在加载数据..." >
	<thead>
		<tr>
			<th field="ids" width="20%" align="center">用户ID</th>
			<th field="name" width="20%" align="center">用户姓名</th>
			<th field="mobile" width="20%" align="center">用户手机号</th>
			<th field="nickname" width="20%" align="center">用户昵称</th>
			<th field="openid" width="20%" align="center">用户微信号</th>
		</tr>
	</thead>
	</table> -->
</div>

<!-- 添加表格 -->
<div id="user-dialog-2" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="user-form-2" method="post" action="/users/add">
        <table id="add">
        	<tr>
                <td width="60" align="right">用户ID:</td>
                <td><input type="text" id="ids" name="ids" class="wu-text" /></td>
            </tr>
            <tr>
                <td width="60" align="right">用户姓名:</td>
                <td><input type="text" id="name" name="name" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">用户手机号</td>
                <td><input type="text" id="mobile" name="mobile" class="wu-text" /></td>
            </tr>
            <tr>
                <td align="right">用户昵称</td>
                <td><input type="text" id="nickname" name="nickname" class="wu-text" /></td>
            </tr>
            <tr>
                <td valign="top" align="right">用户微信号</td>
                <td><input type="text" id="openid" name="openid"class="wu-text" /></td>
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
	
		$('#user-form-2').form('submit', {
			url:'/users/add',
			type:'POST',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#user-dialog-2').dialog('close');
					$('#ut').datagrid('reload')
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
	
		var items = $('#ut').datagrid('getSelections');
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
					url:'/users/delete/' + ids,
					type:'POST',
					success:function(data){
						if(data){
							$.messager.alert('信息提示','删除成功！','info');
							$('#ut').datagrid('reload')
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
		$('#user-form-2').form('clear');
		$('#user-dialog-2').dialog({
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
                    $('#user-dialog-2').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 查询数据并打开修改窗口
	*/
	function openEdit(){

		var items = $('#ut').datagrid('getSelections');
		var ids = [];
		
		$(items).each(function(){
			ids.push(this.ids);
		});
		if(ids.length < 1){
			$.messager.alert('温馨提醒','请选择一条数据');
		}
		$.ajax({
			url:'/users/select/' + ids,
			type:'POST',
			success:function(data){
				
				if(data){
					var obj = eval('(' + data + ')');
					$('#ids').val(obj.ids);
					$('#name').val(obj.name);
					$('#mobile').val(obj.mobile);
					$('#nickname').val(obj.nickname);
					$('#openid').val(obj.openid);
					
					$('#ids').attr('readonly','readonly');
					
					/*打开界面*/
					$('#user-dialog-2').dialog({
							closable:false,
							closed: false,
							modal:true,
				            title: "修改信息",
				            buttons: [{
				                text: '确定',
				                iconCls: 'icon-ok',
				                handler: function(){
				                	$('#user-form-2').form('submit', {
				            			url:'/users/update',
				                		type:'POST',
				                		success:function(data){
				                			if(data){
				                				$.messager.alert('信息提示','提交成功！','info');
				                				$('#user-dialog-2').dialog('close');
				                				$('#ids').attr('readonly',false);
				                				$('#ut').datagrid('reload')
				                			}
				                		}
				                	});
				                }
				            }, {
				                text: '取消',
				                iconCls: 'icon-cancel',
				                handler: function () {
				                    $('#user-dialog-2').dialog('close');
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
		$('#ut').datagrid('load',{
			name:$('#name').val(),
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
	$('#ut').datagrid({
		url:'/users/list',
		loadFilter:pagerFilter,		
		rownumbers:true,
		singleSelect:true,           
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			/*{ checkbox:true},*/
			{ field:'ids',title:'用户ID',width:100},
			{ field:'name',title:'用户姓名',width:180},
			{ field:'mobile',title:'用户手机号',width:100},
			{ field:'nickname',title:'用户昵称',width:100},
			{ field:'openid',title:'用户微信',width:100}
		]]
	});
	
	
	/**
	* Name 修改记录
	function edit(){
		$('#user-form-2').form('submit', {
			url:'',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#user-dialog-2').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}*/

</script>