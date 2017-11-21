<div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'center',border:false">
		<!-- Begin of toolbar -->
		<div id="wu-toolbar">
			<div class="wu-toolbar-button">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="reload()" plain="true">同步刷新</a>
			</div>
			<!-- <div class="wu-toolbar-search">
				<label>图片名称：</label><input class="wu-text easyui-textbox"
					style="width: 100px"> <label>起始时间：</label><input
					class="easyui-datebox" style="width: 100px"> <label>结束时间：</label><input
					class="easyui-datebox" style="width: 100px"> <a href="#"
					class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
			</div> -->
		</div>
		<!-- End of toolbar -->
		<table id="wu-datagrid" toolbar="#wu-toolbar"></table>
	</div>
</div>
<!-- Begin of easyui-dialog -->
<div id="wu-dialog" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px;">
	<form id="wu-form" method="post"  enctype="multipart/form-data" >
		<table>
			<tr>
				<td width="80px;" align="right" >
				 	<input type="radio" name="flag" value="0">临时素材</input>
                	<input type="radio" name="flag" value="1">永久素材</input>
				</td>
				<td width="30px;"></td>
				<td><input id="input2" name="file" type="file" /></td>
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
		var flag = $('input:radio[name="flag"]:checked').val();
		//alert(flag);
		 $('#wu-form').form('submit', {
			url:'/wxmaterial/uploadTempMaterial?flag = ' + flag,
			success:function(data){
				if(data){
					//console.log(data);
					$.messager.alert('信息提示','提交成功！','info');
					//$('#wu-dialog').datagrid('reload');
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
				//console.log(items);
				//console.log(items[0].mediaId);
				 $.ajax({
					type:'post',
					url:'/wxmaterial/deletePermanentMaterial',
					data:{"mediaId":items[0].mediaId},
					success:function(data){
						//console.log(data);
						if(data){
							$('#wu-dialog').datagrid('reload');
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
	* Name 刷新数据
	*/
	function reload(){
		$.messager.confirm('信息提示','确定要同步数据?',function(result){
			if(result){
				$.ajax({
					type:'post',
					url:"/wxmaterial/listPermanentMaterial",
					dataType:"json",
					/* data:{
						//这里传值
						}, */
						success:function(data){
						//这里刷新当前页面。window.location.href="当前页";window.location.reload(),强制刷新页面，重新向服务端发送请求
							window.location.reload();
						}
				});
			}
		});
	}
	
	/**
	* Name 打开添加窗口
	*/
	function openAdd(){
		$('#wu-form').form('clear');
		$('#wu-dialog').dialog({
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
			url:'wxmaterial/findAll',
			loadFilter:pagerFilter,		
			rownumbers:true,
			singleSelect:true,
			pageSize:20,           
			pagination:true,
			multiSort:true,
			fitColumns:true,
			fit:true,
			columns:[[
				{ field:'mediaId',title:'文件编号',width:100,sortable:true},
				{ field:'fileName',title:'文件名称',width:180,sortable:true},
				{ field:'createTime',title:'创建时间',width:100,formatter: function(value,row,index){
					if (value != null){
						return new Date(parseInt(value)).toLocaleString().replace(/:\d{1,2}$/,'');
					} else {
						return "";
					}
				}
},
				{ field:'flag',title:'素材类型',width:100,formatter: function(value,row,index){
					if (value == 0){
						return "临时素材";
					} else {
						return "永久素材";
					}
				}},
				{ field:'filePath',title:'上传路径',width:100},
				{ field:'url',title:'文件路径',width:100}
			]],
			
		}); 

	
</script>