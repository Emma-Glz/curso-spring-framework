package com.vasscompany.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.User;
import com.vasscompany.webapp.springweb.models.dto.ParamDto;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @RequestMapping("/baz/{message}")
    public ParamDto baz(@PathVariable(name = "message") String msj){
        ParamDto param = new ParamDto();
        param.setMessage(msj);

        return param;
    }

    @PostMapping("/create")
    public User user(@RequestBody User user){
        User usr = new User();
        usr.setName(user.getName());
        usr.setLastname(user.getLastname());
        usr.setEmail(user.getEmail());
        return usr;
    }
}
