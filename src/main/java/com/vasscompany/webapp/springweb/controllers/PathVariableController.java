package com.vasscompany.webapp.springweb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
