package br.com.vaanalvesr.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

@Entity
public class Cat extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Size(max = 15)
    private String name;

    private Double age;

    @ManyToOne
    private Breed breed;

    public static List<Cat> findByName(String name) {
        return list("name", name);
    }

    public static List<Cat> findKittens() {
        return find("age <= ?1", 0.7).list();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
