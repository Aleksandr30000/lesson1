package lesson8;

import java.util.Random;
import java.util.Scanner;

public class Logic {
    static int size;
    static int dots_to_win;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static boolean finishedGame;

    static Random random = new Random();

    public static void go() {
        finishedGame = true;
        if (checkWinLines(DOT_X, dots_to_win)) {
            System.out.println("Вы победитель!");
            return;
        }
        if (isFull()) {
            System.out.println("Ничья!");
            return;
        }

        aiTurn();
        if (checkWinLines(DOT_O, dots_to_win)) {
            System.out.println("Комьютер победил!");
            return;
        }
        if (isFull()) {
            System.out.println("Ничья!");
            return;
        }

        finishedGame = false;
    }


    static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void humanTurn(int x, int y) {
        if(isCellValid(y, x)){
            map[y][x] = DOT_X;
            go();
        }
    }

    public static void aiTurn() {
        int x;
        int y;

        // Попытка победить самому
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWinLines(DOT_O, dots_to_win)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
// Сбить победную линии противника, если осталось 1 ход для победы
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, dots_to_win)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// Сбить победную линии противника, если осталось 2 хода для победы
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, dots_to_win - 1) &&
                            Math.random() < 0.5) { //  фактор случайности, чтобы сбивал не все время первый попавшийся путь.
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// Сходить в произвольную не занятую ячейку

        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= size || y >= size) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot, int dotsToWin) {
        if (cx + vx * (dotsToWin - 1) > size - 1 || cy + vy * (dotsToWin - 1) > size - 1 ||
                cy + vy * (dotsToWin - 1) < 0) {
            return false;
        }

        for (int i = 0; i < dotsToWin; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }

    static boolean checkWinLines(char dot, int dotsToWin) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (checkLine(i, j, 0, 1, dot, dotsToWin) ||
                        checkLine(i, j, 1, 0, dot, dotsToWin) ||
                        checkLine(i, j, 1, 1, dot, dotsToWin) ||
                        checkLine(i, j, -1, 1, dot, dotsToWin)) {
                    return true;
                }
            }
        }
        return false;
    }
}
