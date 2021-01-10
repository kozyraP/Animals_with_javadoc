package com.company;

public class Main {
    /**
     * JavaDoc inside the Main class
     * @author p.kozyra
     */
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Rex", "ball", "beef");
        animals[1] = new Cat("Filemon", "plastic mouse", "milk");
        animals[2] = new Fish("Nemo", "stone", "algae");

        for (Animal animal : animals) {
            animal.eat();
            animal.play();
            animal.sleep();
        }

    }
}
