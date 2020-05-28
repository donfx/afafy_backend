package test.tutorial.test_tutorial;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	   public Docket apiDocket() {
	       
	       Docket docket =  new Docket(DocumentationType.SWAGGER_2)
	    		    .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("test.tutorial.test_tutorial"))
	                .paths(PathSelectors.any())
	                .build();
	       
	       return docket;
	       
	    } 



	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Afafy Project ")
				.description("Afafy Project API reference for developers")
				.licenseUrl("emedofelix@gmail.com").version("1.0").build();
	}

}