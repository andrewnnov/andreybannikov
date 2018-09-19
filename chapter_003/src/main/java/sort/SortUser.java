package sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

    public Set<User> sort (List<User> list) {
        Set<User> treeSetUser = new TreeSet<>();
        for (User el: list) {
            treeSetUser.add(el);
        }
        return treeSetUser;
    }
}
