package generic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserConvert {

    public Map<Integer, User> process(List<User> list) {

        Map<Integer, User> mapOfUserFromList = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            mapOfUserFromList.put(i, list.get(i));
        }
        return mapOfUserFromList;
    }
}
