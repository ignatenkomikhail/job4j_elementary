package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        int speed = 0;
        speed += 10;
    }
    @Override
    public void passenger(int passenger) {
        if (passenger <= 21) {
            this.go();
        } else {
            System.out.println("Нет мест!");
        }
    }
    @Override
    public double fill(int fuel) {
        double price = 0.0;
        price = 45.5 * fuel;
        return price;
    }
}
