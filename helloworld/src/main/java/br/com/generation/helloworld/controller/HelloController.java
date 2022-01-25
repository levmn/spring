package br.com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/ola")
	public String ola() {
		return "Olá Mundo!";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades(){
		return "Habilidades e Mentalidades que utilizei para realizar a atividade: "
				+ "Orientação aos detalhes e Persistência.";
	}
	
	@GetMapping("/aprendizagem")
	public String aprendizagem(){
		return "Objetivos de aprendizagem para esta semana: "
				+ "Continuidade ao banco de dados e introdução ao Spring.";
	}
}
