package com.company;

/**
 * Dog class
 * extends from Animal
 * @author p.kozyra
 */
public class Dog extends Animal {
    public Dog(String name, String toy, String food) {
        super(name, toy, food);
    }

    @Override
    public void eat() {
        System.out.println("I am a dog");
        super.eat();
    }
}
