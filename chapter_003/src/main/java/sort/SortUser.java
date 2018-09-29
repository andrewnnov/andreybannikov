package sort;

import java.util.*;

public class SortUser {

    public Set<User> sort (List<User> list) {
        return new TreeSet<>(list);
    }

    public List<User> sortNameLength (List<User> users) {

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        return users;
    }

    public List<User> sortByAllFields (List<User> users)  {
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int compareName = o1.getName().compareTo(o2.getName());
                return compareName !=0 ? compareName : Integer.compare(o1.getAge(), o2.getAge());
            }

        });
        return users;

    }
}
