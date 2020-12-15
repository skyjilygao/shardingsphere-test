package cn.skyjilygao.study.shardingsphere.multidatasource.service;

import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity.Order;
import cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 19:15
 * @description : 订单服务方法
 */
@Service
public class OrderService
{
    @Autowired
    private OrderMapper orderMapper;

    public Order queryById(long id)
    {
        return orderMapper.selectById(id);
    }
}
