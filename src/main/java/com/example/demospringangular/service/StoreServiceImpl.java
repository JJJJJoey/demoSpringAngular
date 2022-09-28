package com.example.demospringangular.service;


import com.example.demospringangular.domain.Store;
import com.example.demospringangular.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl extends BaseServiceImpl<Store> implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public JpaRepository<Store , Long> getRepository(){
        return storeRepository;
    }

    @Override
    public Store findByName(String name){
        return storeRepository.findByName(name);
    }
}
