package com.example.socialmediarestapi.Model;



import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Size(min = 5, max = 100)
    private String street;

    @Size(min = 2, max = 30)
    private String city;

    @Size(min = 2, max = 30)
    private String state;

    @Size(min = 2, max = 30)
    private String country;

    private String timezone; // format +7:00, -1:00
}
