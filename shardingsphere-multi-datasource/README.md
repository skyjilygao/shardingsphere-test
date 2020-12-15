## shardingSphere 多数据源配置

主要是参考网友的：[multi-datasource](https://github.com/daigd/java-in-action/blob/master/multi-datasource/)

并在此基础上测试使用mapper.xml访问执行sql，发现也是可以的。

说明:
 
1. 虽然配置了自定义策略，但不管用。因为日志没有打印，不知道为什么？但是能够正常工作 
2. 是如何实现多数据源呢？关键在于`actualDataNodes`指定使用哪个数据源。
```yaml
spring:
  shardingsphere:
    ...省略其他配置...
      tables:
#        user:
#          actualDataNodes: ds1.user
        order:
          actualDataNodes: ds2.order
        bc_admin_users:
          actualDataNodes: ds3.bc_admin_users
```
3. 在配置中，会发现每个表都需要配置单独指定一下使用哪个数据源？有没有稍微好点方式呢？
有还是有的。以表数量较多的数据源作为默认源，指定`default-data-source-name`。这样就会少配置了很多
```yaml
spring:
  shardingsphere:
    ...省略其他配置...
    sharding:
      default-data-source-name: ds1
      default-database-strategy:
        hint:
          algorithm-class-name: cn.skyjilygao.study.shardingsphere.multidatasource.shardingsphere.MyDatasourceRoutingAlgorithm
      tables:
      ...省略其他配置...
```
那么，如果第二数据源表也比较多怎么办？这个我还没找到办法