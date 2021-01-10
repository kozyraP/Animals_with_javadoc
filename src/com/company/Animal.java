package com.company;
/**
 * Animal class
 * @author p.kozyra
 */
public class Animal {
    public String name;
    public String toy;
    public String food;

    public Animal(String name, String toy, String food) {
        this.name = name;
        this.toy = toy;
        this.food = food;
    }

    /**
     *
     * eat method
     */
    public void eat() {
        System.out.printf("%s is eating %s\n", name, food);
    }
    /**
     *
     * play method
     */
    public void play() {
        System.out.printf("%s is playing with the %s\n", name, toy);
    }
    /**
     *
     * sleep method
     */
    public void sleep() {
        System.out.printf("%s is sleeping: zzZZZZz\n", name);
    }
}
