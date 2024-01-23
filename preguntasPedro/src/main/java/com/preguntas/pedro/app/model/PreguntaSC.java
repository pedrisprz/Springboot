package com.preguntas.pedro.app.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PreguntaSC extends Pregunta{
	String respuesta1;
	String respuesta2;
	String respuesta3;
	String respuesta4;
	
	public PreguntaSC(String enunciado, String respuesta1, String respuesta2,
			String respuesta3, String respuesta4) {
		super(enunciado, "SC", respuesta1);
		String[] respuestas = {respuesta1, respuesta2, respuesta3, respuesta4};
		List<String> listaDeRespuestas = Arrays.asList(respuestas);
		Collections.shuffle(listaDeRespuestas);
		this.respuesta1 = listaDeRespuestas.get(0);
		this.respuesta2 = listaDeRespuestas.get(1);
		this.respuesta3 = listaDeRespuestas.get(2);
		this.respuesta4 = listaDeRespuestas.get(3);
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}
	
}
