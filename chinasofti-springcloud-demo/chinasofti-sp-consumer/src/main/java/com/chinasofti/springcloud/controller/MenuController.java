package com.chinasofti.springcloud.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import utils.JsonUtils;

/**
 * 菜单管理消费端controller
 * 
 * @author chen
 *
 */
@RestController
@RequestMapping("/cms")
public class MenuController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${menu.menuServicePath}")
	private String menuServicePath;

	/**
	 * 全部(条件)查询
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("/list")
	public String findAll() {

		@SuppressWarnings("unchecked")
		List<LinkedHashMap> list = this.restTemplate.getForObject(this.menuServicePath + "cmsmenu/list", List.class);
		
		//树json转换
		List<LinkedHashMap> tempList2 = converToTreeJson(list);
		return JsonUtils.objectToGsonString(tempList2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<LinkedHashMap> converToTreeJson(List<LinkedHashMap> list) {
		List<LinkedHashMap> tempList = new ArrayList<>();
		List<LinkedHashMap> tempList2 = new ArrayList<>();
		List<LinkedHashMap> tempList3 = new ArrayList<>();
		tempList.addAll(list);
		for (int i = 0; i < list.size(); i++) {
			LinkedHashMap parent = list.get(i);
			List<LinkedHashMap> children = new ArrayList<>();
			for (int j = 0; j < tempList.size(); j++) {
				LinkedHashMap son = tempList.get(j);
				if (son.get("pid") == parent.get("id")) {
					children.add(son);
					tempList3.add(son);
					parent.put("children", children);
				}
			}
			tempList2.add(parent);
		}
		tempList2.removeAll(tempList3);
		return tempList2;
	}

}
