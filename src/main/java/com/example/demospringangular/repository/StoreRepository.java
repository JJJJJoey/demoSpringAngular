package com.example.demospringangular.repository;

import com.example.demospringangular.domain.Store;
import com.example.demospringangular.domain.StoreCategory;
import com.example.demospringangular.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store,Long> {
    Store findByName(String name);

    Store findByStoreCategory(StoreCategory storeCategory);
}
