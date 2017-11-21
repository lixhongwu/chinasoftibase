<script type="text/javascript" src="js/common.js"></script>
<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="user-toolbar-2">
        <div class="user-toolbar-button">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-excel" onclick="submitMenu()" plain="true">将该组菜单刷新至微信服务器</a>
        </div>
        <div class="user-toolbar-search">
            <label>用户名：</label> 
			<input type="text" id="name" name="name" />
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始检索</a>
        </div>
    </div>
    
    <!-- 显示数据,数据表格列对齐 -->
    <table id="tbMenuGroup" class="easyui-datagrid" title="微信组名称列表" url="/wxmenu/grouplist"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
    	<thead>
    		<tr>
    			<th data-options="field:'ids',width:250,align:'center'">微信组ID</th>
				<th data-options="field:'title',width:200,align:'center'">微信菜单组名称</th>
				<th data-options="field:'isShow',width:200,align:'center'">是否为微信当前使用菜单</th>
				<th data-options="field:'appid',width:300,align:'center'">菜单组描述</th>
    		</tr>
    	</thead>
    </table>
    <div id="pagination" style="background:#efefef;border:1px solid #ccc;"></div>
</div>  

!-- 分类添加表格 -->
<div id="menu-dialog-2" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px ">
	<form id="menu-form-2" method="post" >
		<table id="add">
			<tr>
				<td width="100" align="right">微信菜单组名称:</td>
				<td><input type="text" id="title" name="title" class="user-text" /></td>
			</tr>
			<tr>
				<td width="100" align="right">排序:</td>
				<td><input type="text" id="sort" name="sort" class="user-text"  /></td>
			</tr>
			<tr>
				<td width="100" align="right">菜单组描述:</td>
				<td><textarea rows="3" cols="25" name="appid" ></textarea>
				</td>
			</tr>
		</table>
	</form>
</div>

<!-- 修改表格 -->
<div id="user-dialog-3" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px;">
	<form id="user-form-3" method="post">
		<table id="update">
			<tr>
				<td width="50" align="right">用户ID:</td>
				<td><input type="text" id="ids" name="ids" class="user-text" /></td>
			</tr>
			<tr>
				<td width="50" align="right">版本:</td>
				<td><input type="text" id="version" name="version" class="user-text" /></td>
			</tr>
			<tr>
				<td width="50" align="right">错误统计:</td>
				<td><input type="text" id="errorcount" name="errorcount" class="user-text" /></td>
			</tr>
			<tr>
				<td width="50" align="right">订单编号:</td>
				<td><input type="text" id="orderids" name="orderids" class="user-text" /></td>
			</tr>
			<td>
					<select class="easyui-combobox easyui-validatebox" required="true" missingMessage="请选择" data-options="editable:false,panelHeight:'auto'" id="status" name="status" style="width: 75px">
							<option value="0">未开启</option>
							<option value="1">已启用</option>
					</select>
				</td>
			<tr>
				<td width="50" align="right">登录姓名:</td>
				<td><input type="text" id="usernames" name="usernames" class="user-text" />
				</td>		
			</tr>
			<tr>
				<td width="50" align="right">部门编号:</td>				
				<td><input type="text" id="departmentids" name="departmentids" class="user-text" />					
				</td>				
			</tr>
			<tr>
				<td width="50" align="right">userinfoids:</td>
				<td><input type="text" id="userinfoids" name="userinfoids" class="user-text" /></td>
			</tr>
			<tr>
				<td width="50" align="right">部门名字:</td>
				<td><input type="text" id="departmentnames" name="departmentnames" class="user-text" /></td>
			</tr>
			<tr>
				<td width="50" align="right">unionid:</td>
				<td><input type="text" id="unionid" name="unionid" class="user-text" /></td>
			</tr>
		</table>
	</form>
</div>


<!-- End of easyui-dialog -->
<script type="text/javascript">
 $(function(){
	// 获取表格datagrid的ID属性
	var tableID = $("table.easyui-datagrid").attr("id");
	//alert(tableID);
	//获取分页工具条元素
	var pageId = $('#pagination');
  
	//此处设置自己的url地址
	var url = '/wxmenu/grouplist';
	
	tdload(tableID, pageId, url);
});
 


/*
 * 分类状态
 */
function statesFormatter(value){
	if(value == "0"){
		return '<span style="color:red">未开启</span>';
	}else{
		return '<span style="color:green">已启用</span>';
	}
}

function imgFormatter(value,row){
	//alert(123)
	var str = "";
	if(value != "" || value != null){
		str = "<img style=\"height: 80px;width: 150px;\" src=\""+value+"\"/>";
        return str;
	}
}

function choose1(){
	var str="";
	
}
	/*
	将菜单更新到微信服务器
	*/
	
	function submitMenu(){
		
	}

	/**
	* Name 添加记录
	*/
	function add(){
		
		$('#menu-form-2').form('submit', {
			url:'/wxmenu/addmenugroup',
			type:'POST',
			success:function(data){
				alert(data);
				if(data > 0){
					$('#pagination').pagination('select');
					$('#menu-dialog-2').dialog('close');
					$.messager.alert('信息提示','提交成功！','info');
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
		var items = $('#tbMenuGroup').datagrid('getSelections');
		var ids = [];
		
		//alert(JSON.stringify(items));
		
		
		if(items.length < 1){
			$.messager.alert('温馨提醒','请选中要删的数据');
			return ;
		}
	
		$.messager.confirm('信息提示','确定要删除该记录？', function(result){
			if(result){
				$(items).each(function(){
					ids.push(this.ids);	
				});
				alert(ids);
				$.ajax({
					url:'/wxmenu/deleteMenuGroup/' + ids,
					type:'POST',
					success:function(data){
						alert(data);
						if(data==200){
							$.messager.alert('信息提示','删除成功！','info');
							$('#tbMenuGroup').datagrid('reload')
							$('#pagination').pagination('select');
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
		$('#menu-form-2').form('clear');
		$('#menu-dialog-2').dialog({
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
                    $('#menu-dialog-2').dialog('close');                    
                }
            }]
        });
	}
	

	/**
	* Name 打开修改窗口
	*/
	function openEdit(){
		var row = $("#tbMenuGroup").datagrid('getSelected');
		if (row) {
			//alert(JSON.stringify(row));
			$('#user-dialog-3').dialog('open').dialog({
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
	                    $('#user-dialog-3').dialog('close');                    
	                }
	            }]
	        });
			$('#user-form-3').form('load',row);
		} else {
			$.messager.alert('信息提示','请选中要修改的数据');
		}
	}
	
	/*
	*修改
	*/
	function edit(){
		$('#user-form-3').form('submit', {
			url:'/user/update',
    		type:'POST',
    		data:$('#user-form-3').serialize(),
    		success:function(data){
    			if(data > 0){
    				$.messager.alert('信息提示','提交成功！','info');
    				$('#user-dialog-3').dialog('close');
    				$('#pagination').pagination('select');
    			}else{
    				$.messager.alert('信息提示','提交失败！','info');
    			}
    		}
    	});
	}
	
	/* 
	*查询
	*/
	function doSearch(){
		$.ajax({ 
	          type: 'POST', 
	          url: '/user/list', //用户请求数据的URL
	          data: {'usernames':$('#usernames').val(),'departmentnames':$('#departmentnames').val(),'pageNumber':1,'pageSize':10}, 
	          error: function (XMLHttpRequest, textStatus, errorThrown) { 
	              alert(textStatus); 
	          }, 
	          success: function (data) { 
	        	  data =eval("("+data+")");
	              $('#tbMenuGroup').datagrid('loadData', data.rows);
	               $('#pagination').pagination({ 
			    	  total:data.total
			    	  });
	          }
	       });
	}
	
	/*
	*清除搜索框内容
	*/
	function doClear(){
		document.getElementById("departmentnames").value="";
		document.getElementById("usernames").value="";
	}
	</script>


