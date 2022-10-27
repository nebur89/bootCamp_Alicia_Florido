package com.example.autoconfigureconversorgrados.grados;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
// alias. nombre atributo de la clase, se le configura por el properties del starter  ejemplo alias.uniddad
@ConfigurationProperties("conversor")

public class ConversorProperties {
	
	private String unidad= "" ;

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	
	
}
