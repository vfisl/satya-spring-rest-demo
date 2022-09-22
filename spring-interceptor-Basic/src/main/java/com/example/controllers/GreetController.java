package com.example.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
   @GetMapping("/greet/{username}")
   public String greet(HttpServletRequest httpServletRequest, @PathVariable("username")String username)
   {
	   String message=(String)httpServletRequest.getAttribute("message");
	   System.out.println(message);
	   httpServletRequest.setAttribute("newmessage","great Job"+ message);
	   return "Have a Great day "+username;
   }
}
