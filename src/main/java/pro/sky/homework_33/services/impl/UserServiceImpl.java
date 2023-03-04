package pro.sky.homework_33.services.impl;

import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.UserDao;
import pro.sky.homework_33.services.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean checkUserExist(User user) {

        return dao.getUserByName(user.getName()) != null;
    }
}
