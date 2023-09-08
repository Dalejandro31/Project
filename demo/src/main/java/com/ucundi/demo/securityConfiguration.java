package com.ucundi.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
                    .requestMatchers(new AntPathRequestMatcher("/teclados")).authenticated()
                    .requestMatchers(new AntPathRequestMatcher("/servicios")).authenticated()
                    .requestMatchers(new AntPathRequestMatcher("/monitores")).authenticated()
                    .requestMatchers(new AntPathRequestMatcher("/mouses")).authenticated()
                    .requestMatchers(new AntPathRequestMatcher("/")).authenticated()

                    //.requestMatchers("/servicios").authenticated()
                    .anyRequest().authenticated()
            )
            .httpBasic(withDefaults())
            .formLogin(withDefaults());
        // @formatter:on
        return http.build();
    }

    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
        public InMemoryUserDetailsManager userDetailsService() {
            PasswordEncoder passwordEncoder = passwordEncoder();
    
            UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
            return new InMemoryUserDetailsManager(user);   
        }
}


