package com.lab.demo.repository;

import com.lab.demo.entity.Ship;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ShipRepository extends PagingAndSortingRepository<Ship, Long> {
}
