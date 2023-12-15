package pl.battacik.bookstore;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data //udostępnia gettery, settery i konstruktor dla zmiennych final
@RequiredArgsConstructor
public class Items {
    private final int id;
    private final String title;
    private final String author;
    private final Type genre;

    public static enum Type{
        PRE_SOCRATICS, SOPHISTS, SOCRATES, PLATO, ARISTOTELE, EPICUREANISM, STOICISM;
    }
}
