package com.meizhi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@TableName("t_user")
@Getter
@Setter
@ToString
public class User {

    // 用户ID
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 部门ID
    private Integer deptId;

    // 邮箱
    private String email;

    // 联系电话
    private String mobile;

    // 性别 1男 2女 0保密
    private Integer sex;

    // 状态 0锁定 1有效
    private Integer status;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date modifyTime;

    // 最后登录时间
    private Date lastLoginTime;

    // 描述
    private String description;

    // 头像
    private String avatar;


    private static  final  String DEPT_ID = "dept_id";

}
