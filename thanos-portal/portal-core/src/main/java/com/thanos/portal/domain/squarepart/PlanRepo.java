package com.thanos.portal.domain.squarepart;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by zhangzheng on 10/5/18
 * Email:zhangzheng@youzan.com
 */
@Repository
public interface PlanRepo extends MongoRepository<Plan,ObjectId> {

}
