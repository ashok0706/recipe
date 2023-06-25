package com.Test.RecipeManagement;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RecipeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeManagementApplication.class, args);
	}
    
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.Test.RecipeManagement.controller"))              
	          .paths(PathSelectors.any())                          
	          .build().apiInfo(apiInfo());                                           
	    }
	 
	 private ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("RECIPE MANAGEMENT")
					.description("CRUD Operationa on RECIPES")
//					.termsOfServiceUrl("http://javainuse.com")
//					.contact("javainuse@gmail.com").license("JavaInUse License")
					.licenseUrl("ashokyelagandula223@gmail.com").version("1.0").build();
		}
	 
	 }
