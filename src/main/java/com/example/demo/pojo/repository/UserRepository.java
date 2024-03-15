package com.example.demo.pojo.repository;

import com.example.demo.pojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hehd
 * @since 2024/03/06
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
