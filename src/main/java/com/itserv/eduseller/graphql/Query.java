package com.itserv.eduseller.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.itserv.eduseller.model.BlockData;
import com.itserv.eduseller.repo.BlockDataRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
public class Query implements GraphQLQueryResolver {
  private BlockDataRepository blockDataRepository;

  public Query(BlockDataRepository blockDataRepository) {
    this.blockDataRepository = blockDataRepository;
  }

  public List<BlockData> getBlocks(int page, int size) {
    return blockDataRepository.findAll(PageRequest.of(page, size, Sort.Direction.DESC, "order")).getContent();
  }
}
