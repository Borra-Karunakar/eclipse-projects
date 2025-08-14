package com.example.groceryapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// Enables @PreAuthorize if you add method role-based annotations later
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/grocery/public").permitAll()   // allow public endpoint
                .anyRequest().authenticated()                // require auth for other endpoints
                .and()
            .httpBasic();                                   // use HTTP Basic auth
        return http.build();
    }
}
