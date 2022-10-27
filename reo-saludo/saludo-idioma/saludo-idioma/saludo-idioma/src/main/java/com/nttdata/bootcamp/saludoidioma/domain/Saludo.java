package com.nttdata.bootcamp.saludoidioma.domain;

public class Saludo {
	private String idioma;
	
	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch(idioma) {
		
		case "Castellano":
			mensaje = "Bienvenido castellano";
			break;
		case "Inglés":
			mensaje = "Welcome ingles";
			break;
		case "Italiano":
			mensaje = "Benvenuto italiano";
			break;
		default:
			mensaje = "Bienvenido ruben";
			break;
		}
		return mensaje;
	}

		
}
