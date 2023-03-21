package br.com.gustavo.kafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(value = "br.com.gustavo.kafka.repository.impl", considerNestedRepositories = true)
public class JpaConfig {

}
