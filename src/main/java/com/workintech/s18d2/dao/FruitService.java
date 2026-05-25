package com.workintech.s18d2.dao;


import com.workintech.s18d2.entity.Fruit;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface FruitService {
    List<Fruit> findAll();
    Fruit save(Fruit fruit);
    Fruit delete(long id);
    Fruit findById(long id);
    List<Fruit> getByPriceDesc();
    List<Fruit> getByPriceAsc();
    List<Fruit> searchByName(String name);


}
