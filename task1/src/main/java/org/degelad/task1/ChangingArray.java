package org.degelad.task1;

/**
 *
 * @author degelad
 */
public class ChangingArray {

    private int[] arrin;
    private int[] arrout;
    private int count = 0;
    private int j = 0;

    public ChangingArray(int... arrin) {
        this.arrin = arrin;
    }

    public int[] arrOutCompletion() {
        for (int i = arrin.length - 1; i >= 0; i--) {
            if (arrin[i] != 4) {
                count++;

            } else {
                break;
            }
        }
        arrout = new int[count];
        int a = (arrin.length - count);

        for (int i = a; i < arrin.length; i++) {

            arrout[j] = arrin[i];
            j++;
        }
        count = 0;
        for (int i = 0; i < arrin.length; i++) {
            if (4 != arrin[i]) {
                count++;
            }
        }
        if (arrin.length == count) {
            throw new RuntimeException();
        }
        return arrout;
    }

    public void ArrOutPrint() {
        for (int o : arrOutCompletion()) {
            System.out.print(o);
        }
        System.out.println("\n");
    }
}
