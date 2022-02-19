package com.disc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.disc.config.security.AuthenticationByTokenFilter;
import com.disc.config.security.AuthenticationService;
import com.disc.config.security.TokenService;
import com.disc.repository.UserRepository;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v3/api-docs/**",
                                   "/swagger-ui/**");
    }
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authenticationService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET,"/").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/user/save/*").permitAll()
			.antMatchers(HttpMethod.POST,"/user/save/*").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/user/*").permitAll()
			.antMatchers(HttpMethod.GET,"/user/*").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/user").permitAll()
			.antMatchers(HttpMethod.GET,"/user").permitAll()
//			.antMatchers(HttpMethod.OPTIONS,"/company/associate").permitAll()
//			.antMatchers(HttpMethod.POST,"/company/associate").permitAll()
//			.antMatchers(HttpMethod.GET,"/sector/*").permitAll()			
			.antMatchers(HttpMethod.OPTIONS,"/auth").permitAll()
			.antMatchers(HttpMethod.POST,"/auth").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/company").permitAll()
			.antMatchers(HttpMethod.GET,"/company").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/company/save").permitAll()
			.antMatchers(HttpMethod.POST,"/company/save").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/company/*").permitAll()
			.antMatchers(HttpMethod.DELETE,"/company/*").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/company/*").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/company/*").permitAll()
			.antMatchers(HttpMethod.GET,"/company/*").permitAll()
			.antMatchers(HttpMethod.PUT,"/company/update").permitAll()
			.antMatchers(HttpMethod.POST,"/area/save").permitAll()
			.antMatchers(HttpMethod.POST,"/opcao/save").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/opcao").permitAll()
			.antMatchers(HttpMethod.GET,"/opcao").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/opcao/*").permitAll()
			.antMatchers(HttpMethod.GET,"/opcao/*").permitAll()
			.antMatchers(HttpMethod.GET,"/item/all/*").permitAll()		
			.antMatchers(HttpMethod.OPTIONS,"/answer/save").permitAll()
			.antMatchers(HttpMethod.POST,"/answer/save").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/result/save").permitAll()
			.antMatchers(HttpMethod.POST,"/result/save").permitAll()
			.antMatchers(HttpMethod.OPTIONS,"/result").permitAll()
			.antMatchers(HttpMethod.GET,"/result").permitAll()
			.anyRequest().authenticated()
			.and().csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().addFilterBefore(new AuthenticationByTokenFilter(tokenService,userRepository), UsernamePasswordAuthenticationFilter.class);
	}
}
