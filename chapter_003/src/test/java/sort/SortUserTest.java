package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {

    @Test
    public void whenListUserThenReturnTreeSetUser() {

        SortUser sortUser = new SortUser();

        List<User> listUser = new ArrayList<>();
        listUser.add(new User("Marina", 34));
        listUser.add(new User("Vital", 7));
        listUser.add(new User("Andrew", 36));
        System.out.println(listUser);

        System.out.println(sortUser.sort(listUser));

        Set<User> userSet = new TreeSet<>();
        userSet.add(new User("Vital", 7));
        userSet.add(new User("Marina", 34));
        userSet.add(new User("Andrew", 36));

        assertThat(sortUser.sort(listUser), is(userSet));

    }
}
