package com.workintech.s18d2.entity;
import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vegetable")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private boolean isGrownOwnTree;

    public void setGrownOnTree(boolean grownOnTree) {
        this.isGrownOwnTree = grownOnTree;
    }
    public boolean isGrownOnTree() {
        return isGrownOwnTree;
    }



}
