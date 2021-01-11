package org.zerock.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import javafx.scene.chart.PieChart.Data;
import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Controller // 여기 안에  component이 포함됨.
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
	log.info("basic - - - - - -");
	}
	
	@RequestMapping(value="/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("basic get -------------");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic2 get-----------");
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name :" + name );
		log.info("age : " + age);
		
		return "ex02";
	}
	
	//133 page
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids : " + Arrays.toString(ids));
		
		return "ex02Array";
	}
	
	//132page
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids : " + ids);
		
	 return "ex02List";
	}
	
	//130P
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		
		return "ex01";
	}
	
	//134p
	// http://localhost:8080/sample/ex02Bean?list[0].name=aaa&list[1].name=bbb
	// http://localhost:8080/sample/ex02Bean?list%5B0%5D.name=aaa&list%5B1%5D.name=bbb
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos : " + list);
		
		return "ex02Bean";
	}
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(Data.class, new CustomDateEditor(dateFormat, false));
//	}
		
//	137p
//	/sample/ex03?title=test&dueData=2021-01-11
//	/sample/ex03?title=test&dueData=2021/01/11
	 @GetMapping("/ex03")
	 public String ex03(TodoDTO todto) {
		 log.info("todo : " + todto);
		 return "ex03";
	 }
	 
	 //140P
//	 /sample/ex04?name=java&age=100&page=55
	 @GetMapping("/ex04")
	 public String ex04(SampleDTO dto,@ModelAttribute("page") int page) {
		 
		 log.info("dto : " + dto);
		 log.info("page : " + page);
		 
		 return "/sample/ex04";
	 }
	 
	 //146~147p
	 @GetMapping("/ex06")
	 public @ResponseBody SampleDTO ex06() {
		 SampleDTO dto = new SampleDTO();
		 dto.setAge(10);
		 dto.setName("홍길동");
		 
		 return dto;
	 }

}
