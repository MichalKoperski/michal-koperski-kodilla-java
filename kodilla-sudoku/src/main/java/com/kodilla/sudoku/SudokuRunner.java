package com.kodilla.sudoku;

public class SudokuRunner {
    private static SudokuSolver sudokuSolver = new SudokuSolver();
    private static FirstEmpty firstEmpty = new FirstEmpty();

    public BoardStack run(SudokuBoard board) {
        BoardStack solvedBoardStack = new BoardStack();
        BoardStack tempBoardStack = new BoardStack();
        BoardStack backtrack = new BoardStack();
        if(sudokuSolver.solve(board).isSolution()) {
            if(sudokuSolver.solve(board).getCount() == 81) {
                solvedBoardStack.addBoard(sudokuSolver.solve(board).getBoard());
                return solvedBoardStack;
            } else {
                board = sudokuSolver.solve(board).getBoard();
                tempBoardStack.addBoard(board);

                do {
                    board = tempBoardStack.getBoardStack().pop();
                    int n = firstEmpty.findRow(board);
                    int m = firstEmpty.findColumn(board);
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        backtrack.addBoard(board);
                    }
                    for (int i = 0; i < board.getBoard().get(n).getElement(m).getNumbers().size(); i++) {
                        board.getBoard().get(n).getElement(m).setNumber(board.getBoard().get(n).getElement(m).getNumbers().get(i));
                        if (sudokuSolver.solve(board).isSolution()) {
                            sudokuSolver.solve(board);
                            if (sudokuSolver.solve(board).getCount() == 81) {
                                solvedBoardStack.addBoard(board);
                                if(solvedBoardStack.getBoardStack().size() > 1000){
                                    return solvedBoardStack;
                                }
                            } else {
                                tempBoardStack.addBoard(board);
                            }
                        }
                        board = backtrack.getBoardStack().pop();

                    }
                }while(tempBoardStack.getBoardStack().size()>0);
            }
        } else {
            System.out.println("Twoje Sudoku nie ma poprawnego rozwiazania.\n");
        }

        return solvedBoardStack;
    }
}
