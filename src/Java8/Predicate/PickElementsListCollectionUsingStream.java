package Java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
