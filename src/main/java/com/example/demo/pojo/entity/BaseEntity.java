package com.example.demo.pojo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author hehd
 * @since 2024/03/06
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * 编号
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
