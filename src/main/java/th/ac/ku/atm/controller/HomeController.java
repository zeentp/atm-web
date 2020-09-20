package th.ac.ku.atm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model  ) {
        model.addAttribute("greeting","Sawaddee");
        // return home.html
        return "home";
    }

}
