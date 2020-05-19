package ru.job4j.pojo;

public class Shop {

    public static void show(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static void delete(Product[] products, int index) {
        while (index < products.length - 1) {
            if (products[index] != null) {
                products[index] = products[index + 1];
                index++;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        Shop.show(products);
        System.out.println("\nУдаляем значение из ячейки с индексом 1");
        Shop.delete(products, 1);
        Shop.show(products);
    }
}
