package com.example.Student.Management.System.Controller;

import com.example.Student.Management.System.Exception.ResourceNotFoundException;
import com.example.Student.Management.System.Service.StudentService;
import com.example.Student.Management.System.Repository.StudentRepository;
import com.example.Student.Management.System.dto.AddStudentRequest;
import com.example.Student.Management.System.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody @Valid AddStudentRequest addStudentRequest){
        Student addedStudent = studentService.addStudent(addStudentRequest);
        return new ResponseEntity<>(addedStudent, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id :" + id));
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable int id, @RequestBody AddStudentRequest studentRequest){
        Student student = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student not found with id :" + id));
        student.setName(studentRequest.getName());
        student.setAge(studentRequest.getAge());
        student.setCourse(studentRequest.getCourse());
        student.setEmail(studentRequest.getEmail());
        studentRepository.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteStudentById(@PathVariable int id){
        Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id :" + id));
        studentRepository.delete(student);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
