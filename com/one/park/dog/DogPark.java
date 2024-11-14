package com.one.park.dog;

public class DogPark {
    private String name;
    private int maxDogs;
    private int currentCapacity;

    public DogPark(String name) {
        this.name = name;
        maxDogs = 50;
        currentCapacity = 0;
    }

    public DogPark(String name, int maxDogs) {
        this.name = name;
        this.maxDogs = maxDogs;
        currentCapacity = 0;
    }

    public void addDog() {
        if(currentCapacity > maxDogs) {
            System.out.println("The dog park is currently full.");
        } else {
            currentCapacity++;
        }
    }
    public void removeDog() {
        if (currentCapacity > 0) {
            currentCapacity--;
        } else {
            System.out.println("The dog park is currently empty.");
        }

    }

    public void closePark() {
        while (currentCapacity > 0) {
            this.removeDog();
        }
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

    public void setMaxDogs(int maxDogs) {
        this.maxDogs = maxDogs;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }
}