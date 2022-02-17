package org.degelad.task1;

/**
 *
 * @author degelad
 */
public class App {

    public static void main(String[] args) {
        ChangingArray arr1 = new ChangingArray(1, 2, 4, 4, 2, 3, 4, 1, 7);
//        ChangingArray arr1 = new ChangingArray(1, 2, 4, 1, 7, 5, 3, 2);
//        ChangingArray arr1 = new ChangingArray(1, 2, 4);
//        ChangingArray arr1 = new ChangingArray(1, 2, 5, 6);
        arr1.ArrOutPrint();

        OneAndFour arr2 = new OneAndFour(1, 1, 1, 4, 4, 1, 4, 4);
//        OneAndFour arr2 = new OneAndFour(1, 1, 1, 1, 1, 1);
//        OneAndFour arr2 = new OneAndFour(4, 4, 4, 4);
//        OneAndFour arr2 = new OneAndFour(1, 4, 4, 1, 1, 4, 3);
//        OneAndFour arr2 = new OneAndFour(14, 41, 11, 44);
        arr2.resultOneAndFour();
    }

}
