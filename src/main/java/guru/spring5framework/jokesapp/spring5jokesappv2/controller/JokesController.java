package guru.spring5framework.jokesapp.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping("/")
    public String getRandomJoke(Model model){

        model.addAttribute("joke", null);
        return "index";
    }


}
