package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*class User {
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
}*/
class PickElementsListCollectionsUsingStream extends User{

    public static void main(String []args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        users.add(new User("Erik", "member"));
        users.add(new User("Andy", "coordinator"));
//        List<User> admins = User.process(users, (User u) -> u.getRole().equals("admin"));
//        System.out.println(admins);
        List<User> admins = users.stream().filter(
                user -> user.getRole().equals("member")).collect(Collectors.toList());
        System.out.println(admins);
    }


}
