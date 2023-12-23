package pl.battacik.gymplanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //określenie klasy jako komponentu
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
