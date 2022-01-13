package com.samesh.authserverprod.service;

import com.samesh.authserverprod.model.AuthUserDetail;
import com.samesh.authserverprod.model.User;
import com.samesh.authserverprod.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> user = userDetailRepository.findByUsername(name);

        user.orElseThrow(() -> new UsernameNotFoundException("Username or password invalid"));

        UserDetails userDetails = new AuthUserDetail(user.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
