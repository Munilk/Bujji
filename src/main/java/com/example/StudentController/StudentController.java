import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        if (studentService.addStudent(student)) {
            return ResponseEntity.ok("Student added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student not added");
        }
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/students")
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        String result = studentService.updateStudent(student);
        return ResponseEntity.ok(result);
    }
}
