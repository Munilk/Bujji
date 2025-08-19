package com.example.Practice;





/*

/data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[5,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[8,9] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[9,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[10,11] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[11,1] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[12,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[12,30] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[13,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[13,36] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[14,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[14,37] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[15,8] class, interface, enum, or record expected
[ERROR] /data/data/com.termux/files/home/downloads/Practice/src/main/java/com/example/Practice/Student.java:[15,43] class, interface, enum, or record expected


*/


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.*;
import com.example.Practice.*;

@RestController
@RequestMapping("home")
public class MyClass{


//@AutoWired
//private Student s;
@GetMapping("greet")
public  String sayHello(){
return "hello i am working fine now ...in abc get mapping";

}
@PostMapping("add")
public String add(@RequestBody String s){
return "hello add student is working "+" : "+s;
}


}
