package com.nt.StudentProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentdata")
@CrossOrigin

public class StudentController {
    @Autowired
    private studentService studentsdataonly ;

    @PostMapping("/add")
    public String add(@RequestBody StudentEntity studentdata) {
        studentsdataonly.saveStudent(studentdata);
        return "student data are adding";
    }
    @GetMapping("/getAll")
    public List<StudentEntity> getAllStudentsList(){
        return studentsdataonly.getAllStudents();
    }
}