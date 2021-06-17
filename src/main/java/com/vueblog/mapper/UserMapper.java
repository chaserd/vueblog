package com.vueblog.mapper;

import com.vueblog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author anonymous
 * @since 2021-06-17
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
