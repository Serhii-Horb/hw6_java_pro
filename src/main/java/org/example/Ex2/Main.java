package org.example.Ex2;

public class Main {
    public static void main(String[] args) {
        Box<Sneakers> sneakersBox = new Box<>(20, 20, 20);
        Sneakers sneakers = new Sneakers(21, 18, 18);
        System.out.println(sneakersBox.checkItem(sneakers));
    }
}
