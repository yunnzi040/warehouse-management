package com.ohgiraffers.warehousemanagement.wms.user.repository;

import com.ohgiraffers.warehousemanagement.wms.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserCode(String userCode);
    boolean existsByUserCode(String userCode);

    Optional<User> findByUserEmail(String Useremail);
    boolean existsByUserEmail(String Useremail);

    Optional<User> findByUserPhone(String Userphone);
    boolean existsByUserPhone(String Userphone);
}
