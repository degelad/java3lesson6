package org.degelad.task1;

/**
 *
 * @author degelad
 */
public class OneAndFour {

    private boolean has1 = false;
    private boolean has4 = false;
    private int[] arr;

    public OneAndFour(int... arr) {
        this.arr = arr;
    }

    public boolean getOneAndFour() {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                has1 = true;
            }
            if (arr[i] == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }

    public void resultOneAndFour() {
        System.out.println("результат задачи 2 " + getOneAndFour());
    }
}
