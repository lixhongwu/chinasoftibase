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
    </div>
    
    <!-- 显示数据,数据表格列对齐 -->
    <table id="tbMenuGroup" class="easyui-datagrid" title="微信组名称列表" 
			data-options="singleSelect:true,collapsible:true,url:'',method:'get'">
    	<thead>
    		<tr>
    			<th data-options="field:'title',width:200,align:'center'">菜单标题</th>
    			<th data-options="field:'keyword',width:250,align:'center'">关键字</th>
				<th data-options="field:'isShow',width:200,align:'center'">URL</th>
				<th data-options="field:'isShow',width:200,align:'center'">是否展示</th>
				<th data-options="field:'appid',width:300,align:'center'">菜单描述</th>
				<!-- <th width="6%" align="center" data-options="formatter:mainBtnFormatter">查看</th> -->
    		</tr>
    	</thead>
    </table>
    <div id="pagination" style="background:#efefef;border:1px solid #ccc;"></div>
</div>  

!-- 分类添加表格 -->
<div id="menuGroupAddDialog" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px ">
	<form id="menuGroupAddForm" method="post" >
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
<div id="menuGroupEditDialog" class="easyui-dialog"
	data-options="closed:true,iconCls:'icon-save'"
	style="width: 400px; padding: 10px;">
	<form id="menuGroupEditForm" method="post">
		<table id="update">
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
			<tr>
				<td>
				<input type="text" id="ids" hidden="hidden" name="ids" class="user-text" />
				</td>
			<tr>
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
	
	//绑定双击事件

	
	$('#tbMenuGroup').datagrid({
			//双击事件
			onDblClickRow : function(rowIndex, rowData) {
				alert(JSON.stringify(rowData));
				
			}
		});

	});

	/*
	 * 分类状态
	 */
	function statesFormatter(value) {
		if (value == "0") {
			return '<span style="color:red">未开启</span>';
		} else {
			return '<span style="color:green">已启用</span>';
		}
	}

	function imgFormatter(value, row) {
		var str = "";
		if (value != "" || value != null) {
			str = "<img style=\"height: 80px;width: 150px;\" src=\""+value+"\"/>";
			return str;
		}
	}

	function choose1() {
		var str = "";

	}
	/*
	将菜单更新到微信服务器
	 */

	function submitMenu() {

	}

	/**
	 * Name 添加记录
	 */
	function add() {

		$('#menuGroupAddForm').form('submit', {
			url : '/wxmenu/addmenugroup',
			type : 'POST',
			success : function(data) {
				alert(data);
				if (data > 0) {
					$('#pagination').pagination('select');
					$('#menuGroupAddDialog').dialog('close');
					$.messager.alert('信息提示', '提交成功！', 'info');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/**
	 * Name 删除记录
	 */
	function remove() {
		var items = $('#tbMenuGroup').datagrid('getSelections');
		var ids = [];
		if (items.length < 1) {
			$.messager.alert('温馨提醒', '请选中要删的数据');
			return;
		}
		$.messager.confirm('信息提示', '确定要删除该记录？', function(result) {
			if (result) {
				$(items).each(function() {
					ids.push(this.ids);
				});
				$.ajax({
					url : '/wxmenu/deleteMenuGroup/' + ids,
					type : 'POST',
					success : function(data) {
						if (data == 200) {
							$.messager.alert('信息提示', '删除成功！', 'info');
							$('#tbMenuGroup').datagrid('reload')
							$('#pagination').pagination('select');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
					}
				});
			}
		});
	}

	/**
	 * Name 打开添加窗口
	 */
	function openAdd() {
		$('#menuGroupAddForm').form('clear');
		$('#menuGroupAddDialog').dialog({
			closed : false,
			modal : true,
			title : "添加信息",
			buttons : [ {
				text : '确定',
				iconCls : 'icon-ok',
				handler : add
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#menuGroupAddDialog').dialog('close');
				}
			} ]
		});
	}

	/**
	 * Name 打开修改窗口
	 */
	function openEdit() {
		var row = $("#tbMenuGroup").datagrid('getSelected');
		if (row) {
			//alert(JSON.stringify(row));
			$('#menuGroupEditDialog').dialog('open').dialog({
				closed : false,
				modal : true,
				title : "修改订单信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : edit
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuGroupEditDialog').dialog('close');
					}
				} ]
			});
			$('#menuGroupEditForm').form('load', row);
		} else {
			$.messager.alert('信息提示', '请选中要修改的数据');
		}
	}

	/*
	 *修改
	 */
	function edit() {
		$('#menuGroupEditForm').form('submit', {
			url : '/wxmenu/updatemenugroup',
			type : 'POST',
			//data:$('#menuEditForm').serialize(),
			success : function(data) {
				alert(data);
				if (data == 200) {
					$.messager.alert('信息提示', '提交成功！', 'info');
					$('#menuGroupEditDialog').dialog('close');
					$('#pagination').pagination('select');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/* 
	 *查询
	 */
	function doSearch() {
		$.ajax({
			type : 'POST',
			url : '/user/list', //用户请求数据的URL
			data : {
				'usernames' : $('#usernames').val(),
				'departmentnames' : $('#departmentnames').val(),
				'pageNumber' : 1,
				'pageSize' : 10
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert(textStatus);
			},
			success : function(data) {
				data = eval("(" + data + ")");
				$('#tbMenuGroup').datagrid('loadData', data.rows);
				$('#pagination').pagination({
					total : data.total
				});
			}
		});
	}

	/*
	 *清除搜索框内容
	 */
	function doClear() {
		document.getElementById("departmentnames").value = "";
		document.getElementById("usernames").value = "";
	}
</script>


