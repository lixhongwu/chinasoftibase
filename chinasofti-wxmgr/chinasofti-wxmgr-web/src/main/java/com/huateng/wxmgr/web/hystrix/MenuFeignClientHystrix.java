package com.huateng.wxmgr.web.hystrix;

import java.util.Map;

import org.springframework.stereotype.Component;
import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.feign.MenuFeign;
import net.sf.json.JSONObject;

@Component
public class MenuFeignClientHystrix implements MenuFeign {

	@Override
	public WxMenu findById(String id) {
		return null;
	}
	/**
	 * 获取列表熔断
	 */
	@Override
	public JSONObject findGroupByPage() {
		JSONObject json = new JSONObject();
//		String str= "{'rows':[{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':0,'rows':0,'title':'微信当前菜单','url':'','isShow':1,'total':0,'appid':'wxa41dbfbeb5dedf3b','urltoken':'hvhyny1406205407','ids':'wxa41dbfbeb5dedf3b_weixin','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':0,'rows':0,'title':'微信当前菜单','url':'','isShow':1,'total':0,'appid':'wx5536aef9f659de24','urltoken':'a9740b1436340736','ids':'wx5536aef9f659de24_weixin','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':0,'rows':0,'title':'微信当前菜单','url':'','isShow':1,'total':0,'appid':'wx3a1cee4ec3d84b71','urltoken':'gqjlae1429244685','ids':'wx3a1cee4ec3d84b71_weixin','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':0,'rows':0,'title':'微信当前菜单','url':'','isShow':1,'total':0,'appid':'wx9d4ac36b8036a0b0','urltoken':'f991e91438158578','ids':'wx9d4ac36b8036a0b0_weixin','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':1,'rows':0,'title':'o2o','url':'','isShow':1,'total':0,'appid':'wxa41dbfbeb5dedf3b','urltoken':'hvhyny1406205407','ids':'c5db95d9344348f5aa67ab34c5ac03c2','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':1,'rows':0,'title':'测试','url':'','isShow':1,'total':0,'appid':'wxd6d982e4d9e7cc43','urltoken':'ff1de91458831949','ids':'c772819f1c2347cfa080fac56cef2a72','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':1,'rows':0,'title':'测试菜单','url':'','isShow':1,'total':0,'appid':'wxe8a3ec89cb75eea4','urltoken':'37e69a1445843078','ids':'f6d27da83272436d8af35bd395da1273','page':0,'keyword':'','order':''},{'gid':'','pageNumber':0,'level':0,'pageSize':0,'pid':'','sort':0,'rows':0,'title':'微信当前菜单','url':'','isShow':1,'total':0,'appid':'wxe8a3ec89cb75eea4','urltoken':'37e69a1445843078','ids':'wxe8a3ec89cb75eea4_weixin','page':0,'keyword':'','order':''}],'total':8}";
		String str ="call获取列表失败";
		JSONObject object = json.fromObject(str);
		return object;
	}

//	@Override
//	public String addMenuGroup(WxMenu wxMenu) {
//		return "callback添加失败";
//	}
	
	/**
	 * 删除菜单组熔断
	 */
	@Override
	public String deleteMenuGroup(String id) {
		return "call删除失败";
	}
	/**
	 * 添加菜单组熔断
	 */
	@Override
	public String addMenuGroup(Map<String,String> map) {
		return "call添加失败";
	}
	/**
	 * 更新菜单组熔断
	 */
	@Override
	public String updateMenuGroup(Map<String, String> map) {
		// TODO Auto-generated method stub
		return "call更新失败";
	}
	/**
	 * 
	 */
	@Override
	public String findMenu(String gid) {
		// TODO Auto-generated method stub
		return "call获取菜单失败";
	}

}
