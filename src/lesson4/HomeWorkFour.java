package src.lesson4;

/**
 * Java1.HomeWorkFour
 *
 * @author Pavel.Stolyarov
 * @version 15.11.2021
 */
import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    static int SIZE = 3;
    static final char SIGN_X = 'x';
    static final char SIGN_O = 'o';
    static final char SIGN_EMPTY = '.';
    static char[][] table;
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        initTable();
        printTable();
        while (true) {
            humanTurn();
            printTable();
            if (checkWin(SIGN_X)) {
                System.out.println("Human WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW!");
                break;
            }
            aiTurn();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
    public static boolean checkWin(char ch) {
        int count_h;
        int count_v;
        for (int i = 0; i < SIZE; i++) {
            count_h = 0;
            count_v = 0;
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == ch) {
                    count_h++;
                }
                if (table[j][i] == ch) {
                    count_v++;
                }
            }
            if (count_h == SIZE || count_v == SIZE) {
                return true;
            }
        }
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }
    public static boolean isTableFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == SIGN_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("AI move " + (x + 1) + " " + (y + 1));
        table[y][x] = SIGN_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Print X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (table[y][x] == SIGN_EMPTY) return true;
        return false;
    }
    public static void initTable() {
        table = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }
    public static void printTable() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

