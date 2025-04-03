package charles.zhou.serviceprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.tags.Tag;

@SpringBootApplication
@Tag(name = "服务提供者", description = "服务提供详细描述")
@MapperScan("charles.zhou.serviceprovider.mapper") 
public class ServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}