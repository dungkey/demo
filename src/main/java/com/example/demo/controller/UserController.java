package com.example.demo.controller;

import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.vo.common.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehd
 * @since 2024/03/06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 插入一个新的用户信息到数据库。
     *
     * @param user 用户信息对象，包含用户的所有属性。
     * @return {@link Result}<{@link Boolean}> 返回一个结果对象，如果插入成功，则返回成功状态和true；如果插入失败，则返回错误状态和错误信息。
     */
    @PostMapping("/insert")
    public Result<Boolean> insert(User user) {
        if (userService.insert(user)) {
            return Result.success(Boolean.TRUE);
        } else {
            return Result.error(Result.ERROR_SERVER, "插入失败");
        }
    }

}
