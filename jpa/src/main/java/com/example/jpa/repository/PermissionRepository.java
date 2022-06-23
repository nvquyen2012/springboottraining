package com.example.jpa.repository;

import com.example.jpa.entity.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Page<Permission> findPermissionByUsers_Name(String name, Pageable pageable);
}
