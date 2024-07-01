package com.ELearningModel.Elearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name= "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "username", nullable = false, unique = true)
    private String username;
    @Column(name= "password", nullable = false)
    private  String password;
    @Column(name= "name", nullable = false)
    private String name;
    @Column(name= "surname", nullable = false)
    private String surname;
    @Column(name= "email", nullable = false)
    private String email;
    @Column(name = "registration_date")
    private LocalDate date;
    private String details;

    public User(String username, String password, String name, String surname, String email, LocalDate date){
        this.username=username;
        this.password=password;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.date=date;
    }
   public User(String details){
        this.details=details;
   }
}
