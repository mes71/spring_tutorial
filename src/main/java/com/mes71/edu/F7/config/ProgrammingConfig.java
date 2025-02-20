package com.mes71.edu.F7.config;


import com.mes71.edu.F7.CInstructor;
import com.mes71.edu.F7.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammingConfig {

    @Bean(name = "CIS")
    public Instructor cInstructor() {
        return new CInstructor();
    }
}
