package com.thanos.soulgem.domain.authority;

import com.thanos.soulgem.domain.common.Aggregate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Create by zhangzheng on 7/24/18
 * Email:zhangzheng@youzan.com
 */
@Aggregate
@Document
public class Company {

  @Id
  String name;

  @DBRef
  Company parent;

  String telephone;

  public Company(String name, Company parent, String telephone) {
    this.name = name;
    this.parent = parent;
    this.telephone = telephone;
  }

}