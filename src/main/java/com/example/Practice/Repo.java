package com.example.Practice;



import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import com.example.Practice.Student;
import org.springframework.beans.factory.annotation.Autowired;


public class Repo{
@Autowired
private Student Student;
List<Student> std=new ArrayList<>(Arrays.asList(new Student(1,"Alpha",21),new Student(2,"Beta",22)));
public void addStudent(Student s){
System.out.println ("in studnet repo");
std.add(s);


}







}
