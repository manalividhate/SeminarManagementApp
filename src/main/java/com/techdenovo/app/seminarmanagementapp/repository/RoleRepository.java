package com.techdenovo.app.seminarmanagementapp.repository;
import com.techdenovo.app.seminarmanagementapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long > {
}
