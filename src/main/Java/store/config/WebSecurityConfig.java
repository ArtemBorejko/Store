package store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public WebSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/client/**", "/order/**", "/provider/**", "/worker/**", "/item/rmItem/**", "/item/upItem/**", "/item/updateItem/**").hasRole("MANAGER")
                    .antMatchers("/item/addItem/**").hasRole("SELLER")
                    .antMatchers("/resources/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/menu");

    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails managerUser = User.builder()
                .username("Salivan_manager")
                .password(passwordEncoder.encode("managerpassword"))
                .roles(ApplicationUserRole.MANAGER.name())
                .build();

        UserDetails sellerUser = User.builder()
                .username("Tommy_seller")
                .password(passwordEncoder.encode("sellerpassword"))
                .roles(ApplicationUserRole.SELLER.name())
                .build();

        return new InMemoryUserDetailsManager(
                managerUser,
                sellerUser
        );
    }
}
