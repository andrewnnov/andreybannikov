package ru.job4j.search;

import java.util.Arrays;
import java.util.List;

public class Compare2List {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Iv", "Ivaqqqqqq", "Pet");
        List<String> list2 = Arrays.asList("Iv", "Iv", "Pet");

        for (int i = 0; i < list1.size(); i++) {

            String s1 = list1.get(i);
            String s2 = list2.get(i);
            int cmpResult = compareStrings(s1, s2);
            if (cmpResult == 0) {
                System.out.println("Element List1 equals Element List2");
            } else if (cmpResult == -1) {
                System.out.println("Element List1 less than Element List2. List1 less than List2");
                break;
            } else if (cmpResult == 1) {
                System.out.println("Element List1 more than Element List2. List2 less than List1");
                break;
            }
        }
    }

    /**
     * @param s1
     * @param s2
     * @return return 1 if s1 > s2;
     * -1 if s1 < s2;
     * 0 if s1 == s2;
     */
   private static int compareStrings(String s1, String s2) {

        int s1Length = s1.length();
        int s2Length = s2.length();
        int minS1AndS2 = Math.min(s1Length, s2Length);

        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();

        int k =0;

        while (k < minS1AndS2) {
            char c1 = first[k];
            char c2 = second[k];

            if(c1 != c2) {
                return c1 - c2;
            }
            k++;
        }

        if(s1Length - s2Length == 0) {
            return 0;
        }else return (s1Length - s2Length) > 0 ? 1 : -1;
    }


}
