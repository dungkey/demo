package com.example.demo.service.impl;

import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hehd
 * @since 2024/03/06
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insert(User user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            log.error("插入失败", e);
            return false;
        }
    }
}
