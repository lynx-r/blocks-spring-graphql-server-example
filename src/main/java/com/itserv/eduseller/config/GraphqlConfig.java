package com.itserv.eduseller.config;

import com.itserv.eduseller.graphql.Mutation;
import com.itserv.eduseller.graphql.Query;
import com.itserv.eduseller.repo.BlockDataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
@Configuration
public class GraphqlConfig {

  private BlockDataRepository blockDataRepository;

  public GraphqlConfig(BlockDataRepository blockDataRepository) {
    this.blockDataRepository = blockDataRepository;
  }

  @Bean
  public Query query() {
    return new Query(blockDataRepository);
  }

  @Bean
  public Mutation mutation() {
    return new Mutation(blockDataRepository);
  }
}
