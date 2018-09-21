package sort;

import org.junit.Test;

import java.util.*;

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

    @Test
    public void whenLengthNameThenSortListUser() {
        SortUser sortUser = new SortUser();

        User user1 = new User("Andrew", 36);
        User user2 = new User("Mar", 34);

        List<User> sortLengthName = new ArrayList<>();
        sortLengthName.add(user1);
        sortLengthName.add(user2);

        System.out.println(sortLengthName);

        List<User> expectUserLength = Arrays.asList(user2, user1);

        System.out.println(expectUserLength);
        System.out.println(sortUser.sortNameLength(sortLengthName));


        assertThat(sortUser.sortNameLength(sortLengthName), is(expectUserLength));

    }

    @Test
    public void whenOneElemenrMoretwoThenMinusOne() {

        User user1 = new User("Andrew", 36);
        User user2 = new User("Andrew", 34);

        List<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);

        List<User> expectList = Arrays.asList(user2, user1);


        assertThat(new SortUser().sortByAllFields(user),is(expectList) );

    }
}
