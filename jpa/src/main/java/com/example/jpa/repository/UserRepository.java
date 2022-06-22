package com.example.jpa.repository;

import com.example.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u left join u.permissions p where 1 = 1 and (:pName is Null or p.name = :pName)")
    Page<User> findByPermissionName(@Param("pName") String permissionName, Pageable pageable);
}
