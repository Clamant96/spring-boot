package com.helloworld.mentalidadesehabilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidadesehabilidades")
public class MentalidadesEHabilidadesController {
	
	@GetMapping
	public String minhasMentalidadesEHabilidades() {
		String habilidade = "Atenção aos Detalhes";
		String mentalidade = "Persistência e Mentalidade de Crescimento";
		String resposta = "Habilidades: "+ habilidade +"\nMentalidades: "+ mentalidade;
		
		return resposta;
	}

}
