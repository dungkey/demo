package com.example.demo.pojo.vo;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author hehd
 * @since 2024/03/15
 */
@Data
public class UserInsertRequestVo {
    /**
     * 名字
     */
    @NotEmpty(message = "名字不能为空")
    String name;
}
