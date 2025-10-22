package com.example.socialmediarestapi.Model;



import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPreview {

    private String id; // UUID ou auto-généré

    @Pattern(regexp = "mr|miss|dr|", message = "Titre invalide")
    private String title;

    @Size(min = 2, max = 50)
    private String firstName;

    @Size(min = 2, max = 50)
    private String lastName;

    private String picture; // URL de la photo
}
