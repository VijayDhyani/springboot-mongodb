package com.vijay.mongoIntegration.controller;

import com.vijay.mongoIntegration.model.Pets;
import com.vijay.mongoIntegration.repository.PetsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/pets")
public class PetsController {
    @Autowired
    private PetsRepository petsRepository;

    @GetMapping(value = "/")
    public List<Pets> getAll() {
        return petsRepository.findAll();
    }
    @RequestMapping(value = "/{id}")
    public Pets getPetById(@PathVariable("id") ObjectId id) {
        return petsRepository.findBy_id(id);
    }

    @PutMapping(value = "/{id}")
    public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
        pets.set_id(id);
        petsRepository.save(pets);
    }


    @PostMapping(value ="/")
    public Pets createPet(@Valid @RequestBody Pets pets) {
        pets.set_id(ObjectId.get());
        petsRepository.save(pets);
        return pets;
    }

    @DeleteMapping(value = "/{id}")
    public void deletePet(@PathVariable ObjectId id) {
        petsRepository.delete(petsRepository.findBy_id(id));
    }

}
