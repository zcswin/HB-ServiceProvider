package charles.zhou.serviceprovider.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import charles.zhou.serviceprovider.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
	 // 继承 BaseMapper 可以获得常用的 CRUD 操作
}