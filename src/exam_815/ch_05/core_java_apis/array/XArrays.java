package exam_815.ch_05.core_java_apis.array;

import java.util.Arrays;

public class XArrays {
    public static void main(String[] args) {
        // All methods are heavily overloaded

        /**
         * Numbers sort before letters, uppercase sorts before lowercase
         */
        Arrays.sort(new int[0]);

        /**
         * works only for sorted arrays, otherwise result is unpredictable.
         * if found -> index of match
         * if not found -> Negative value showing one smaller than the negative of the index,
         *                  where a match needs to be inserted to preserve sorted order
         */
        int i = Arrays.binarySearch(new int[]{1, 2, 3}, 4);

        /**
         * A negative number means the first array is smaller than the second.
         * A zero means the arrays are equal.
         * A positive number means the first array is larger than the second.
         * Does not compile if compared types are different
         */
        int compare = Arrays.compare(new int[]{1}, new int[]{2});

        /**
         * If the arrays are equal, mismatch() returns -1.
         * Otherwise, it returns the first index where they differ.
         */
        int mismatch = Arrays.mismatch(new int[]{1}, new int[]{1, 2});

    }
}
