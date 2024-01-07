package pl.battacik.gymplanner.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class User {
    @NotBlank(message="Należy podać nazwę użytkownika")
    private String username;

    @NotBlank(message="Należy podać imię")
    private String name;

    @NotBlank(message="Należy podać nazwisko")
    private String surname;

    @Email(message="Niepoprawna wartość maila")
    private String email;

    @NotBlank(message="Podanie miejscowości jest obowiązkowe.")
    private String city;
}
