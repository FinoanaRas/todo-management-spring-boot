package net.guides.springboot.todomanagement.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    // @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder passwordEncoder = passwordEncoder();
        auth.inMemoryAuthentication()
            .passwordEncoder(passwordEncoder)
            .withUser("admin").password(passwordEncoder.encode("admin"))
            .roles("USER", "ADMIN");
    }

    // @Lazy
    

    // @Lazy
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//         .authorizeHttpRequests(authorize -> authorize
//             .requestMatchers("/login", "/h2-console/**").permitAll()
//             .requestMatchers("/", "/*todo*/**").hasRole("USER")
//             .anyRequest().authenticated())
//         .formLogin(login -> login
//             .defaultSuccessUrl("/list-todos", true)) // Example of a formLogin configuration
//         .csrf(csrf -> csrf.disable()) // Correct placement of csrf().disable()
//         .headers(headers -> headers.disable()); // Correct placement of headers().frameOptions().disable()


//         return http.build();
//     }
}
