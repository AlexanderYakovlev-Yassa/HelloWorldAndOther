package pl.twerd.alex.helloworld;


import pl.twerd.alex.helloworld.model.Cat;

public class Main {

    public static void main(String[] args) {

        Cat fifi = new Cat();

        fifi.setName("Fifi");
        fifi.setType("Three color");

        Cat vaska = new Cat();
        vaska.setName("Vasil");
        vaska.setType("Black");

        Cat petia = new Cat(6, "Petia", "Ginger", 2);

        System.out.println(fifi);
        System.out.println(vaska);
        System.out.println(petia);
    }
}
