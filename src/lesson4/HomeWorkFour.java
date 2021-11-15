package src.lesson4;

/**
 * Java1.HomeWorkFour
 *
 * @author Pavel.Stolyarov
 * @version 14.11.2021
 */
import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    static int SIZE = 3;
    static int SIGN_TO_WIN = 3;
    static final char SIGN_X = 'x';
    static final char SIGN_O = 'o';
    static final char SIGN_EMPTY = '.';
    static char[][] table;
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    static void main(String[] args) {
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
    public static boolean checkWin(char symb) {
        if(table[0][0] == symb && table[0][1] == symb && table[0][2] == symb) return true;
        if(table[1][0] == symb && table[1][1] == symb && table[1][2] == symb) return true;
        if (table[2][0] == symb && table[2][1] == symb && table[2][2] == symb) return true;
        if (table[0][0] == symb && table[1][0] == symb && table[2][0] == symb) return true;
        if (table[0][1] == symb && table[1][1] == symb && table[2][1] == symb) return true;
        if (table[0][2] == symb && table[1][2] == symb && table[2][2] == symb) return true;
        if (table[0][0] == symb && table[1][1] == symb && table[2][2] == symb) return true;
        if (table[2][0] == symb && table[1][1] == symb && table[0][2] == symb) return true;
        return false;
    }
    public static boolean isTableFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == SIGN_TO_WIN) return false;
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
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        table[y][x] = SIGN_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
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

