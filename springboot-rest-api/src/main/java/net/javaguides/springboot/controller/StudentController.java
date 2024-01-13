package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(
                1,
                "Harry",
                "Osbourne"
        );
        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Ingrid", "Sunjay"));
        students.add(new Student(3, "Edward", "Scisors"));
        students.add(new Student(4, "Anais", "Watterson"));
        return students;
    }
}
