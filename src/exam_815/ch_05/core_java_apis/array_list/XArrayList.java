package exam_815.ch_05.core_java_apis.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XArrayList {
    public static void main(String[] args) {

        // default initial capacity is 10, if not specified
        List<String> list = new ArrayList<>();

        // type of var is ArrayList<Object>
        var objects = new ArrayList<>();

        boolean add = list.add("1"); // always returns true
        list.add(1, "2"); // void


        boolean remove = list.remove("1");  // boolean remove(Object object)
//        String remove1 = list.remove(0);  // E remove(int index)

        String set = list.set(0, "3");// E set(int index, E newElement)

        boolean empty = list.isEmpty();
        int size = list.size();

        list.clear(); // void

        boolean contains = list.contains("1"); // boolean contains(Object object)

        /**
         * ArrayList has a custom implementation of equals(),so you can
         * compare two lists to see whether they contain the same elements in the
         * same order.
         */

        // converting list to array
        Object[] objects1 = list.toArray(); // defaults to an array of Object
        String[] strings = list.toArray(new String[0]); // specifies the type

        // converting array to list - several ways
        // not guaranteed to get java.util.ArrayList from either

        /*
        option 1: create a List that is linked to the original array.
        When a change is made to one, it is available in the other. It is a fixed-size list and
        is also known as a backed List because the array changes with it.
        Changing size of list is not allowed (exception is thrown).
         */
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> fixedList = Arrays.asList(array); // returns fixed size list
        fixedList.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
//        fixedList.remove(1); // throws UnsupportedOperationException
//        fixedList.add("2"); // throws UnsupportedOperationException

        /*
        option 2: create an immutable List.
        Values or size of the List cannot be changed.
        Changes in original array will not be reflected in the immutable List.
         */
        String[] array2 = { "hawk", "robin" }; // [hawk, robin]
        List<String> immutableList = List.of(array2); // returns an immutable list
        array2[0] = "new"; // array2 = [new, robin], immutableList = [hawk, robin]
        list.set(1, "test"); // throws UnsupportedOperationException

    }
}

