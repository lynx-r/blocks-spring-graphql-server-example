package com.itserv.eduseller.config;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
//@SpringBootApplication
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//  private AppProperties appProperties;
//
//  public SecurityConfig(AppProperties appProperties) {
//    this.appProperties = appProperties;
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.antMatcher("/**").addFilterBefore(corsFilter(), SessionManagementFilter.class)
//        .authorizeRequests().antMatchers("/graphql").permitAll().and()
//        .formLogin()
//        .loginPage("/login").failureUrl("/login-error");
//  }
//
//
//  private CorsFilter corsFilter() {
//    return new CorsFilterAdapter(
//        appProperties.getClientUrl(),
//        appProperties.getCorsHeaders(),
//        appProperties.getCorsMethods())
//        .corsFilter();
//  }
//}
