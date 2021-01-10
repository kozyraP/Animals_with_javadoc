package com.company;

/**
 * Fish class
 * extends from Animal
 * @author p.kozyra
 */
public class Fish extends Animal {
    public Fish(String name, String toy, String food) {
        super(name, toy, food);
    }

    @Override
    public void eat() {
        System.out.println("I am a fish");
        super.eat();
    }
}
