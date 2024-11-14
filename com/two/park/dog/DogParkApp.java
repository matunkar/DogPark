package com.two.park.dog;

import com.two.park.dog.utils.*;
import java.util.ArrayList;
import java.util.Random;

public class DogParkApp {
    
    public static void main (String[] args) {
        Random randomNum = new Random();
        
        DogPark evilRidge = new DogPark("Evil Ridge");
        DogPark sickeningStream = new DogPark("Sickening Stream", 77);
        Dog evilDog = new Dog(Dog.DogNames.getRandomName(), Breed.DALMATION);
        Dog sickeningDog = new Dog(Dog.DogNames.getRandomName(), Breed.SPANIEL);

        evilRidge.addDog(evilDog);
        sickeningStream.addDog(sickeningDog);

        System.out.println("Evil Ridge's current capacity is " + evilRidge.getCurrentDogs().size());
        System.out.println("Sickening Stream's current capacity is " + evilRidge.getCurrentDogs().size());

        evilRidge.removeDog(evilDog);
        sickeningStream.removeDog(sickeningDog);
        sickeningStream.removeDog(sickeningDog);
        System.out.println("Evil Ridge's current capacity is " + evilRidge.getCurrentDogs().size());
        System.out.println("Sickening Stream's current capacity is " + sickeningStream.getCurrentDogs().size());

        evilRidge.closeDogPark();
        System.out.println("Evil Ridge's current capacity is " + evilRidge.getCurrentDogs().size());

        evilRidge.addDog(sickeningDog);



    }
}
