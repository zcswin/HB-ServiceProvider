package charles.zhou.serviceprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import charles.zhou.serviceprovider.entity.User;
import charles.zhou.serviceprovider.rpc.ServiceConsumerClient;
import charles.zhou.serviceprovider.service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/service-provider")
public class ProviderController {
	
    @Value("${server.port}")
    private String serverPort; // 注入当前服务的端口号    
	
    @GetMapping("/service")
    @Operation(summary = "提供服务消息", description = "返回服务消息详细")
    public String providerService() {
        return "This is a service provided by the Charles Zhou.Port:" + serverPort;
    }   
    
    @Autowired
    ServiceConsumerClient serviceConsumerClient;
    
    @GetMapping("/call-service-consumer")
    @Operation(summary = "轮询消费者服务端API及端口", description = "返回消费者服务消息详细")
    public String consumeService() {
        return serviceConsumerClient.getService();
    }    
    
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @Operation(summary = "提供用户信息", description = "返回服务消息详细")
    public List<User> getAllUsers() {
        return userService.list();  // 返回所有用户
    }
}
