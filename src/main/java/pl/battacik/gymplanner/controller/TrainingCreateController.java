package pl.battacik.gymplanner.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.battacik.gymplanner.model.DayPlan;


@Slf4j //tworzy obiekt Logger (log)
@Controller //kandydat do skanowania komponentu i utworzenia SearchBooksController jako komponentu bean
@RequestMapping("/new/training/details")
public class TrainingCreateController {
    @GetMapping
    public String detailsDesignerForm(Model model){
        model.addAttribute("exerciseDetails", new DayPlan());

        return "trainingCreateDesigner"; //obsługa GET: zwraca nazwę widoku
    }

    @PostMapping
    public String processDayPlan(DayPlan dayPlan){
        log.info("Trening utworzony: " + dayPlan);
        return "redirect:/";
    }

}
