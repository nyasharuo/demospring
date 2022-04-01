package com.codecampus.AssignmentSubmissionApp.service;

import com.codecampus.AssignmentSubmissionApp.domain.User;
import com.codecampus.AssignmentSubmissionApp.util.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private CustomPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.getPasswordEncoder().encode("123456789"));
        user.setId(1L);
        return user;
    }
}
