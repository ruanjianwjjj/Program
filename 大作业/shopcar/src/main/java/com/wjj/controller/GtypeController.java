package com.wjj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wjj.entity.Gtype;
import com.wjj.service.GtypeService;

@Controller
@RequestMapping("/gtype")
public class GtypeController {
	@Autowired     
	private GtypeService gtypeService;
	
	@RequestMapping(value="typeadd.html",method=RequestMethod.GET)
	public String typeadd() {
		return "gtype/TypeAdd";
	}
	
	
	
	@RequestMapping(value="/typeadd",method=RequestMethod.POST)
	public ModelAndView typeadd(Gtype gtype) {	
		ModelAndView mv = new ModelAndView();
		gtypeService.addGtype(gtype);
		mv.setViewName("gtype/TypeManage");
		mv.addObject("gtype", gtype);
		return mv;
	}
	/*@RequestMapping(value="/typeadd",method=RequestMethod.POST)
	public String typeadd(Gtype gtype,ModelMap map) {	
		map.addAttribute("gtype", gtype);
		return "gtype/TypeManage";
	}*/
	
	
}
