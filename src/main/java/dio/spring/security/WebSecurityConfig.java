package dio.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
//@EnableWebSecurity //DESATIVA AS CONFIG PADRÕES DO SECURITY
public class WebSecurityConfig {
	//FILTROS (FILTERS)INTERCEPTA UMA REQUISIÇÃO E CHECA SE É AUTENTICADA OU NÃO ANTES DE MANDAR PARA O CONTROLLER, CASO NÃO SEJA ELE NEM ENVIA.
	@Bean 
    protected void configure(HttpSecurity http) throws Exception {
		
	http
            .httpBasic()
            .and()
            .authorizeHttpRequests()
            .anyRequest().authenticated();
    }
	@Bean
	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("Vivian")
		.password(passwordEncoder().encode("12345"))
		.roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}