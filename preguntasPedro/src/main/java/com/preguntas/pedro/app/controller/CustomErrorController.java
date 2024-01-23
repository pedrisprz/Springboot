package com.preguntas.pedro.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Devuelve el nombre de la vista de tu página de error personalizada
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }
}

