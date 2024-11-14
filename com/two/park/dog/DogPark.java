package com.two.park.dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class DogPark {
    private String name;
    private int maxDogs;
    private ArrayList<Dog> currentDogs = new ArrayList<>();
    private boolean isOpen;

    public DogPark(String name) {
        this.name = name;
        maxDogs = 50;
        isOpen = true;
    }
    public DogPark(String name, int maxDogs) {
        this.name = name;
        this.maxDogs = maxDogs;
        isOpen = true;
    }

    public void addDog(Dog dog) {
        if (isOpen == true) {
            currentDogs.add(dog);
        }
        else {
            System.out.println ("The park " + this.getName() + " is closed.");
        }
    }

    public void removeDog(Dog dog) {
        currentDogs.removeIf(n -> n.getTag() == dog.getTag());
    }

    public void closeDogPark() { 
        for (int x = 0; currentDogs.size() > 0; x++) {
            currentDogs.remove(x);
        }
        isOpen = false;
    }
    
    public void openDogPark() {
        isOpen = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDogs() {
        return maxDogs;
    }

    public ArrayList<Dog> getCurrentDogs() {
        return currentDogs;
    }


}