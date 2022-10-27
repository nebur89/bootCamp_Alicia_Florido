package com.example.libreriaconversorgrados;

public class Conversor {

	private String unidad;
	
	public Conversor(String unidad) {
		this.unidad = unidad;
	}
		

	public String conversorUnidades(Double grados) {

		if(unidad=="Celius") {
	
			Double resul= (grados * 1.8)+32;
				
			return grados + "º Celius son: "+ resul+ "º Farenheit";
		}
		
		else {
		
		Double resul= (grados - 32)/1.8;
			
		return grados + "º Farenhei son: "+ resul+ "º Celius";
		
		}	
		
		
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

}