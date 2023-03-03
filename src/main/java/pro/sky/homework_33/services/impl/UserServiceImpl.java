package pro.sky.homework_33.services.impl;

import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.UserDao;
import pro.sky.homework_33.services.UserService;

public class UserServiceImpl implements UserService {

    private final UserDaoImpl dao = new UserDaoImpl();


    @Override
    public boolean checkUserExist(User user) {

        if (getDao().findAllUsers().contains(user)) {
            return true;
        }
        return false;
    }

    public UserDao getDao() {
        return dao;
    }
}
