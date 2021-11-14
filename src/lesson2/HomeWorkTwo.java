package src.lesson2;

/**
 * Java1.src.lesson2.HomeWorkTwo
 *
 * @author  Pavel
 * @version 12.11.2020
 */
public class HomeWorkTwo {

    public static void main(String[] args) {
        System.out.println(checkTwoNum(5, 15));
        System.out.println(checkTwoNum(10, 15));
        System.out.println(checkTwoNum(1, -15));

        checkPositiveNum(0);
        checkPositiveNum(5);
        checkPositiveNum(-5);

        System.out.println(checkNegativeNum(0));
        System.out.println(checkNegativeNum(10));
        System.out.println(checkNegativeNum(-10));

        printWord("Test", 5);

        System.out.println(checkYear(2020));
    }
    static boolean checkTwoNum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }
    static void checkPositiveNum(int a) { // можно сделать тернарный оператор
            System.out.println("a " + (a >= 0? "is positive" : "is negative"));
    }
    static boolean checkNegativeNum(int a) {
        return (a < 0);
    }
    static void printWord(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    static boolean checkYear(int a) {
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
}