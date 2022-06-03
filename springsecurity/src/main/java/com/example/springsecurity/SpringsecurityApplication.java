package com.example.springsecurity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

}
@RestController
class BaseController{
	@Autowired
	AuthenticationManager authenticationManager;
	@GetMapping("/hello")
	public String sayHello(){
		return "Hellow";
	}
	@PostMapping("/rest/login")
	public ResponseEntity<String> login(@RequestBody  LoginDTO loginDTO){
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginDTO.getUsername(),loginDTO.getPassword());
		authenticationManager.authenticate(token);
		return null;
	}

}
@Data
class LoginDTO{
	private String username;
	private String password;
}
@EnableWebSecurity
class WebSecurity extends WebSecurityConfigurerAdapter{
	@Bean
	@Override
	public AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManagerBean();
	}
}
