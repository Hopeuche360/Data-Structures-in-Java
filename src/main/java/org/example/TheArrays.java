package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[2] = "grey";
        colors[1] = "red";

        for (String color : colors) {
            System.out.println(color);
        }

//        Arrays.stream(colors).forEach(System.out::println);

        // Two-dimensional arrays
        char[][] board = new char[3][3];
        board[0][0] = '-';
        board[1][1] = '-';
        board[2][2] = '-';

//        Arrays.stream(board).forEach(System.out::println);
        System.out.println(Arrays.deepToString(board)); //use deepToString to access 2d

        char[][] boardTwo = new char[][] {
                new char[] {'0', '1', 'x'},
                new char[] {'0', '0', 'x'},
                new char[] {'0', '1', '-'}
        };

        Arrays.stream(boardTwo).forEach(System.out::println);
        System.out.println(Arrays.deepToString(boardTwo));


    }
}
