package com.thanos.spm.repo.supplier;

import com.thanos.spm.domain.supplier.Supplier;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by zhangzheng on 7/20/18
 * Email:zhangzheng@youzan.com
 */
@Repository
public interface SupplierRepo extends MongoRepository<Supplier, ObjectId> {
  /**
   * 通过供应商名称和等级 分页获取 指定状态到 供应商列表
   * @param name
   * @param level
   * @param pageable
   * @return
   */
  Page<Supplier> findByNameAndAndLevelAndState(String name, Integer level, Integer state, Pageable pageable);

  /**
   * 通过id查询
   * @param id
   * @return
   */
  Supplier findById(Long id);


}
