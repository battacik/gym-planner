package pl.battacik.gymplanner.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.battacik.gymplanner.DayPlan;
import pl.battacik.gymplanner.Exercise;

import java.util.ArrayList;
import java.util.List;

import static pl.battacik.gymplanner.Exercise.*;
import static pl.battacik.gymplanner.Exercise.Type.*;

@Slf4j //tworzy obiekt Logger (log)
@Controller //kandydat do skanowania komponentu i utworzenia SearchBooksController jako komponentu bean
@RequestMapping("/create")
public class ExerciseCreateController {
        @GetMapping
        public String showExerciseForm(Model model){
            int maxId = 0;
            List<Exercise> allExercises = new ArrayList<>();

        // Dodanie przykładowych dzieł
            allExercises.add(new Exercise(maxId++,"Triceps Press", ARMS));
            allExercises.add(new Exercise(maxId++,"Leg Press", LEGS));
            allExercises.add(new Exercise(maxId++,"Barbell Curl", ARMS));
            allExercises.add(new Exercise(maxId++,"Bench Press", CHEST));
            allExercises.add(new Exercise(maxId++,"Pec Fly", CHEST));
            allExercises.add(new Exercise(maxId++,"Dumbbell Row", BACK));
            allExercises.add(new Exercise(maxId++,"Low Row", BACK));
            allExercises.add(new Exercise(maxId++,"Biceps Curl", ARMS));
            allExercises.add(new Exercise(maxId++,"Vertical Row", BACK));
            allExercises.add(new Exercise(maxId++,"Leg Squat", LEGS));
            allExercises.add(new Exercise(maxId++,"Dips", CHEST));
            allExercises.add(new Exercise(maxId++,"Leg Curl", LEGS));

            Type[] types = Exercise.Type.values();
            for (Type type : types) {
                model.addAttribute(type.toString().toLowerCase(),
                        filterByType(allExercises, type));
            }
            model.addAttribute("createTraining", new Training());

            return "exerciseCreateDesigner";
    }

    @PostMapping
    public String processCreate(Training training){
      log.info("Przetwarzanie projektu ćwiczeń: " + training);
      return "redirect:/create/details"; //po zakończeniu przekierowanie
    }

    List<Exercise> filterByType(List<Exercise> itemsList, Exercise.Type type){
        List<Exercise> oneTypeList = new ArrayList<>();

        for (Exercise element : itemsList) {
            if(element.getType() == type){
                oneTypeList.add(element);
            }
        }
        return oneTypeList;
    }
}
