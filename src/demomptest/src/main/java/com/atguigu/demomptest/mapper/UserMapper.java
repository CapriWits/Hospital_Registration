package com.atguigu.demomptest.mapper;

import com.atguigu.demomptest.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Description: UserMapper 由 mybatis-plus 接管
 * @Author: Hypocrite30
 * @Date: 2021/8/30 16:28
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
