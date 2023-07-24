
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.usermodel;
import com.example.demo.Service.demoservice;

@Controller
public class democontroller {
  @Autowired
  demoservice demo;

  @GetMapping("/")
  public String home() {
    return "index";
  }

  @PostMapping("/tabledata")
  public String welString(@ModelAttribute usermodel u, Model mod) {
    demo.add(u);

    mod.addAttribute("data", demo.show());

    return "table";
  }
}
