package pl.battacik.gymplanner.web;

import lombok.Data;

import java.util.List;

@Data
public class Training {
    private int trainingId;
    private String name;
    private List<String> exercisesList;
}
