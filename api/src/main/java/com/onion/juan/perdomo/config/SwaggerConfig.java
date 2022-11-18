package com.onion.juan.perdomo.config;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onion.juan.perdomo.config.properties.SwaggerProperties;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Autowired
	private SwaggerProperties swaggerProperties;
	
	@Bean
	public Docket api() {
		return new Docket(SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
				.paths(PathSelectors.any()).build()
				.apiInfo(metaData(swaggerProperties.getTitle(),
						swaggerProperties.getDescription(),
						swaggerProperties.getVersion()))
				.useDefaultResponseMessages(false)
				.globalResponseMessage(GET, defaultMessages())
				.globalResponseMessage(PUT, defaultMessages())
				.globalResponseMessage(DELETE, defaultMessages())
				.globalResponseMessage(POST, defaultMessages());
	}

	private ApiInfo metaData(String title, String description, String version) {
		return new ApiInfoBuilder().title(title).description(description).version(version).license(swaggerProperties.getLicense())
				.licenseUrl(swaggerProperties.getLicenseUrl())
				.contact(new Contact(swaggerProperties.getContactName(), swaggerProperties.getContactUrl(), swaggerProperties.getContactMail()))
				.build();
	}

	private List<ResponseMessage> defaultMessages() {
		List<ResponseMessage> messages = new ArrayList<>();
		messages.add(new ResponseMessageBuilder().code(UNAUTHORIZED.value())
				.message(swaggerProperties.getMessageUnauthorized()).build());
		messages.add(new ResponseMessageBuilder().code(FORBIDDEN.value())
				.message(swaggerProperties.getMessageForbidden()).build());
		messages.add(new ResponseMessageBuilder().code(NOT_FOUND.value())
				.message(swaggerProperties.getMessageNotFound()).build());
		messages.add(new ResponseMessageBuilder().code(INTERNAL_SERVER_ERROR.value()).message(swaggerProperties.getMessageInternalServerError())
				.build());
		return messages;
	}
}
