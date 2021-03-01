package com.lab.demo.repository;

import com.lab.demo.entity.HoldItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HoldItemRepository extends PagingAndSortingRepository<HoldItem, Long> {
}
