package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SampleController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login() {
		return new ModelAndView(new RedirectView("/"));
	}

}
