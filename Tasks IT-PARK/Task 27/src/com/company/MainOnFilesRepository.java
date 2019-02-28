package com.company;

import com.company.repositories.UsersRepository;
import com.company.repositories.files.IdGenerator;
import com.company.repositories.files.UsersRepositoryFilesImpl;
import com.company.utils.UserFromConsoleRetriever;

public class MainOnFilesRepository {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryFilesImpl("users.txt", idGenerator);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(usersRepository.find(0L));
        System.out.println(usersRepository.find(1L));
        System.out.println(usersRepository.find(2L));
    }
}
