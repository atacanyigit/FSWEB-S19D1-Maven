package com.workintech.s18d2.entity;
import com.workintech.s18d2.enums.FruitType;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
