package com.example.demospringangular.service;

import com.example.demospringangular.domain.StoreCategory;
import com.example.demospringangular.repository.StoreCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImpl extends BaseServiceImpl<StoreCategory> implements StoreCategoryService {
    private final StoreCategoryRepository categoryRepository;

    @Override
    public JpaRepository<StoreCategory, Long> getRepository() {
        return categoryRepository;
    }

    @Override
    public StoreCategory findByName(final String name) {
        return categoryRepository.findByName(name);
    }
}