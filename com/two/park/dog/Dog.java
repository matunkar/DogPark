package com.two.park.dog;

import java.util.UUID;
import com.two.park.dog.utils.*;
import java.util.Random;

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

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }
    
    public UUID getTag() {
        return tag;
    }

    public static class DogNames {
        public static String[] names = {"Heidi", "Cameron", "Ellen", "Amelia", "Declan", "Turner", "Winston", "Ryland", "Deacon", "Jessie", "Jared", "Julian", "Sky", "Lucille", "Case", "Bridger", "Darwin"};
        private static Random randomNum = new Random();

        public static String getRandomName() {
            return names[randomNum.nextInt(names.length)];
        }
    }

}
