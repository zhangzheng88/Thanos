package com.thanos.portal.domain.monitor;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by zhangzheng on 11/17/18
 * Email:zhangzheng@youzan.com
 */
@Repository
public interface MonitorRepo extends MongoRepository<Monitor,ObjectId> {

}