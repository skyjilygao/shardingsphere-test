package cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.mapper;

import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:42
 * @description : 用户表映射接口
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User>
{
}
