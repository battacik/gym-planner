package pl.battacik.gymplanner;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data //udostępnia gettery, settery i konstruktor dla zmiennych final
@RequiredArgsConstructor
public class Exercise {
    private final int id;
    private final String name;
    private final Type type;

    public static enum Type{
        ARMS, CHEST, BACK, LEGS;
    }


}
