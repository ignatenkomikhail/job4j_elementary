package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball coloball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(coloball);
        wolf.tryEat(coloball);
        fox.tryEat(coloball);
    }
}
