package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        Date date=new Date();
        model.addAttribute("title", "I have successfuly built a Vasu sprint boot application using Maven");
        model.addAttribute("msg", "This application is deployed by vasu on to Kubernetes using Argo CD"+" & Date is:"+date);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
