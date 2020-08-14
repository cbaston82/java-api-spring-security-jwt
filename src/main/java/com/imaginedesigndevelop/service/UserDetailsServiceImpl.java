package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Role;
import com.imaginedesigndevelop.model.User;
import com.imaginedesigndevelop.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository;

    Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByUserName(username);
        if (user==null) throw new UsernameNotFoundException(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        for (Role role : user.getRoles()) {

            if (role.getName().equals("ROLE_WEB_USER")) {
                grantedAuthorities.add(new SimpleGrantedAuthority("webuser" +
                    ":read"));
            }

            if (role.getName().equals("ROLE_ADMIN")) {
                grantedAuthorities.add(new SimpleGrantedAuthority("admin:read"
                ));
                grantedAuthorities.add(new SimpleGrantedAuthority("admin" +
                    ":write"));
            }

            if (role.getName().equals("ROLE_DASHBOARD")) {
                grantedAuthorities.add(new SimpleGrantedAuthority("dashboard" +
                    ":read"));
            }

            if (role.getName().equals("ROLE_MOBILE")) {
                grantedAuthorities.add(new SimpleGrantedAuthority("mobile" +
                    ":read"));
            }

            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails
            .User(user.getUserName(), user.getPassword(), grantedAuthorities);
    }
}
