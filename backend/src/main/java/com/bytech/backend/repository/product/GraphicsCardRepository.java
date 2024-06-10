package com.bytech.backend.repository.product;

import com.bytech.backend.model.product.GraphicsCard;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface GraphicsCardRepository extends MongoRepository<GraphicsCard, ObjectId> {
    @Query("{'chipsetProducer':?0}")
    List<GraphicsCard> findByChipsetProducer(String chipsetProducer);

    @Query("{'chipsetType':?0}")
    List<GraphicsCard> findByChipsetType(String chipsetType);

}
