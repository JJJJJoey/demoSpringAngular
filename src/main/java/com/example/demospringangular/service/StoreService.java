package com.example.demospringangular.service;

import com.example.demospringangular.domain.Store;
import com.example.demospringangular.domain.StoreCategory;

public interface StoreService extends BaseService<Store> {

    Store findByName(String name);

    Store findByStoreCategory(StoreCategory storeCategory);
}
