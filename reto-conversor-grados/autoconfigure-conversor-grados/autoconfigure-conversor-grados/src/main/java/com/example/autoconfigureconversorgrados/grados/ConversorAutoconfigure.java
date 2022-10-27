package com.example.autoconfigureconversorgrados.grados;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.libreriaconversorgrados.Conversor;

@Configuration
@ConditionalOnClass(Conversor.class)
@EnableConfigurationProperties(ConversorProperties.class)
public class ConversorAutoconfigure {

	private final ConversorProperties properties;

	public ConversorAutoconfigure(ConversorProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Conversor retornarConversor() {
		return new Conversor(properties.getUnidad());
	}
	
}
