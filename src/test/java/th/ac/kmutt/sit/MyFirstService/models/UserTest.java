package th.ac.kmutt.sit.MyFirstService.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import th.ac.kmutt.sit.MyFirstService.controllers.User;

public class UserTest {
    User user;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createUserNamePhacharaShouldReturnNamePhachara() {
        user = new User(0,"Phachara");
        assertEquals("Phachara",user.getName());
    }

    @Test
    public void createUserIdZeroShouldReturnIdZero() {
        user = new User(0,"Phachara");
        assertEquals(0,user.getId());
    }

}