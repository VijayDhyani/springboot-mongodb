package com.vijay.mongoIntegration.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pets {
    @Id
    private ObjectId _id;

    private String name;
    private String species;
    private String breed;
    private int age;

    // Constructors
    public Pets() {}

    public Pets(ObjectId _id, String name, String species, String breed, int age) {
        this._id = _id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
