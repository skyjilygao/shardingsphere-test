/**
 * BcAdminUsersMapper.java
 *
 * @author liuyun
 * @date 20201127
 */
package cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.mapper;

import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity.BcAdminUsers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BcAdminUsersMapper extends BaseMapper<BcAdminUsers> {
    int deleteByPrimaryKey(Integer id);

    int insert(BcAdminUsers record);

    int insertSelective(BcAdminUsers record);

    BcAdminUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BcAdminUsers record);

    int updateByPrimaryKeyWithBLOBs(BcAdminUsers record);

    int updateByPrimaryKey(BcAdminUsers record);

    List<BcAdminUsers> selectBySelective(BcAdminUsers record);

    List<BcAdminUsers> selectFbIdGtZeroAll();

    int uploadTokenStatusByIdBatch(@Param("list") List<BcAdminUsers> list);
}