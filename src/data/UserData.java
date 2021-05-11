package data;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1 = new User("john", "123456", "John", "john@gmail.com", 10);
        users.add(user1);
        User user2 = new User("bill", "123456", "Bill", "bill@gmail.com", 10);
        users.add(user2);
        User user3 = new User("kien", "123456", "Kien", "kien@gmail.com", 10);
        users.add(user3);
    }
    public static User checkLogin (Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }

}
