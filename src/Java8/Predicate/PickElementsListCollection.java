package Java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User {
    String name, role;

    User(String a, String b) {
        name = a;
        role = b;
    }

    public User() {
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "User Name : " + getName() + ", Role :" + getRole();
    }

    public static List<User> process(List<User> users,
                                     Predicate<User> predicate) {
        List<User> result = new ArrayList<>();
        for (User user : users)
            if (predicate.test(user))
                result.add(user);
        return result;
    }
}
class PickElementsListCollections extends User{

    public static void main(String []args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        List<User> admins = User.process(users, (User u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }


}
