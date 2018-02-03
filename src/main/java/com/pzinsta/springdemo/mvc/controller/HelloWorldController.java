package com.pzinsta.springdemo.mvc.controller;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "helloWorldForm";
    }

    @RequestMapping("process-form-shout")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        model.addAttribute("message", generateMessage(name));

        return "helloWorld";
    }

    private String generateMessage(String name) {
        return Optional.ofNullable(name).map(String::toUpperCase).map("Yo! "::concat).orElse("");
    }

    @RequestMapping("process-form-with-request-param")
    public String letsShoutDueWithRequestParameter(@RequestParam("studentName") String name, Model model) {

        model.addAttribute("message", generateMessage(name));

        return "helloWorld";
    }
}
