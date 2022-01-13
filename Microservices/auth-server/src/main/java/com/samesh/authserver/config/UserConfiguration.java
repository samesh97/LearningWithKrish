package com.samesh.authserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("samesh")
                .password(passwordEncoder.encode("12345"))
                .roles("USER","ADMIN","MANAGER")
                .authorities("CAN READ","CAN WRITE","CAN DELETE")
                .and()

                .withUser("buddhika")
                .password(passwordEncoder.encode("buddhika"))
                .roles("USER")
                .authorities("CAN READ","CAN WRITE");

    }
}
