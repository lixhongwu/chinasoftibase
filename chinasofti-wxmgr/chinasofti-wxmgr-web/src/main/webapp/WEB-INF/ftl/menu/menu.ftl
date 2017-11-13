<div class="easyui-layout" data-options="fit:true">
    <div data-options="region:'center',border:false">
    	<!-- Begin of toolbar -->
        <div id="wu-toolbar">
            <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加分组</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="reload()" plain="true">刷新</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="submitmenu()" plain="true">更新菜单到微信服务器</a>
            </div>
           <!-- 不用搜索  <div class="wu-toolbar-search">
                <label>分组名称：</label><input class="wu-text" style="width:100px">
                <label>关键词：</label><input class="wu-text" style="width:100px">
                <a href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
            </div> -->
        </div>
        <!-- End of toolbar -->
        <table id="wu-datagrid" toolbar="#wu-toolbar"></table>
    </div>
</div>
<!-- Begin of easyui-dialog -->
<div id="wu-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
	<form id="add-form" method="post">
        <table>
            <tr>
                <td width="60" align="right">菜单组名:</td>
                <td><input type="text" name="title" class="wu-text"  /></td>
            </tr>
            <tr>
                <td align="right">排 序:</td>
                <td><input type="text" name="sort" class="wu-text" /></td>
            </tr>
            <tr>
                <td valign="top" align="right">描 述:</td>
                <td><textarea name="appid" rows="6" class="wu-textarea" style="width:260px"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<!-- End of easyui-dialog -->
<script type="text/javascript">
	
	

	/**
	* Name 载入菜单树
	*/
	$('#wu-category-tree').tree({
		url:'temp/menu.php',
		onClick:function(node){
			alert(node.text);
		}
	});
	
	function submitmenu(){
		
	}

	/**
	* Name 添加记录
	*/
	function add(){
		$('#add-form').form('submit', {
			url:'',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog').dialog('close');
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
		$('#wu-form').form('submit', {
			url:'',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#wu-dialog').dialog('close');
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
		$.messager.confirm('信息提示','确定要删除该记录？', function(result){
			if(result){
				var items = $('#wu-datagrid').datagrid('getSelections');
				var ids = [];
				$(items).each(function(){
					ids.push(this.productid);	
				});
				//alert(ids);return;
				$.ajax({
					url:'',
					data:'',
					success:function(data){
						if(data){
							$.messager.alert('信息提示','删除成功！','info');		
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
		$('#add-form').form('clear');
		$('#wu-dialog').dialog({
			closed: false,
			modal:true,
            title: "添加新的菜单分组",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: add
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#wu-dialog').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEdit(){
		$('#wu-form').form('clear');
		var item = $('#wu-datagrid').datagrid('getSelected');
		//alert(item.productid);return;
		$.ajax({
			url:'',
			data:'',
			success:function(data){
				if(data){
					$('#wu-dialog').dialog('close');	
				}
				else{
					//绑定值
					$('#wu-form').form('load', data)
				}
			}	
		});
		$('#wu-dialog').dialog({
			closed: false,
			modal:true,
            title: "修改信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: edit
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#wu-dialog').dialog('close');                    
                }
            }]
        });
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
	$('#wu-datagrid').datagrid({
		url:'/wxmenu/grouplist',
		loadFilter:pagerFilter,		
		rownumbers:true,
		singleSelect:false,
		pageSize:20,           
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			{ checkbox:true},
			{ field:'gname',title:'菜单组名',width:150,sortable:true},
			{ field:'status',title:'是否为微信当前菜单',width:80,sortable:true},
			{ field:'order',title:'排序',width:50},
			
		]]
	});
</script>