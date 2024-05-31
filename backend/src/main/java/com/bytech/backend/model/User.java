package com.bytech.backend.model;

import com.mongodb.lang.NonNull;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Users")
public class User {
    @Id
    @NonNull
    private ObjectId id;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User() {
    }
}
