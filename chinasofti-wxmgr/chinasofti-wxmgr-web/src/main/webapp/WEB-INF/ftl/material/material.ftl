<script type="text/javascript" src="js/common.js"></script>
<div class="easyui-layout" data-options="fit:true">
    <!-- Begin of toolbar -->
    <div id="user-toolbar-2">
        <div class="user-toolbar-button">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-excel" onclick="print()" plain="true">导出</a>
        </div>
        <div class="user-toolbar-search">
            <label>用户名：</label> 
			<input type="text" id="name" name="name" />
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">开始检索</a>
        </div>
    </div>
    
    <!-- 显示数据,数据表格列对齐 -->
    <table class="easyui-datagrid" title="素材列表" url="wxmaterial/getlist"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'post'">
    	<thead>
    		<tr>
    			<th data-options="field:'media_id',width:150,align:'center'">文件编号</th>
				<th data-options="field:'name',width:200,align:'center'">文件名称</th>
				<th data-options="field:'update_time',width:200,align:'center'">创建时间</th>
				<th data-options="field:'url',width:300,align:'center'">文件路径</th>
    		</tr>
    	</thead>
    </table>
</div>   


