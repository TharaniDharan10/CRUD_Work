package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Mapper.StudentMapper;
import com.example.Student.Management.System.Repository.StudentRepository;
import com.example.Student.Management.System.dto.AddStudentRequest;
import com.example.Student.Management.System.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(AddStudentRequest addStudentRequest) {
        Student student = StudentMapper.mapToStudent(addStudentRequest);
        return studentRepository.save(student);
    }
}
