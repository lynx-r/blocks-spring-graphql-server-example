package com.itserv.eduseller.repo;

import com.itserv.eduseller.model.BlockData;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Aleksey Popryadukhin on 08/08/2018.
 */
public interface BlockDataRepository extends MongoRepository<BlockData, String> {
}
