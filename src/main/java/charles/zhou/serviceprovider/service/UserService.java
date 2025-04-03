package charles.zhou.serviceprovider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import charles.zhou.serviceprovider.entity.User;
import charles.zhou.serviceprovider.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    // 可以自定义一些方法来处理业务逻辑
}