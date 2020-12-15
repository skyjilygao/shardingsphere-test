package cn.skyjilygao.study.shardingsphere.multidatasource;

import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity.BcAdminUsers;
import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity.User;
import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.mapper.BcAdminUsersMapper;
import cn.skyjilygao.study.shardingsphere.multidatasource.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingsphereMultiDatasourceApplicationTests {

	@Autowired
	private BcAdminUsersMapper bcAdminUsersMapper;

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		BcAdminUsers bcAdminUsers = bcAdminUsersMapper.selectByPrimaryKey(1);
		System.out.println(bcAdminUsers);
		bcAdminUsers = bcAdminUsersMapper.selectById(2);
		System.out.println(bcAdminUsers);

		User user = userService.queryById(1L);
		System.out.println(user);


	}

}
