package com.mightyjava.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TrendService<T> {
    Page<T> findAllTrends(Pageable pageable,int id,String Country);
    Page<T> findAll(Pageable pageable);


}
