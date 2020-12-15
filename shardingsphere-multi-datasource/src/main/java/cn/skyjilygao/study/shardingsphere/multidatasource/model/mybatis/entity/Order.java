package cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 15:35
 * @description : 订单表
 */
@Data
@TableName("`order`")
public class Order implements Serializable
{
    private Long id;

    private Long userId;

    private String address;
}
