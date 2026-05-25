package com.workintech.s18d2.service;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.dao.FruitService;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exceptions.PlantException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;

public class FruitServiceImpl implements FruitService {
    private final FruitRepository fruitRepository;


    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> findAll(){
        return fruitRepository.findAll();

    }

    @Override
    public Fruit save(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(long id) {
        Fruit fruit = findById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }

    @Override
    public Fruit findById(long id) {
        return fruitRepository.findById(id).orElseThrow(() ->
                // Burada genel RuntimeException yerine kendi exception'ını fırlatmalısın
                new PlantException("Bulunamadı: " + id, HttpStatus.NOT_FOUND)
        );
    }
    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }
}
