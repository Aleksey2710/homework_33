package pro.sky.homework_33.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.UserDao;
import pro.sky.homework_33.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User> userList = new ArrayList<>();

    public UserDaoImpl() {
        userList.add(new User("Bob", 25, true));
        userList.add(new User("Bill", 20, true));
        userList.add(new User("Sandra", 30, false));
        userList.add(new User("Brunhilda", 35, false));
        userList.add(new User("Jack", 19, true));
        userList.add(new User("Maria", 24, false));
    }

    @Override
    public User getUserByName(String name) {

        for (User value : userList) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {

        return userList;
    }
}
