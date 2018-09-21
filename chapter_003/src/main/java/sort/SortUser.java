package sort;

import java.util.*;

public class SortUser {

    public Set<User> sort (List<User> list) {
        Set<User> treeSetUser = new TreeSet<>();
        return new TreeSet<>(list);
    }

    public List<User> sortNameLength (List<User> users) {

        //List<User> newListUser = new ArrayList<>();

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
//                Integer lengthWorld1 = new Integer(o1.getName().length());
//                Integer lengthWorld2 = new Integer(o2.getName().length());
//                return lengthWorld1.compareTo(lengthWorld2);
                return o1.getName().length() - o2.getName().length();
            }
        });

        return users;
    }

    public List<User> sortByAllFields (List<User> users) {
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return 0;
            }
        });
        return users;
    }
}
