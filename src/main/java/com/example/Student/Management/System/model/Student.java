package com.example.Student.Management.System.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 50,nullable = false)
    String name;

    @Column(nullable = false)
    @Positive
    int age;

    @Column(length = 50 ,nullable = false)
    String course;

    @Email
    @Column(length = 100,nullable = false,unique = true)
    String email;




}
