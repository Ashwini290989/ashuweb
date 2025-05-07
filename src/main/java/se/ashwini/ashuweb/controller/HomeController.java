package se.ashwini.ashuweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.ashwini.ashuweb.models.HockeyPlayerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController extends BaseController {
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;
    @GetMapping("/")
    public String home(Model model) {
    //return "home"; // name for html file
        // get data from database- text with list for hockey player
       // List<String> players = new ArrayList<>();
//        players.add("dhairya");
//        players.add("ash");
//        players.add("rakesh");
        model.addAttribute("players", hockeyPlayerRepository.findAll());
        model.addAttribute("user","dhairya");
        return "home";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        String user = getLoggedInEmail();
        model.addAttribute("user", user);
        return "profile";
    }
}
