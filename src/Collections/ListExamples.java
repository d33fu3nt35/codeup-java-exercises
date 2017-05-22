package Collections;

import java.util.ArrayList;

/**
 * Created by daniel on 5/22/17.
 */
public class ListExamples {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Daniel");
        list.add(1);

        System.out.println(list.size());

        // Generics
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Zach");
        for(String string : strings) {
            System.out.println(string);
        }

        //Boxing -> Wrapper Classes for Primitive Types
        // int -> Integer
        // double -> Double
        // float -> Float
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(45);
        integers.add(59);
        for(Integer number : integers) {
            System.out.println(number);
        }

        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Object element : list) {
            System.out.println(element);
        }


    }
}
