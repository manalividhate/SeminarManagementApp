package com.techdenovo.app.seminarmanagementapp.repository;

import com.techdenovo.app.seminarmanagementapp.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
