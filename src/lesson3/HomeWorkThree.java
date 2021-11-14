package src.lesson3; /**
 * Java1.src.lesson3.HomeWorkThree
 *
 * @author  Pavel
 * @version 14.11.2020
 */

import java.util.Arrays;
import java.util.Random;

public class HomeWorkThree {

    public static void main(String[] args) {

        ReplaceNumbers();
        EmptyMassive();
        MultiplyByTwo();
        Square();
        generateArrayBySize(5, 10);
        minMaxValue();
    }
    // Task 1
    static void ReplaceNumbers() {
        int[] arrOne = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arrOne));
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = arrOne[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arrOne));
    }
    // Task 2
    static void EmptyMassive() {
        int[] arrTwo = new int[100];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrTwo));
    }
    // Task 3
    static void MultiplyByTwo() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] <= 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }
    // Task 4
    static void Square() {
        int[][] arrFour = new int[4][4];
        int u;
        for (int i = 0; i < arrFour.length; i++) {
            arrFour[i][i] = 1;
            /*
            i = 0
            a[0][3] = 1
            i = 1
            a[1][2] = 1
            i = 2
            a[2][1] = 1
            i = 3
            a[3][0] = 1
             */
            u = (arrFour.length - 1) - i;
            arrFour[i][u] = 1;
        }
        for (int i = 0; i < arrFour.length; i++) {
            System.out.println(Arrays.toString(arrFour[i]));
        }
    }
    // Task 5
    static int[] generateArrayBySize(int len, int initialValue) {
        int[] arrFive = new int[len];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrFive));
        return arrFive;
    }
    // Task 6*
    static void minMaxValue() {
        Random rnd = new Random();
        int[] arrSix = new int[10];
        for (int i = 0; i < arrSix.length; i++)
            arrSix[i] = rnd.nextInt(100);
        System.out.println(Arrays.toString(arrSix));

        int minValue = arrSix[0];
        for (int i = 1; i < arrSix.length; i++) {
            if (arrSix[i] < minValue) {
                minValue = arrSix[i];
            }
        }
        int maxValue = arrSix[0];
        for (int i = 1; i < arrSix.length; i++) {
            if (arrSix[i] > maxValue) {
                maxValue = arrSix[i];
            }
        }
        System.out.println("Min value:" + minValue + ", Max value:" + maxValue);
    }
}