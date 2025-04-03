package charles.zhou.serviceprovider.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("服务 API 文档")
                        .version("1.0")
                        .description("这是一个 Spring Boot 项目的 API 文档"));
    }
}
