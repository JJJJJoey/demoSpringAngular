package com.example.demospringangular.controller;

import com.example.demospringangular.domain.Store;
import com.example.demospringangular.domain.User;
import com.example.demospringangular.service.BaseService;
import com.example.demospringangular.service.StoreService;
import com.example.demospringangular.service.StoreServiceImpl;
import com.example.demospringangular.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("stores")
public class StoreController extends AbstractController<Store>{

    private final StoreService storeService;
    @Override
    protected BaseService<Store> getBaseService() {
        return storeService;
    }

    @GetMapping(params = "name")
    public ResponseEntity<ApiResponse<Store>> findByName(@RequestParam String name) {
        final Store findingByName = storeService.findByName(name);
        if (findingByName== null) {
            throw new NoSuchElementException("Element not found");
        }
        return ResponseEntity.ok(ApiResponse.<Store>builder().data(findingByName).build());
    }
}
