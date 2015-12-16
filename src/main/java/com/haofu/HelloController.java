package com.haofu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
	}

	/**
	 * 详情页
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "detail")
	public String detail(ModelMap model) {
		model.addAttribute("data", "detail");
		return "detail";
	}

	/**
	 * 登录页跳转
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "login")
	public String login(ModelMap model) {
		return "login";
	}

	/**
	 * 搜索跳转
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "s")
	public String search(ModelMap model) {
		model.addAttribute("data", "detail");
		return "result";
	}


}