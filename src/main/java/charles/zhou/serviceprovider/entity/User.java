package charles.zhou.serviceprovider.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")  // 映射数据库表
public class User {

    private Long id;
    private String name;
    private String email;
}