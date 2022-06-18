package com.app.stop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

    @Configuration
    public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure( HttpSecurity http ) throws Exception {
            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/api/stop/**")
                    .permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }



}
