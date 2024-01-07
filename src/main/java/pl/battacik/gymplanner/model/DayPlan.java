package pl.battacik.gymplanner.model;

import lombok.Data;

@Data
public class DayPlan {
    private int idDay;
    private Training training;
    private String description;
    private String date;
}
