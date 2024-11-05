package com.two.park.dog;

import java.util.UUID;
import com.two.park.dog.utils.*;

public class Dog {
    private String name;
    private Breed breed;
    private UUID tag;

    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
        this.tag = UUID.randomUUID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaString() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }
    
    public UUID getTag() {
        return tag;
    }


}
