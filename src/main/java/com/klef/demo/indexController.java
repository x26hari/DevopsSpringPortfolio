package com.klef.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController 
{
	@RequestMapping("index")
	public String main()
	{
		return "index.html";
	}
	@RequestMapping("aboutme")
	public String aboutme()
	{
		return "aboutme.html";
	}
	@RequestMapping("photo")
	public String photo()
	{
		return "photo.html";
	}
	@RequestMapping("contact")
	public String contact()
	{
		return "contact.html";
	}
	@RequestMapping("projects")
	public String projects()
	{
		return "projects.html";
	}
}
