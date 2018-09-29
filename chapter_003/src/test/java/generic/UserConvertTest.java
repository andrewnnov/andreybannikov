package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {

    @Test
    public void when2ElementOfListWhen2ElementOfMap() {
        UserConvert userConvert = new UserConvert();
        List<User> listOfUser = new ArrayList<>();
        listOfUser.add(new User(23, "Андрей", "Нижний Новгород"));
        listOfUser.add(new User(24, "Вася", "Волгоград"));

       Map<Integer, User> resultMap = userConvert.process(listOfUser);

        HashMap<Integer, User> expectMap = new HashMap<>();
        expectMap.put(0, listOfUser.get(0));
        expectMap.put(1, listOfUser.get(1));


        assertThat(resultMap, is(expectMap));




    }



}
