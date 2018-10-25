package ru.Zlatopolskiy.task15_21october;

/*
TaskG01_05: Binary search
Your program should take several String values from keyboard in sorted order,
 and (on the new line) take the value to search for. After this the program should print ordinal number of the word.
Note: all the values should be placed into Comparable[] array.
You are expected to implement two solutions here: linear search and binary search.
 Both should be covered with unit tests.

Sample input: aza baza kaza prokaza sutki_bez_zakaza zaza
                       prokaza
Sample output: 4

 */

public class TaskG01_05 {


    public static void main(String[] args) {
        TaskG01_05 task = new TaskG01_05();
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"aza","", "baza",  "kaza",  "laza", "zaza"};
        String[] newStringArray = {"aza", "baza", "kaza", "prokaza", "sutki_bez_zakaza"};

        System.out.println(task.binarySearch(intArray, 2));
        System.out.println(task.binarySearch(stringArray, "laza"));
        System.out.println(task.binarySearch(newStringArray, "zaza"));
    }

    public Comparable binarySearch(Comparable[] array, Comparable key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2; //wtf?>>> int mid = (low + high) >>> 1;
            Comparable midValue = (Comparable)array[mid];
            int tmp = midValue.compareTo(key);

            if (tmp < 0)
                low = mid + 1;
            else if (tmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

}
//1 - 1
//2 - 10
//3 - 11
//4 - 110
