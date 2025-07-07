package com.builtbyanthony.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class ExternalCallAPIService {
	
	
	@Retry(name = "myService", fallbackMethod = "retryFallback")
	@CircuitBreaker(name = "myService", fallbackMethod = "circuitBreakerFallback")
	public String fetchExternalData() {
		
		if(Math.random() > 0.7) {
			throw new RuntimeException("External service failed!");
		}
		
		return "External data loaded!";
	}
	
	public String retryFallback(Throwable t) {
		return "🔁 Retry fallback triggered: Service not available.";
	}
	
	public String circuitBreakerFallback(Throwable t) {
		return "🔌 Circuit breaker fallback triggered: Too many failures.";
	}

	@Retry(name = "myService", fallbackMethod = "retryFallback")
	public String fetchExternalDataV2() {
		if(Math.random() > 0.7) {
			throw new RuntimeException("External service failed!");
		}
		
		return "External data loaded!";
	}

}
