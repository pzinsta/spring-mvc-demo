package com.pzinsta.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pzinsta.springdemo.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        
        model.addAttribute("student", new Student());
        
        return "studentForm";
    }
    
    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student") Student student) {
        return "studentConfirmation";
    }
    
}
