package com.itserv.eduseller.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.itserv.eduseller.model.BlockData;
import com.itserv.eduseller.repo.BlockDataRepository;

import java.util.List;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
public class Mutation implements GraphQLMutationResolver {

  private BlockDataRepository blockDataRepository;

  public Mutation(BlockDataRepository blockDataRepository) {
    this.blockDataRepository = blockDataRepository;
  }

  public BlockData add(BlockData blockData) {
    return blockDataRepository.save(blockData);
  }

  public BlockData delete(String id) {
    return blockDataRepository.findById(id)
        .map(blockData -> {
          blockDataRepository.delete(blockData);
          return blockData;
        })
        .orElseThrow();
  }

  public BlockData save(BlockData blockData) {
    return blockDataRepository.save(blockData);
  }

  public List<BlockData> batchSave(List<BlockData> blocks) {
    blocks.sort((o1, o2) -> o2.getOrder() - o1.getOrder());
    return blockDataRepository.saveAll(blocks);
  }
}
