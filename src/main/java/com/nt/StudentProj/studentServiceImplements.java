package com.nt.StudentProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImplements implements studentService{
@Autowired
private StudentRepository studentrepository;

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentrepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {

        return studentrepository.findAll();
    }
}
