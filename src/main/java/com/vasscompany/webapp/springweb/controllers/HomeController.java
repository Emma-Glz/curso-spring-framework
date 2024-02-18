package com.vasscompany.webapp.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "home"})
    public String home(){
        //return "redirect:/details";
        return "forward:/details";
        //NOTA: la diferencia entre redirect y forward es que el redirect olvida la ruta que estas
        //indicando por ejemplo /home ademas de que tambien se pierden todos los parametro que esta URL 
        //pudiera tener en cambio el forward mantiene la ruta.
    }
}
