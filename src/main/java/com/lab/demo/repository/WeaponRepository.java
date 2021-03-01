package com.lab.demo.repository;

import com.lab.demo.entity.Weapon;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WeaponRepository extends PagingAndSortingRepository<Weapon, Long> {
}
