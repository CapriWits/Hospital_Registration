package com.atguigu.demomptest.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @Description: User 实体类
 * @Author: Hypocrite30
 * @Date: 2021/8/30 16:20
 */
@Data
public class User {
    // @TableId(type = IdType.ASSIGN_ID) //默认-主键策略-雪花算法19位
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;  //create_time

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime; //update_time

    @Version
    private Integer version; // 乐观锁版本号

    @TableLogic // 逻辑删除
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

}
