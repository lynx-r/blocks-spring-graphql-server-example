package com.itserv.eduseller.config;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

class CorsFilterAdapter {
  private final String clientUrl;
  private final String[] headers;
  private final String[] methods;

  CorsFilterAdapter(String clientUrl, String headers, String methods) {
    this.clientUrl = clientUrl;
    this.headers = headers.split(",");
    this.methods = methods.split(",");
  }

  CorsFilter corsFilter() {
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(false);
    config.addAllowedOrigin(clientUrl);
    for (String header : headers) {
      config.addAllowedHeader(header);
    }
    for (String method : methods) {
      config.addAllowedMethod(method);
    }
    config.setAllowCredentials(true);
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);
    return new CorsFilter(source);
  }
}