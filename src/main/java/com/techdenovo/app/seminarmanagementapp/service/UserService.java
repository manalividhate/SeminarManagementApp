package com.techdenovo.app.seminarmanagementapp.service;
import com.techdenovo.app.seminarmanagementapp.model.ApplicationUser;
import com.techdenovo.app.seminarmanagementapp.model.Role;
import com.techdenovo.app.seminarmanagementapp.repository.ApplicationUserRepository;
import com.techdenovo.app.seminarmanagementapp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserDetailsService{
    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    RoleRepository roleRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserRepository.findByUsername(userName);
        List<Role> roles= roleRepository.findAll();

        if (applicationUser == null) {
            System.out.println("invalid username");
        }
//        ArrayList roleList= new ArrayList();
//        roleList.add(applicationUser.getRole());
        return new User(applicationUser.getUsername(), applicationUser.getPassword(),new ArrayList<>());
    }
    }


