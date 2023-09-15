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
                    .requestMatchers(new AntPathRequestMatcher("/teclados")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/servicios")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/monitores")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/mouses")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/")).permitAll()

                    //.requestMatchers("/servicios").authenticated()
                    .anyRequest().permitAll()
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
                .username("Dalejandro31%$")
                .password(passwordEncoder.encode("34$67!@#$%^&*()ñ0110Ñ"))
                .roles("USER")
                .build();
            return new InMemoryUserDetailsManager(user);   
        }
}


