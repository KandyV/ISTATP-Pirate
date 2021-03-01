package com.lab.demo.repository;

import com.lab.demo.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
