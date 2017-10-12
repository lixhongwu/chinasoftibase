<html>
<head>
<meta charset="UTF-8">
<title>后台界面</title>
<link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/css/zk.css" />
<link rel="stylesheet" type="text/css" href="/css/themes/icon.css" />
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/js/jquery-easyui-1.5.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
  
  <!--上-->
	<div class="zk-header" data-options="region:'north',border:false,split:true">
		<div class="zk-header-left">
			<h1>后台测试界面</h1>
		</div>
		<div class="zk-header-right">
			<p><strong class="easyui-tooltip" title="无消息">您好</strong>,欢迎您</p>
			<p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
		</div>
	</div>
	
	<!--左-->
	<div class="zk-sidebar" data-options="region:'west',split:true,title:'菜单'" style="width:150px;padding:10px;">
		
		<div class="easyui-accordion" data-options="border:false,fit:true">
			
			<!--选项卡-->
			<div title="快捷菜单" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">  	
    			<ul class="easyui-tree zk-side-tree">
                	<li iconCls="icon-basket"><a data-icon="icon-basket" data-link="/goods/index" iframe="0">商品管理</a></li>
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="temp/layout-3.html" iframe="0">商品分类管理</a></li>
                	<li iconCls="icon-application-cascade"><a href="javascript:void(0)" data-icon="icon-application-cascade" data-link="temp/layout-3.html" iframe="0">订单管理</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">用户管理</a></li>
                </ul>
            </div>
            
		</div>
		
	</div>
	
	<!--主界面-->
	<div class="zk-main" data-options="region:'center'">
		
		<div id="zk-tabs" class="easyui-tabs" data-options="border:false,fit:true">  
            <div title="首页" data-options="closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
		
		
	</div>
	
	<!--下-->
	<div class="zk-footer" data-options="region:'south',border:true,split:true">
		© 2017 后台测试界面, 粤ICP备14024044号-2, All Rights Reserved.
	</div>
	
	
	<script type="text/javascript">
		
		$(function(){
			$('.zk-side-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
		})
		
		
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#zk-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		}
	
	
	
	</script>
	
	
	
</body>
</html>