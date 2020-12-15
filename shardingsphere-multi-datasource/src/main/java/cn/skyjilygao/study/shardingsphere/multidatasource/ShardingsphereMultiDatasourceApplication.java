package cn.skyjilygao.study.shardingsphere.multidatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.mapper")
@ComponentScan(basePackages = "cn.skyjilygao.study.shardingsphere.multidatasource")
@SpringBootApplication
public class ShardingsphereMultiDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingsphereMultiDatasourceApplication.class, args);
	}

}
