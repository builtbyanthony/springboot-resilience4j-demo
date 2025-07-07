package com.builtbyanthony.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.builtbyanthony.service.ExternalCallAPIService;

@RestController
public class ResilienceController {

	private final ExternalCallAPIService service;

	public ResilienceController(ExternalCallAPIService service) {
		this.service = service;
	}

	@GetMapping("/call")
	public String callService() {
		return service.fetchExternalData();
	}
	
	@GetMapping("/call/v2")
	private String callServiceV2() {
		return service.fetchExternalDataV2();
	}
}
