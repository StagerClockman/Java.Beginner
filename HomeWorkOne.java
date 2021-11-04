public class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 69;
        int b = -96;
        int c = a + b;
        if (c > 0) {
            System.out.println("c = " + c + " The sum is positive");
        }
        if (c < 0) {
            System.out.println("c = " + c + " The sum is negative");
        }
        if (c == 0) {
            System.out.println("c = " + c + " The sum is zero");
        }
    }
    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("RED");
        }
        if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        }
        if (value > 100) {
            System.out.println("GREEN");
        }
    }
    static void compareNumbers() {
        int a = 25;
        int b = 25;
        System.out.println("a " + (a >= b? ">= b" : "< b"));
    }
}
