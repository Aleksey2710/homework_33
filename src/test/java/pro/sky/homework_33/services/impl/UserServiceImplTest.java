package pro.sky.homework_33.services.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.UserService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    private static final User CORRECT_USER = new User("Brunhilda", 35, false);
    private static final User INCORRECT_USER = new User("Ivan", 20, true);

//    private UserDaoImpl userDao;
    @Mock
    private UserDaoImpl userDaoMock;

    @InjectMocks
    private UserServiceImpl out;

    @BeforeEach
    void addListUsers() {
        userDaoMock = new UserDaoImpl();
    }

    @AfterEach
    void addListNull() {
        userDaoMock = null;
    }

    @Test
    void shouldReturnTrueUserExist() {

        assertNotNull(userDaoMock);

        when(userDaoMock.checkUserExist(CORRECT_USER)).thenReturn(true);

        assertTrue(out.checkUserExist(CORRECT_USER));
    }

    @Test
    void shouldReturnFalseUserExist() {

        when(userDaoMock.checkUserExist(INCORRECT_USER)).thenReturn(false);

        assertFalse(out.checkUserExist(INCORRECT_USER));
    }
}