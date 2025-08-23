package com.example.Practice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Practice.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("home")
public class MyClass{

@Autowired
private Student Student;
@Autowired
private Repo repo;
@GetMapping("greet")
public  String sayHello(){
return "hello i am working fine now ...in abc get mapping";

}
@GetMapping("add")
public String addStudent(@RequestParam int id,@RequestParam String name,@RequestParam int age){
Student s=new Student(id,name,age);
repo.addStudent(s);
return "Student is added to db  "+" : "+s.getName();

}


}
