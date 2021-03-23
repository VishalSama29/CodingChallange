package com.learn.coding.reposotiry;

import com.learn.coding.entity.NumberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository  extends CrudRepository<NumberEntity, Long> {
}
