package pl.battacik.gymplanner.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.EnumType;

@Entity
@Data
public class Exercise {
    @Id
    private final int id;
    private final String name;

    @Enumerated(EnumType.STRING)
    private final Type type;

    public static enum Type{
        ARMS, CHEST, BACK, LEGS;
    }


}
