package com.bytech.backend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Users")
public class User {
    @Id
    @JsonIgnore
    private ObjectId id;
    @Indexed(unique = true)
    private String email;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String username;
    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String role;

    public User() {
    }
}
