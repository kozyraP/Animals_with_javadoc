package com.company;

/**
 * Cat class
 * extends from Animal
 * @author p.kozyra
 */
public class Cat extends Animal {
    public Cat(String name, String toy, String food) {
        super(name, toy, food);
    }

    @Override
    public void eat() {
        System.out.println("I am a cat");
        super.eat();
    }
}
