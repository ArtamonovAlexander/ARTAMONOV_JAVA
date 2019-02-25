package com.company.utils;

import com.company.models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {

    private Scanner scanner;

    public UserFromConsoleRetriever() {
        this.scanner = new Scanner(System.in);
    }

    public User retrieveUser() {
        System.out.println("Вводим данные Пользователя!");
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        return new User(firstName, lastName, login, password);
    }
}
