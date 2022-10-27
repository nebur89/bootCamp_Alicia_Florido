package com.nttdata.bootcamp.saludostarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;

@RestController
public class HomeControler {

	@Autowired
	private Saludo saludo;

	@GetMapping("/entradaDeSaludo")

	public String devolverSaludoDesdeLaClasePrincipalDeSaludo() {

		return saludo.mensajeSaludo();
	}
	

}
