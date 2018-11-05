package Generics.pair1;

public class PairTest1 {

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        String middle = ArrayAlg.getMiddle("John", "Q", "Public");
        double middle1 = ArrayAlg.getMiddle(3.14, 17.29, 0.0);
        System.out.println(middle);
        System.out.println(middle1);
    }
}

class ArrayAlg {
    /**
     * получает символьные строки с минимальным и максимальным значениями
     * среди элементов массива
     * @param a массив символьных строк
     * @return Пара максимального и минимального значений или пустое значение если
     * параметр а имеет пустое значение
     */

    public static Pair<String> minmax(String[] a) {
        if(a == null || a.length == 0) return null;

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length ; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];

        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length/2];
    }

    public static <T extends Comparable> T min(T[] a) { //T extends Comparable - ограничивает число переменных типов
        if(a==null || a.length == 0) {  // можно использовать только те типы которые Comparable
            return null;
        }
        T smallest = a[0];
        for (int i = 1; i < a.length ; i++) {
            if (smallest.compareTo(a[i]) > 0) {
                smallest = a[i];
            }
        }
        return smallest;
    }
}
