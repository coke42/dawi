package com.edu.cibertec;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configureSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(passEncoder)
			.usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ? ")
			.authoritiesByUsernameQuery("SELECT u.username, r.rol FROM roles r INNER JOIN users u ON r.user_id = u.id WHERE u.username= ? ");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/css/**","/bootstrap/**","/datatables/**","/js/**","/images/**").permitAll()
									.antMatchers("/productos").hasAnyRole("USER")
									.anyRequest().authenticated()
									.and()
									.formLogin()
									.loginPage("/login").permitAll()
									.and()
									.logout().permitAll();
	}
	
}
