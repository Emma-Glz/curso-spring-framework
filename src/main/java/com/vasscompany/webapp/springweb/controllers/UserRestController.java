package com.vasscompany.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.User;
import com.vasscompany.webapp.springweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("juan", "Garza");
        UserDto userDto = new UserDto();
        userDto.setTitle("Bienvenida equipo");
        userDto.setUser(user);
        
        return userDto;
    }

}
