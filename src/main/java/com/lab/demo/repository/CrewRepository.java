package com.lab.demo.repository;

import com.lab.demo.entity.Crew;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CrewRepository extends PagingAndSortingRepository<Crew, Long> {
}
