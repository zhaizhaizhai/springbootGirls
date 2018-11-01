package com.zhaige;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *  Created by zhaizhaizhai
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @Autowired
    private GirlProperties girlProperties;


    //@RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") int id){
        return "id: " + id;
        //return girlProperties.getCupSize();
    }
}
