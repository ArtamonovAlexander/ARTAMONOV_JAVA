package com.company;

import com.company.models.User;
import com.company.repositories.UsersRepository;
import com.company.repositories.jdbc.DataBaseConnector;
import com.company.repositories.jdbc.UsersRepositoryJdbcImpl;
import com.company.utils.UserFromConsoleRetriever;

public class MainOnJdbcRepository {
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "123";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/my_service";

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        DataBaseConnector connector = new DataBaseConnector(DB_URL, DB_USER, DB_PASSWORD);
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connector);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(usersRepository.find(0L));
        System.out.println(usersRepository.find(1L));
        System.out.println(usersRepository.find(2L));
    }
}

