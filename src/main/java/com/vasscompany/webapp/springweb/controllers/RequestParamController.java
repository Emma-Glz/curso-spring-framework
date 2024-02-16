package com.vasscompany.webapp.springweb.controllers;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.dto.ParamDto;
import com.vasscompany.webapp.springweb.models.dto.ParamMixDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamDto foot(@RequestParam(required = false, defaultValue = "No ingreso nada") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    //http://localhost:8080/api/params/bar?text=hola&code=12  peticion
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam String code){
        ParamMixDto params = new ParamMixDto();
        params.setText(text);
        params.setCode(code);
        return params;
    }

}
