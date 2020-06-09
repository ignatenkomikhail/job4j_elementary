package ru.job4j.collection;

import java.util.Objects;

public class Order {
    private String number;
    private String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Order{"
                + "number='" + this.number + '\''
                + ", name='" + this.name + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.number, order.number)
                && Objects.equals(this.name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.number, this.name);
    }
}
