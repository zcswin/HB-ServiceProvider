package charles.zhou.serviceprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import io.swagger.v3.oas.annotations.tags.Tag;

@SpringBootApplication
@EnableTransactionManagement
@Tag(name = "服务提供者", description = "服务提供详细描述")
@MapperScan("charles.zhou.serviceprovider.mapper") // 确保包名正确
public class ServiceProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}