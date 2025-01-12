package com.example.Student.Management.System.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddStudentRequest {

    @NotBlank(message = "Student name shouldnot be blank")
    String name;

    @Positive(message = "age should be positive")
//    @NotBlank(message = "Student age shouldnot be blank")
    int age;

    @NotBlank(message = "Student course shouldnot be blank")
    String course;

    @NotBlank(message = "Student email shouldnot be blank")
    String email;
}
