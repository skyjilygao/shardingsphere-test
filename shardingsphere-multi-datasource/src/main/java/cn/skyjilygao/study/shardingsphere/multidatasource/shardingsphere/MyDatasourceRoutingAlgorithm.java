package cn.skyjilygao.study.shardingsphere.multidatasource.shardingsphere;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author : DaiGD
 * @createtime :  2020年06月13日 16:42
 * @description : 数据库分片策略
 */
@Configuration
@Slf4j
public class MyDatasourceRoutingAlgorithm implements HintShardingAlgorithm<String>
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyDatasourceRoutingAlgorithm.class);

    /**
     * 用户数据源
     */
    private static final String DS_USER = "ds1";

    /**
     * 订单数据源
     */
    private static final String DS_ORDER = "ds2";


    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<String> shardingValue)
    {

        LOGGER.info("shardingValue.getValues()={}",shardingValue.getValues());
        Collection<String> result = new HashSet<>();
        for(String value : shardingValue.getValues())
        {
            if(DatasourceType.DATASOURCE_USER.toString().equals(value))
            {
                if(availableTargetNames.contains(DS_USER))
                {
                    result.add(DS_USER);
                }
            }
            else
            {
                if(availableTargetNames.contains(DS_ORDER))
                {
                    result.add(DS_ORDER);
                }
            }
        }
        LOGGER.info("availableTargetNames:{},shardingValue:{},返回的数据源:{}",
                new Object[] { availableTargetNames, shardingValue, result });

        return result;
    }
}
