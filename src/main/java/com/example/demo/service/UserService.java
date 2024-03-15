package com.example.demo.service;

import com.example.demo.pojo.entity.User;

/**
 * @author hehd
 * @since 2024/03/06
 */
public interface UserService {
    /**
     * 插入一个
     *
     * @param user 用户
     * @return boolean
     */
    boolean insert(User user);
}
