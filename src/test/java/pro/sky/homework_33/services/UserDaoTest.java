package pro.sky.homework_33.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.impl.UserDaoImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private static final String CORRECT_NAME = "Sandra";
    private static final User CORRECT_USER_BY_NAME = new User("Sandra", 30, false);
    private static final String INCORRECT_NAME = "Ivan";


    private UserDaoImpl daoImpl;

    @BeforeEach
    void addListUsers() {
        daoImpl = new UserDaoImpl();
    }

    @AfterEach
    void addListNull() {
        daoImpl = null;
    }

    @Test
    void shouldReturnUserByName() {

        assertEquals(daoImpl.getUserByName(CORRECT_NAME), CORRECT_USER_BY_NAME);
        assertNotNull(daoImpl.getUserByName(CORRECT_NAME));
    }

    @Test
    void shouldReturnNullByName() {

        assertNull(daoImpl.getUserByName(INCORRECT_NAME));
    }
}