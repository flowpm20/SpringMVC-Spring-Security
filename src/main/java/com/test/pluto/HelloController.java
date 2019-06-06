package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
  @RequestMapping(value = "/hello",method = RequestMethod.POST)
  public String printHellow(ModelMap modelMap){
    System.out.println("***Estoy en el HelloController***");

    //message is an attribute in hello.jsp
    modelMap.addAttribute("message", "Hello from the oldest planet, yes, Pluto is a planet !");
    //transform hello to hello.jsp
    return "hello";
  }
}
