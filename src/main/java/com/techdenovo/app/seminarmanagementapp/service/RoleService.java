package com.techdenovo.app.seminarmanagementapp.service;


import com.techdenovo.app.seminarmanagementapp.model.Participant;
import com.techdenovo.app.seminarmanagementapp.model.Role;
import com.techdenovo.app.seminarmanagementapp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles;
    }
}
