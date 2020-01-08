package com.marcos.iniciandoSpring.rutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.marcos.iniciandoSpring.beans.Autor;

@Controller
public class RutasBasicas {

	//le pide al contenedor de objetos / los carga aqui / los inyecta
	@Autowired 
	Autor marcos;
	
	@Autowired
	Autor juan;
	
	@Autowired
	@Qualifier("marcos")
	Autor pedro;
	
	
	
	@GetMapping("/")
	public String rutaBasicaInicial() {

		System.out.println("Estoy en la ruta y he llegado bien");
		
		System.out.println("Marcos: "+marcos+" "+marcos.hashCode());
		System.out.println("Juan: "+juan+" "+juan.hashCode());
		System.out.println("Pedro: "+pedro+" "+pedro.hashCode());

		System.out.println("**********");
		pedro.setNombre("Pedro");
		System.out.println(marcos);
		
		return "hola";
	}
	
}