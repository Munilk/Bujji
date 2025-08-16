package com.example.service;

import com.example.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>(new Student(1,"Kumar",23,"kumar896@gmail.com"));

    public List<Student> getAllStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        // You can add validation if needed
        return students.add(student);
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public String updateStudent(Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }
}
