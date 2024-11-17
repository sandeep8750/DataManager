package com.sandeep.ContactManger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PageController {

    @GetMapping("/")
    public String getIndex() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("about page loading boss ");
        return "about";
    }

    //service
    @RequestMapping("/services")
    public String servicePage() {
        System.out.println("service page loading boss ");
        return "services";
    }

    //Contact
    @RequestMapping("/contact")
    public String contact() {
        System.out.println("service page loading boss ");
        return "contact";
    }

    // login
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/login")
//    public String login(String s){
//        return "login";
//    }

}
