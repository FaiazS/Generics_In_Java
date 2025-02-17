package com.scaler.Generics;

import java.util.ArrayList;
import java.util.List;

import static com.scaler.Generics.AnimalUtility.printAnimalNames;

public class GenericPairClient {

    public static void main(String[] args) {

        GenericPair<Integer,String> genericPair1 = new GenericPair<>(1, " : Java");

        GenericPair<String,Double> genericPair2 = new GenericPair<>("Temperature : ", 25.0);

        GenericPair<String, Long> genericPair3 = new GenericPair<>("Available Balance : ", 52L);

        System.out.println("Generic Pair 1 : " + genericPair1);

        System.out.println("Generic Pair 2 : " + genericPair2);

        System.out.println("Generic Pair 3 : " + genericPair3);

        Animal animal = new Animal();

        animal.setName("Non-Humans");

        Animal animal2 = new Animal();

        animal2.setName("Non-Humans2");

        Bird bird = new Bird();

        bird.setName("Bird");

        Bird bird2 = new Bird();
        bird2.setName("Bird2");

        Bird bird3 = new Bird();
        bird3.setName("Bird3");


        Cat cat = new Cat();

        Cat cat2 = new Cat();
        cat2.setName("Cat2");
        cat2.setType("Persian");

        cat.setName("Cat");

        cat.setType("Persian");

        Cat cat3 = new Cat();

        cat3.setName("Cat3");

        cat3.setType("Persian");

        List<Animal> animals = new ArrayList<>();

        animals.add(animal);
        animals.add(animal2);
        animals.add(bird);
        animals.add(cat);

        printAnimalNames(animals);

        List<Cat> cats = new ArrayList<>();

        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);

        printAnimalNames(cats);


        List<Bird> birds = new ArrayList<>();

        birds.add(bird);
        birds.add(bird2);
        birds.add(bird3);

        printAnimalNames(birds);

    }
}
