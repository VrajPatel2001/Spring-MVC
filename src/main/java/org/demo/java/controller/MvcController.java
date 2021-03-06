package org.demo.java.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class MvcController {


    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model)
    {
        model.addAttribute("message", "Hello from first controller");
        return "mvc-view-template";
    }
}
 