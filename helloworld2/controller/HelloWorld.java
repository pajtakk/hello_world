package br.org.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("hello")


public class HelloWorld {

	@GetMapping
	
	public String hello() {
		
		return " Hello World ";
		
		
	}
	
	
	@GetMapping("/bsm")
	public String bsm() {
		return " BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades ";
	
		
		
	}
	
	
	@GetMapping("/objetivo")
	public String objetivo() {
		 return "aprendemos tabela em bando de dados e fazer o hello world no spring";
	}
}
