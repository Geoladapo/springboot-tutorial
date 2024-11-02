package com.oladapo.spingRest.Controller;

import com.oladapo.spingRest.Entity.Student;
import com.oladapo.spingRest.utils.StudentErrorResponse;
import com.oladapo.spingRest.utils.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> theStudents;

    @PostMapping
    public void loadData() {
        theStudents = new ArrayList<Student>();

        theStudents.add(new Student("John", "Doe"));
        theStudents.add(new Student("Jane", "Doe"));
        theStudents.add(new Student("Jack", "Doe"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }

}
