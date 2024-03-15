package com.example.demo.pojo.vo.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author hehd
 * @since 2024/03/06
 */
@Data
@AllArgsConstructor
@SuppressWarnings("unused")
public class Result<T> {

    public static final Error ERROR_PARAM = new Error("400", "参数错误");
    public static final Error ERROR_UNAUTHORIZED = new Error("401", "未授权");
    public static final Error ERROR_LOGIN = new Error("402", "未登录");
    public static final Error ERROR_FORBIDDEN = new Error("403", "禁止访问");
    public static final Error ERROR_NOT_FOUND = new Error("404", "未找到");
    public static final Error ERROR_METHOD_NOT_ALLOWED = new Error("405", "方法不允许");
    public static final Error ERROR_NOT_ACCEPTABLE = new Error("406", "不可接受");
    public static final Error ERROR_PROXY_AUTHENTICATION_REQUIRED = new Error("407", "需要代理身份验证");
    public static final Error ERROR_REQUEST_TIMEOUT = new Error("408", "请求超时");
    public static final Error ERROR_SERVER = new Error("500", "服务器错误");

    /**
     * 编码
     */
    String code;
    /**
     * 信息或报错
     */
    String msg;
    /**
     * 数据
     */
    T data;

    public static <T> Result<T> success(T data) {
        return new Result<>("200", "success", data);
    }

    public static <T> Result<T> error(String code, String msg) {
        return new Result<>(code, msg, null);
    }

    public static <T> Result<T> error(Error error) {
        return new Result<>(error.code, error.msg, null);
    }

    public static <T> Result<T> error(Error error, String msg) {
        return new Result<>(error.code, msg, null);
    }

    @Data
    @AllArgsConstructor
    public static class Error implements Serializable {
        @Serial
        private static final long serialVersionUID = 2695807747621989141L;
        String code;
        String msg;
    }
}
