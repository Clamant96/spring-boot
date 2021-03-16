package com.helloworld.objetivosdeaprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosdeaprendizagem")

public class ObjetivosDeAprendizagemController {
	
	@GetMapping
	public String objetivosDeAprendizagem() {
		String resposta = "Aprender Spring; \nDesenvolvimento de aplicações RestFull; \nConstrução de uma API; \nConstrucao de um blog pessoal.";
		
		return resposta;
	}

}
