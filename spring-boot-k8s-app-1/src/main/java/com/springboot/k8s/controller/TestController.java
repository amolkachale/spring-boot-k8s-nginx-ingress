package com.springboot.k8s.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

	@GetMapping(path = "/app1", produces = "application/json")
	public ResponseEntity<String> dockerTest() {
		return ResponseEntity.status(HttpStatus.OK).body("Welcome to spring boot k8s example:-App1");
	}

}