package org.degelad.task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author degelad
 */
public class TestApp {

    @Test
    public void testArrOutCompletion1() {
        ChangingArray arr1 = new ChangingArray(1, 2, 4, 4, 2, 3, 4, 1, 7);
        int[] arr2 = new int[]{1, 7};
        Assertions.assertArrayEquals(arr2, arr1.arrOutCompletion());
    }

    @Test
    public void testArrOutCompletion2() {
        ChangingArray arr1 = new ChangingArray(1, 2, 4, 1, 7, 5, 3, 2);
        int[] arr2 = new int[]{1, 7, 5, 3, 2};
        Assertions.assertArrayEquals(arr2, arr1.arrOutCompletion());
    }

    @Test
    public void testArrOutCompletion3() {
        ChangingArray arr1 = new ChangingArray(1, 2, 4);
        int[] arr2 = new int[]{};
        Assertions.assertArrayEquals(arr2, arr1.arrOutCompletion());
    }

    @Test
    public void testArrOutCompletion4() {
        ChangingArray arr1 = new ChangingArray(1, 2, 5, 6);
        Assertions.assertThrows(RuntimeException.class, () -> {
            arr1.arrOutCompletion();
        });
    }

    @Test
    public void testgetOneAndFour1() {
        OneAndFour arr2 = new OneAndFour(1, 1, 1, 4, 4, 1, 4, 4);
        Assertions.assertTrue(arr2.getOneAndFour());
    }

    @Test
    public void testgetOneAndFour2() {
        OneAndFour arr2 = new OneAndFour(1, 1, 1, 1, 1, 1);
        Assertions.assertFalse(arr2.getOneAndFour());
    }

    @Test
    public void testgetOneAndFour3() {
        OneAndFour arr2 = new OneAndFour(4, 4, 4, 4);
        Assertions.assertFalse(arr2.getOneAndFour());
    }

    @Test
    public void testgetOneAndFour4() {
        OneAndFour arr2 = new OneAndFour(1, 4, 4, 1, 1, 4, 3);
        Assertions.assertFalse(arr2.getOneAndFour());
    }

    @Test
    public void testgetOneAndFour5() {
        OneAndFour arr2 = new OneAndFour(14, 41, 11, 44);
        Assertions.assertFalse(arr2.getOneAndFour());
    }
}
