package com.vueblog.service;

import com.vueblog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author anonymous
 * @since 2021-06-17
 */
public interface UserService extends IService<User> {
    User getById(int id);
}
