package com.qingtian.data.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
class CustomRestMvcConfiguration {
  @Bean
  public RepositoryRestConfigurer repositoryRestConfigurer() {
    return new RepositoryRestConfigurerAdapter() {
      @Override
      public void configureRepositoryRestConfiguration(RepositoryRestConfiguration configuration) {
        configuration.setBasePath("/api");
      }
    };
  }
}