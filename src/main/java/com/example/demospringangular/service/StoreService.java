package com.example.demospringangular.service;

import com.example.demospringangular.domain.Store;

public interface StoreService extends BaseService<Store> {

    Store findByName(String name);
}
