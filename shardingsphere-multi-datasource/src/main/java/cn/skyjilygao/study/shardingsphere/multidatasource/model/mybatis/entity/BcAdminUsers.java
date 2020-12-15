/**
*
* BcAdminUsers.java
* @author liuyun
* @date 20201127
*/
package cn.skyjilygao.study.shardingsphere.multidatasource.model.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("`bc_admin_users`")
public class BcAdminUsers implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 权限
     */
    private String access;

    /**
     * 是否有下载权限 1有 0无
     */
    private Boolean export;

    /**
     * 最后登录时间
     */
    private Integer lastLogin;

    /**
     * 是否显示 1为显示,0为不显示
     */
    private Boolean ifShow;

    /**
     * 创建时间
     */
    private Integer ctime;

    /**
     * fb用户access_token
     */
    private String fbToken;

    /**
     * fb用户id
     */
    private Long fbId;

    /**
     * fb用户token状态：0正常，1无效
     */
    private Integer fbTokenStatus;

    /**
     * fb用户token无效时原因
     */
    private String fbTokenDesc;

    /**
     * fb用户名称
     */
    private String fbName;

    /**
     * fb用户头像url
     */
    private String fbPic;

    /**
     * fb用户email
     */
    private String fbEmail;

    /**
     * 
     */
    private String actId;

    /**
     * bc_admin_users
     */
    private static final long serialVersionUID = 1L;

}