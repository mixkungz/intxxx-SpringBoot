package th.ac.kmutt.sit.MyFirstService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") int id) {
        ArrayList<User> users = new ArrayList();
        users.add(new User(1,"A"));
        users.add(new User(2,"B"));
        users.add(new User(3,"C"));
        users.add(new User(4,"D"));
        users.add(new User(5,"E"));

        return users.get(id-1);
    }

    @GetMapping("/users")
    public ArrayList<User> getUser() {
        ArrayList users = new ArrayList();
        users.add(new User(1,"A"));
        users.add(new User(2,"B"));
        users.add(new User(3,"C"));
        users.add(new User(4,"D"));
        users.add(new User(5,"E"));
        return users;
    }
}
