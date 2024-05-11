package com.example.crudd.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private String confirmPassword;

}
