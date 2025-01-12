package com.example.Student.Management.System.Mapper;

import com.example.Student.Management.System.dto.AddStudentRequest;
import com.example.Student.Management.System.model.Student;
import lombok.experimental.UtilityClass;


@UtilityClass
public class StudentMapper {

    public  Student mapToStudent(AddStudentRequest studentRequest){
        return Student.builder()
                .name(studentRequest.getName())
                .age(studentRequest.getAge())
                .course(studentRequest.getCourse())
                .email(studentRequest.getEmail())
                .build();
    }
}
