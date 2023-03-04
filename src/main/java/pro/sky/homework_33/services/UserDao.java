package pro.sky.homework_33.services;

import pro.sky.homework_33.model.User;

import java.util.List;

public interface UserDao {


    User getUserByName(String name);

    List<User> findAllUsers();

}
