package com.judgesphere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
/**
 * Hello world!
 *
 */
@SpringBootApplication  // ✅ Enables component scanning, autoconfiguration, and more
@OpenAPIDefinition(info = @Info(title = "JudgeSphere API", version = "1.0", description = "Online Judge System API"))
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
