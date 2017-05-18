//package Array;
//
//import java.util.Arrays;
//
///**
// * Created by daniel on 5/18/17.
// */
//public class ArraysExample {
//
//    int[] prices = new int[10];
//    for(
//    int price :prices)
//
//    {
//        System.out.println(price);
//    }
//    Arrays.fill(prices,5);
//    for(
//    int price:prices)
//
//    {
//        System.out.println(price);
//    }
//
//    int[] threeNumbers = {1, 2, 3};
//    int[] sameThreeNumbers = {1, 2, 3};
//
//    // are these two variables the same? (do they point to the same memory address?)
//    System.out.println(threeNumbers == sameThreeNumbers);
//    // do these 2 arrays have the same content and are the elements in the same order?
//    System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers));
//    // string.equals(another)
//
//    int[] thirdCopy = Arrays.copyOf(threeNumbers, threeNumbers.length);
//
//    System.out.println(Arrays.toString(thirdCopy));
//
//    int[] moreNumbers = {2, 56, 7, 34, 20, 45, 67};
//
//    int index = Arrays.binarySearch(moreNumbers, 34);
//    System.out.println("34 is the index " + index);
//}
