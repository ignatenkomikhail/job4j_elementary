package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Algorithms", 120);
        books[1] = new Book("Clean code", 600);
        books[2] = new Book("Mathematics", 190);
        books[3] = new Book("The philosophy of programming", 1500);
        System.out.println("=====List of books:=====");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("=====List of books (changing the order):=====");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println("=====List of books with the title \"Clean code\"=====");
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
