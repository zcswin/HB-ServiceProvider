package charles.zhou.serviceprovider.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-consumer")
public interface  ServiceConsumerClient {
	@GetMapping("/service-consumer/service")
	String getService();
}
