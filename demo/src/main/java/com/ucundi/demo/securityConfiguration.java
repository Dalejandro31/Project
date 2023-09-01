package com.ucundi.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity

public class securityConfiguration{
        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
            .authorizeHttpRequests((authorize) -> authorize
                    // .requestMatchers("/camas", "/servicios", "/hola").authenticated()
                    .requestMatchers(new AntPathRequestMatcher("/comida")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/servicios")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/camas")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/ropa")).permitAll()
                    //.requestMatchers("/servicios").permitAll()
                    .anyRequest().permitAll()
            )
            .httpBasic(withDefaults())
            .formLogin(withDefaults());
        // @formatter:on
        return http.build();
    }

        @Bean
        public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}


