package com.preguntas.pedro.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.preguntas.pedro.app.model.Pregunta;
import com.preguntas.pedro.app.service.PreguntaService;




@Controller
public class PreguntaController {
	
	@Autowired
	private PreguntaService sp;
	
	@ModelAttribute(name = "pregunta")
	public Pregunta pregunta() {
		return sp.preguntaAleatoria();
	}
	
	@GetMapping("pregunta")
	public String m(Model model) {
		return "pregunta";
	}
	
	@PostMapping("pregunta")
	public String m2(@RequestParam (name ="resultado") String resultado,@RequestParam (name ="enunciado") String enunciado, Model model) {
		Pregunta preguntaRespondida = sp.preguntaQueSeEnvio(enunciado);
		boolean comprobacion = preguntaRespondida.getOpcionCorrecta().equals(resultado);
		model.addAttribute("comprobacion", comprobacion);
		return "resultadoPregunta";
	}
	
}
