package com.example.Practice;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Practice.Student;
import com.example.Practice.Repo;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("home")
public class MyClass{

//@Autowired
//private Student student;
//Field Student in com.example.Practice.MyClass required a bean of type 'com.example.Practice.Student' that could not be found.
@Autowired
private Repo repo;

@GetMapping("greet")
public  String sayHello(){
return "hello i am working fine now ...in abc get mapping";

}
@GetMapping("add")
public String addStudent(@RequestParam int id,@RequestParam String name,@RequestParam int age){
Student s=new Student();
s.setId(id);
s.setName(name);
s.setAge(age);
repo.addStudent(s);
return "Student is added to db  "+" : "+s.getName();

}
/*
public void Student(){


}*/
}
