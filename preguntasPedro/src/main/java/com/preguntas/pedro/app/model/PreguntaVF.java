package com.preguntas.pedro.app.model;

public class PreguntaVF extends Pregunta {
	
	String opcionCorrecta;
	
	public PreguntaVF (String enunciado, String opcionCorrecta) {
		super(enunciado, "VF", opcionCorrecta);
	}
	
}
