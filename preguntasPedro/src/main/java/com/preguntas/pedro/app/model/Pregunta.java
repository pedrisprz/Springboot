package com.preguntas.pedro.app.model;

public class Pregunta {
	String enunciado;
	String tipo;
	String opcionCorrecta;
	
	public Pregunta(String enunciado, String tipo, String opcionCorrecta) {
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.opcionCorrecta = opcionCorrecta;
	}

	public String getEnunciado() {
		return enunciado;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getOpcionCorrecta () {
		return opcionCorrecta;
	}
}

