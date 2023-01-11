package com.nt.StudentProj;

import java.util.List;

public interface studentService {
    public StudentEntity saveStudent(StudentEntity student);
    public List<StudentEntity> getAllStudents();
}
