	//加载完毕后.
	$(function() {
		
	});
	
	
	//将微信的服务器同步到本地库
	function synchroMenu(){
		
	}
	
	//定义全局变量,菜单组的ids;
	var menugruopids;
	
	//将菜单刷新到微信服务器
	function submitMenu() {
		
		$.ajax({
			url : '/wxmenu/submitmenu/' + menugruopids,
			type : 'POST',
			success : function(data) {
				if (data == 200) {
					$.messager.alert('信息提示', '更新成功！', 'info');
				} else {
					$.messager.alert('信息提示', '更新失败！', 'info');
				}
			}
		});
	}
	//查看菜单
	function menuView2(value, row, index) {
		var lookBtn ='<button style="background:#51A351" onclick="menuView(\''+ row.ids + '\')">' 
		+ '<span style="color: #FFFFFF">查看</span></button>';
		return lookBtn;
	}
    
	
	//查看菜单详情
	function menuView(ids) {
		//将菜单组ids赋值为全局变量
		menugruopids =ids;
		$('#menuTable').treegrid({    
		    url:'wxmenu/menulist/'+ids,
		    type:'get',
		    idField:'id',    
		    treeField:'title', 
		     columns:[[{
		    	title:'菜单级别',
		    	field:'level',
		    	formatter: 
		    	function(value,row,index){
					if (value==1){
						return "<b><span style='color:#2B2B2B'>一级菜单</span></b>";
					} else {
						return "<span style='color:#AAAAAA'>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp二级菜单</span>";
					}
				},width:100 },
	              {title:'菜单名称',field:'title',width:180},
	              {field:'keyword',title:'关键字',width:80,align:'center'},    
	              {field:'url',title:'菜单链接',width:320},
	              {field:'sort',title:'排序',width:40,align:'center'},
	              {
	  		    	title:'操作',
	  		    	field:'id',
	  		    	align:'left',
	  		    	formatter: 
	  		    	function(value,row){
	  		    		
	  		    		var edit='<a href="#"  onclick="openEditMenu('+row.id+')">编辑</a> ';
	  		    		var del ='&nbsp&nbsp&nbsp&nbsp&nbsp<a href="#" onclick="deleteMenu('+row.id+')">删除</a> ';
	  		    		var addlevelTwo='&nbsp&nbsp&nbsp&nbsp&nbsp <a href="#" onclick="openAddLevelTwoMenu('+row.id+')">创建二级菜单</a> ';
	  		    		
	  					if (value<5){
	  						return edit+del+addlevelTwo;
	  					} else {
	  						return edit+del;
	  					}
	  				},width:240 },
		          ]]   
		});  
		$('#menuDialog').dialog("open");

	}
	
	//编辑菜单
	function openEditMenu(id){
		//判断是否有子菜单
		var ids=JSON.stringify(id);
		var node=$('#menuTable').treegrid('find',ids);
		var item= $('#menuTable').treegrid('getChildren',node.id);
		//如果没有子菜单
		if(item ==0){
			if (node) {
				 $('#menuEditForm').form('load', node);
				if(node.url==""){
					$('#menueditclick').click();
				}else{
					$('#menuediturl').click();
				} 
				$('#menuEditDialog').dialog('open').dialog({
					closed : false,
					modal : true,
					title : "修改菜单信息",
					buttons : [ {
						text : '确定',
						iconCls : 'icon-ok',
						handler : editMenu
					}, {
						text : '取消',
						iconCls : 'icon-cancel',
						handler : function(){
							$('#menuEditDialog').dialog('close');
						}
					}]
				});
			} else {
				$.messager.alert('信息提示', '请选中要修改的数据');
			}
			//如果有子菜单
		}else{
			
			$('#menuEditForm2').form('load', node);
			$('#menuEditDialog2').dialog('open').dialog({
				closed : false,
				modal : true,
				title : "修改菜单信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : editMenu2
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuEditDialog2').dialog('close');
					}
				} ]
			});
		}
	}
	
	
	
	//提交更新菜单
	 function editMenu(){
		$('#menuEditForm').form('submit',{
			url:'wxmenu/updatamenu',
			type:'post',
			success:
				function(data){
				if(data ==200){
					$.messager.alert('信息提示','更新成功','info');
					$('#menuTable').treegrid('reload');
					$('#menuEditDialog').dialog('close');
				}else{
					$.messager.alert('信息提示','更新失败','info');
				}
			}
		})
	} 
	
	//提交更新菜单
	 function editMenu2(){
		
		$('#menuEditForm2').form('submit',{
			url:'wxmenu/updatamenu',
			type:'post',
			success:
				function(data){
				if(data ==200){
					$.messager.alert('信息提示','更新成功','info');
					$('#menuTable').treegrid('reload');
					$('#menuEditDialog2').dialog('close');
				}else{
					$.messager.alert('信息提示','更新失败','info');
				}
			}
		})
	} 
	
	//删除菜单
	function deleteMenu(id){
		
		var items=$('#menuTable').treegrid('find',id);
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
					url : '/wxmenu/deletemenu/' + ids,
					type : 'POST',
					success : function(data) {
						if (data == 200) {
							$.messager.alert('信息提示', '删除成功！', 'info');
							$('#menuTable').treegrid('reload')
							//$('#pagination').pagination('select');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
					}
				});
			}
		});
	}
	
	//打开添加一级菜单
	function openAddLevelOneMenu(){
		
		var item= $('#menuTable').treegrid('getRoots');
		
		if(item.length < 3){
			
			$('#menuAddForm').form('clear');
			$('#addMenuGid').val(menugruopids);
			$('#addMenuPid').val(menugruopids);
			$('#menuAddDialog').dialog({
				closed : false,
				modal : true,
				title : "添加信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : addLevelOneMenu
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuAddDialog').dialog('close');
					}
				} ]
			});
			$('#menuurl').click();
		}else{
			$.messager.alert('信息提示', '最多只能添加三个一级菜单！', 'info');
		}
	}
	//添加一级菜单
	function addLevelOneMenu(){
		
		$('#menuAddForm').form('submit', {
			url : '/wxmenu/addlevelonemenu',
			type : 'POST',
			success : function(data) {
				//alert(data);
				if (data > 0) {
					$('#menuTable').treegrid('reload');
					$('#menuAddDialog').dialog('close');
					$.messager.alert('信息提示', '提交成功！', 'info');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}
	
	//打开添加二级菜单
	function openAddLevelTwoMenu(id){
		
		var node = $('#menuTable').treegrid('find',id);
		
		var item= $('#menuTable').treegrid('getChildren',node.id);
		if(item.length <5 ){
			
			$('#menuTwoAddForm').form('clear');
			$('#ptitle').val(node.title);
			$('#addTwoMenuGid').val(menugruopids);
			$('#addTwoMenuPid').val(node.ids);
			$('#menuTwoAddDialog').dialog({
				closed : false,
				modal : true,
				title : "添加信息",
				buttons : [ {
					text : '确定',
					iconCls : 'icon-ok',
					handler : addLevelTwoMenu
				}, {
					text : '取消',
					iconCls : 'icon-cancel',
					handler : function() {
						$('#menuTwoAddDialog').dialog('close');
					}
				} ]
			});
			$('#menuTwoUrl').click();
		}else{
			$.messager.alert('信息提示', '最多只能添加五个二级菜单！', 'info');
		}
	}
	
	//添加二级菜单
	function addLevelTwoMenu(){
		
		$('#menuTwoAddForm').form('submit', {
			url : '/wxmenu/addleveltwomenu',
			type : 'POST',
			success : function(data) {
				if (data > 0) {
					$('#menuTable').treegrid('reload');
					$('#menuTwoAddDialog').dialog('close');
					$.messager.alert('信息提示', '提交成功！', 'info');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/**
	 * Name 添加菜单组记录
	 */
	function add() {

		$('#menuGroupAddForm').form('submit', {
			url : '/wxmenu/addmenugroup',
			type : 'POST',
			success : function(data) {
				//alert(data);
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
	 * Name 删除菜单组记录
	 */
	function remove() {
		var items = $('#menu-datagrid').datagrid('getSelections');
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
							$('#menu-datagrid').datagrid('reload');
							//$('#pagination').pagination('select');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
					}
				});
			}
		});
	}

	/**
	 * Name 打开添加菜单组窗口
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
	 * Name 打开菜单组修改窗口
	 */
	function openEdit() {
		var row = $("#menu-datagrid").datagrid('getSelected');
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
	 *提交编辑菜单组
	 */
	function edit() {
		$('#menuGroupEditForm').form('submit', {
			url : '/wxmenu/updatemenugroup',
			type : 'POST',
			success : function(data) {
				if (data == 200) {
					$.messager.alert('信息提示', '提交成功！', 'info');
					$('#menuGroupEditDialog').dialog('close');
					$('#menu-datagrid').datagrid('reload');
					//$('#pagination').pagination('select');
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

