package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardServcice;
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "list";
	}
	
	
}