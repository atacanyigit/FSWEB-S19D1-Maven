package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> findAll();
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);
    Vegetable findById(long id);
    List<Vegetable> getByPriceDesc();
    List<Vegetable> getByPriceAsc();
    List<Vegetable> searchByName(String name);
}
