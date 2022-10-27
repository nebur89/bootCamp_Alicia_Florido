package com.example.starterconversorgrados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreriaconversorgrados.Conversor;

@RestController
public class HomeControler {

	@Autowired
	private Conversor conversor;


	
	@GetMapping("/conversorGrados/{grados}")
	public String conversorGrados(@PathVariable("grados")Double grados) {
		
		return conversor.conversorUnidades(grados);
	}
	

	
	

}
