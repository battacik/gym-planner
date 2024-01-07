package pl.battacik.gymplanner.model;

import lombok.Data;

import java.util.List;

@Data
public class Training {
    private int trainingId;
    private String description;
    private List<String> exercisesList;
}
