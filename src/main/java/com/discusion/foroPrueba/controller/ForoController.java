package com.discusion.foroPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discusion.foroPrueba.models.DtoResponse;
import com.discusion.foroPrueba.models.Foro;
import com.discusion.foroPrueba.services.ForoService;



@RestController
@RequestMapping("/foro")
public class ForoController {

	@Autowired
	ForoService foroService;
	
	@PostMapping("/guardar")
	public ResponseEntity<DtoResponse> guardarDiscusion(@RequestBody Foro dataForo){
		try {
			return new ResponseEntity<>(foroService.guardarInfoForo(dataForo), HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
