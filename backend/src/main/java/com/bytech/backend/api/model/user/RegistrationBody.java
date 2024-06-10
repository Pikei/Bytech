package com.bytech.backend.api.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegistrationBody {
    @NotNull
    @NotBlank
    @Email
    private String email;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    @NotBlank
    private String lastName;
    @NotNull
    @NotBlank
    @Size(min = 3, max = 255)
    private String username;
    @NotNull
    @NotBlank
    private String role;
    @NotNull
    @NotBlank
    //Minimum eight characters, at least one letter, one number and one special character
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")
    @Size(min = 8, max = 32)
    private String password;
}
