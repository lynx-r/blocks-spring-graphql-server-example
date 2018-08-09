package com.itserv.eduseller.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
@Getter
@Component
public class AppProperties {
  @Value("${CLIENT_URL}")
  private String clientUrl;
  @Value("${HEADERS}")
  private String corsHeaders;
  @Value("${METHODS}")
  private String corsMethods;
}
