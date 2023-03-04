package pro.sky.homework_33.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.homework_33.model.User;
import pro.sky.homework_33.services.impl.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    private static final String CORRECT_NAME = "Brunhilda";
    private static final String INCORRECT_NAME = "Ivan";
    private static final User CORRECT_USER = new User("Brunhilda", 35, false);
    private static final User INCORRECT_USER = new User("Ivan", 20, true);

//    private final UserDaoImpl userDao = new UserDaoImpl();
    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl out;


    @Test
    void shouldReturnTrueUserExist() {

        when(userDaoMock.getUserByName(CORRECT_NAME)).thenReturn(CORRECT_USER);

        assertTrue(out.checkUserExist(CORRECT_USER));

        verify(userDaoMock, times(1)).getUserByName(CORRECT_NAME);
    }

    @Test
    void shouldReturnFalseUserExist() {

        when(userDaoMock.getUserByName(INCORRECT_NAME)).thenReturn(null);

        assertFalse(out.checkUserExist(INCORRECT_USER));

        verify(userDaoMock, times(1)).getUserByName(INCORRECT_NAME);
    }
}