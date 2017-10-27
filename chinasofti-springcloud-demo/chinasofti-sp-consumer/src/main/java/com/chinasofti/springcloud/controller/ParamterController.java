package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.common.sp.entity.SpParameterManage;
import com.chinasofti.common.utils.JsonUtils;

/**
 * param控制器 访问方式启动本地eureka服务器和服务提供者，通过ip+port加上/param后面跟对应方法的参数
 * @author hasee
 *
 */
@RestController
@RequestMapping("/param")
public class ParamterController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.goodServicepath}")
	private String goodServicepath;
	
	
	/**
	 * 参数列表获取展示
	 * @param spParameterManage
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public  ResponseEntity<String> findAll(SpParameterManage  spParameterManage)  {
		//将参数实体类转换成一个map集合，然后利用restTemplate的postforEntity
		HttpEntity<LinkedMultiValueMap<String, String>>  list = transmitObject(spParameterManage);
		ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "param/list", list,
				String.class);
		return response;
	}
	/**
	 * 根据参数id查询对应的参数内容
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	public String getParamByID(@PathVariable int ids) {
		//根据restTemplate的获取对象方法，将获取到的javabean用封装好的对象转字符串方法进行强转并返回
		SpParameterManage  spParameterManage=restTemplate.getForObject(this.goodServicepath+"param/select/"+ids, SpParameterManage.class);
		return JsonUtils.objectToGsonString(spParameterManage);
	}
	/**
	 * 新增一条参数控制
	 * @param spParameterManage
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public ResponseEntity<String> addParam(SpParameterManage spParameterManage){
		HttpEntity<LinkedMultiValueMap<String, String>>  list = transmitObject(spParameterManage);
		ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "param/add", list,
				String.class);
		return response;
	}
	/**
	 * 修改一条参数
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<String> updateParamById(SpParameterManage spParameterManage) {
    	HttpEntity<LinkedMultiValueMap<String, String>> sp = transmitObject(spParameterManage);
    	ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "param/update", sp,
				String.class);
		return response;
	}
    
    /**
     * 删除一条参数数据
     * @param ids
     * @return
     */
    @RequestMapping(value = "/delete/{ids}")
    public String deleteParamById(@PathVariable int ids) {
    	return this.restTemplate.getForObject(this.goodServicepath+"param/delete/"+ids, String.class);
    }
    
    /**
     * 访问参数列表界面
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView getView() {
    	return  new ModelAndView("/param/main");
    }
    
    
    
    
	/**
	 * 对象转集合
	 * @param object
	 * @return
	 */
	public HttpEntity<LinkedMultiValueMap<String, String>> transmitObject(Object object){
		
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

		String objectToString = JsonUtils.objectToGsonString(object);

		map.add("postParmainfo", objectToString);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<LinkedMultiValueMap<String, String>> he = new HttpEntity<LinkedMultiValueMap<String, String>>(map,
				headers);

		return he;
		
	}
}
