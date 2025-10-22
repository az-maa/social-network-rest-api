package com.example.socialmediarestapi.Model;



import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFull {

    private String id; // UUID ou auto-généré

    @Pattern(regexp = "mr|miss|dr|", message = "Titre invalide")
    private String title;

    @Size(min = 2, max = 50)
    private String firstName;

    @Size(min = 2, max = 50)
    private String lastName;

    @Email
    private String email;

    private String dateOfBirth; // ISO Date yyyy-MM-dd

    private LocalDateTime registerDate; // généré automatiquement

    private String phone;

    private String picture; // URL

    private Location location; // objet Location
}
