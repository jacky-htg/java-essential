package com.rebels.learn;

import com.rebels.learn.func.MultiplyFunc;

public class Main {
    public static void main(String[] args){
//        Animal myAnimal = new Animal();  // Create a Animal oop
//        Animal myPig = new Pig();  // Create a Pig oop
//        Animal myDog = new Dog();  // Create a Dog oop
//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();
        MultiplyFunc multiplyFunc = new MultiplyFunc();
        int a = multiplyFunc.Multiply(5,2);
        double b = multiplyFunc.Multiply(0.7,12.96);
        String c = multiplyFunc.Multiply("deri","kurniawan");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
