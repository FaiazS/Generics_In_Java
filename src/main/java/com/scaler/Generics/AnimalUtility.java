package com.scaler.Generics;

import java.util.List;

public class AnimalUtility {

    //public static <T extends Animal> void printAnimalNames(List <T> animals){

        //for(T animal : animals){

           // System.out.println(animal.getName());
       // }
    //}

    public static void printAnimalNames(List<? extends Animal> animals){

        for(Animal animal : animals){

            System.out.println(animal.getName());
        }
    }
}
