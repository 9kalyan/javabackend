package com.kalyan.ram;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
    @GetMapping(value="/ka")
    public String getString(){
        return "kalyan ram is great person";
    }
}
