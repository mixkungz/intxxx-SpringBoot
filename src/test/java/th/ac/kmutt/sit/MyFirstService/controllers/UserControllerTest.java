package th.ac.kmutt.sit.MyFirstService.controllers;

import org.junit.Before;
import org.junit.Test;
import th.ac.kmutt.sit.MyFirstService.controllers.User;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserControllerTest {
    ArrayList<User> users;
    UserController userController;

    @Before
    public void setUp() throws Exception {
        userController = new UserController();
        users = new ArrayList();
        users.add(new User(1,"A"));
        users.add(new User(2,"B"));
        users.add(new User(3,"C"));
        users.add(new User(4,"D"));
    }

    @Test
    public void getUserIdOneShouldReturnNameA() {
        assertEquals("A",users.get(0).getName());
    }

    @Test
    public void getUserIdTwoShouldReturnNameB() {
        assertEquals("B",users.get(1).getName());
    }

    @Test
    public void getUserIdThreeShouldReturnNameC() {
        assertEquals("C",users.get(2).getName());
    }

    @Test
    public void getUserIdFourShouldReturnNameD() {
        assertEquals("D",users.get(3).getName());
    }

    @Test
    public void getAllUserAmountShouldReturnFour() {
        assertEquals(4,users.size());
    }



}