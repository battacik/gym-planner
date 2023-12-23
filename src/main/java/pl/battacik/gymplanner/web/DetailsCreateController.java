package pl.battacik.gymplanner.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.battacik.gymplanner.DayPlan;


@Slf4j //tworzy obiekt Logger (log)
@Controller //kandydat do skanowania komponentu i utworzenia SearchBooksController jako komponentu bean
@RequestMapping("/create/details")
public class DetailsCreateController {
    @GetMapping
    public String detailsDesignerForm(Model model){
        model.addAttribute("exerciseDetails", new DayPlan());

        return "detailsCreateDesigner"; //obsługa GET: zwraca nazwę widoku
    }

    @PostMapping
    public String processDayPlan(DayPlan dayPlan){
        log.info("Trening utworzony: " + dayPlan);
        return "redirect:/";
    }

}
