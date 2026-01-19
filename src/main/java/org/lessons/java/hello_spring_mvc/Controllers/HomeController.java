package org.lessons.java.hello_spring_mvc.Controllers;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class HomeController {
  
  @GetMapping("/")
  public String home(){
    return "Home";
  }

  @GetMapping("/greetings")
  public String Welcome(@RequestParam(name = "name") String name, Model model){
    model.addAttribute("email", "ekqb@gmail.com");
    model.addAttribute("currentDate", LocalTime.now());
    model.addAttribute("name", name);

    return "greetings";
  }

}
