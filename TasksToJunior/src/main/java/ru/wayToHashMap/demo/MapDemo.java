package ru.wayToHashMap.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "first");
        map.put("a", "second");

        String s = map.get("a");
        System.out.println(s);

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue("second"));
        System.out.println(map.size());

        System.out.println(map.remove("a"));
    }


}
