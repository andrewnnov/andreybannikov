package sort;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        char[] leftArrayOfElement = left.toCharArray();
        char[] rightArrayOfElement = right.toCharArray();

        int lengthToLeft = left.length();
        int lengthToRight = right.length();

        int minOfTwoList = Math.min(lengthToLeft, lengthToRight);

        int k = 0;
        while (k < minOfTwoList) {
            char el1 = leftArrayOfElement[k];
            char el2 = rightArrayOfElement[k];

            if(el1 != el2) {
                return el1 - el2;
            }
            k++;
        }

        if (lengthToLeft - lengthToRight == 0) {
            return 0;
        } else return (lengthToLeft - lengthToRight) > 0 ? 1 : -1;

    }
}
