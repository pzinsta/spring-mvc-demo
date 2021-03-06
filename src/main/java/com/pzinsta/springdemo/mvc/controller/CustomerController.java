package com.pzinsta.springdemo.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pzinsta.springdemo.mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }
    
    @RequestMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        
        return "customerForm";
    }
    
    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, Errors errors) {
        
        if(errors.hasErrors()) {
            return "customerForm";
        }
        
        return "customerConfirmation";
    }
}

