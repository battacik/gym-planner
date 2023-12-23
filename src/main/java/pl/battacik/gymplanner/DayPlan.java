package pl.battacik.gymplanner;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import pl.battacik.gymplanner.web.Training;

import java.util.List;

@Data
public class DayPlan {
    private Training training;
    private String description;
    private String date;
}
