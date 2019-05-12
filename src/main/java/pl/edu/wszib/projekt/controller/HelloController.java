package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.projekt.dao.SelectedColorDao;

@RestController
public class HelloController {



    @GetMapping("/hello")
    public String helloPage(){
        return  "hello!!!";
    }

    @GetMapping("/kkk")
    public String kkkPage(){
        return  "kkk!!!";
    }


}
