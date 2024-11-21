package pe.nunez.jhonatan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		return http
                .csrf().disable() 
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers(HttpMethod.GET, "/bus").permitAll(); 
                    auth.requestMatchers(HttpMethod.POST, "/bus").permitAll(); 
                    auth.requestMatchers(HttpMethod.DELETE, "/bus/**").hasRole("USER"); 
                })
                .httpBasic() 
                .and()
                .build();
	}
}
