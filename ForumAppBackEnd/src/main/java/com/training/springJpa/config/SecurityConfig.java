/*
 * package com.training.springJpa.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeHttpRequests(authorize->{
 * authorize.antMatchers("/index").permitAll()
 * .antMatchers("/signIn").hasRole("user"); }) .authorizeRequests()
 * .anyRequest().authenticated() .and().formLogin().and().httpBasic(); }
 * 
 * }
 */