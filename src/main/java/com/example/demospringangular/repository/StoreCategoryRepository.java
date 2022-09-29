package com.example.demospringangular.repository;

import com.example.demospringangular.domain.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreCategoryRepository extends JpaRepository<StoreCategory, Long> {
    StoreCategory findByName(String name);


}
