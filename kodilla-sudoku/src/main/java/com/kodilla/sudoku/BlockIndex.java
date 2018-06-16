package com.kodilla.sudoku;

public class BlockIndex {

    private final static int ZERO = 0;
    private final static int FIRST = 3;
    private final static int SECOND = 6;
    private final static int LAST = 9;

    private int find(int i, int first, int second, int last) {
        if (i < FIRST) {
            return first;
        } else if (i < SECOND) {
            return second;
        } else {
            return last;
        }
    }

    public int findBlockMaxIndex(int i){
        return find(i, FIRST, SECOND, LAST);
    }

    public int findBlockMinIndex(int i){
        return find(i, ZERO, FIRST, SECOND);
    }
}
