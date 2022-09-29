package com.example.demospringangular.service;

import com.example.demospringangular.domain.StoreCategory;

public interface StoreCategoryService extends BaseService<StoreCategory> {
    StoreCategory findByName(String name);


}
