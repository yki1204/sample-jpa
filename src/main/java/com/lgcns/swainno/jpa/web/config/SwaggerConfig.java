package com.lgcns.swainno.jpa.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;

import lombok.Getter;
import lombok.Setter;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.alternateTypeRules(
						AlternateTypeRules.newRule(Pageable.class, NewPage.class)
				)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lgcns.swainno.jpa.web"))
                .paths(PathSelectors.any())
                .build();
    }
	
	@Getter @Setter
	static class NewPage {
		
		private Integer page;
		
		private Integer size;
		
	}

}
