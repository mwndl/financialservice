package financial.service.api.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("Financial Service API")
                        .description("API Rest da aplicação Financial Service, contendo as funcionalidades de CRUD de categorias, pessoas e lançamentos.")
                        .contact(new Contact()
                                .name("Backend Team")
                                .email("backend@finservice.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://finservice.com/api/licenca")));
    }
}