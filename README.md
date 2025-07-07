# Resilient Service with Spring Boot + Resilience4j

A demo Spring Boot application demonstrating the use of **Resilience4j** with `@Retry` and `@CircuitBreaker` annotations to build fault-tolerant APIs.

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Resilience4j
- Spring Boot Actuator
- Maven

## ⚙️ Features

- ✅ Auto-retries transient failures using `@Retry`
- ✅ Prevents cascading failures using `@CircuitBreaker`
- ✅ Graceful fallback responses
- ✅ Live circuit breaker status via Actuator endpoints

## 🚀 How It Works

### Simulated Unreliable Service

The service randomly throws exceptions:
```java
if (Math.random() < 0.7) {
    throw new RuntimeException("Simulated failure");
}
