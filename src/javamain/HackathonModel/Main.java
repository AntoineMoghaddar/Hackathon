package javamain.HackathonModel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    private Integer[][] board;

    public void run() {
        board = new Integer[64][64];
        makeModel();
        modelprint();
    }

    public void makeModel() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
    }

    /* Value descriptions
     *   -1 = obstacle
     *   0 = not explored
     *   1 = Current position
     *   2 = optimal path
     *   3 = next node
     *   9 = End note
     */
    public void modelprint() {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
