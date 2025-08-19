package com.example.Practice;








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
