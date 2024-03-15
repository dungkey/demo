package com.example.demo.pojo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hehd
 * @since 2024/03/06
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_user")
public class User extends BaseEntity {

    /**
     * 名字
     */
    @Column(name = "name", nullable = false)
    private String name;
}
