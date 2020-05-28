package ru.job4j.ex;

public class UserInvalidException extends ElementNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
