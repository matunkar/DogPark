package com.two.park.dog.utils;

public enum Breed {
    DALMATION(1, "Dalmation"),
    GSD(2, "German Shepherd Dog"),
    TOLL_RETRIEVER(3, "Duck Toll Retriever"),
    ASD(4, "Australian Shepherd Dog"),
    MALINOIS(5, "Belgian Malinois"),
    TOY_POODLE(6, "Toy Poodle"),
    SPANIEL(7, "King Charles Cocker Spaniel");

    private int value;
    private String desc;

    private Breed(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
