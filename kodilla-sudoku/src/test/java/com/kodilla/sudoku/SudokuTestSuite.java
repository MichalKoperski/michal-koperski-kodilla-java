package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SudokuTestSuite {
    public final static int MAX_INDEX = 9;
    public final static int MIN_INDEX = 0;
    public final static int EMPTY = -1;


    @Test
    public void testBoardDeepCopy() {

        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("413518719");

        SudokuBoard deepClonedBoard = null;
        try {
            deepClonedBoard = sudokuBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        sudokuBoard.getBoard().get(0).getElement(0).setNumbers(new ArrayList<>(sudokuBoard.getBoard().get(0).getElement(0).getNumbers().remove(0)));
        sudokuBoard.getBoard().get(0).getElement(0).setNumber(8);

        int number = sudokuBoard.getBoard().get(1).getElement(1).getNumber();
        int clonedNumber = deepClonedBoard.getBoard().get(1).getElement(1).getNumber();
        List<Integer> numbers = sudokuBoard.getBoard().get(1).getElement(1).getNumbers();
        List<Integer> clonedNumbers = deepClonedBoard.getBoard().get(1).getElement(1).getNumbers();

        int numberChanged = sudokuBoard.getBoard().get(0).getElement(0).getNumber();
        int clonedNumberChanged = deepClonedBoard.getBoard().get(0).getElement(0).getNumber();
        List<Integer> numbersChanged = sudokuBoard.getBoard().get(0).getElement(0).getNumbers();
        List<Integer> clonedNumbersChanged = deepClonedBoard.getBoard().get(0).getElement(0).getNumbers();

        Assert.assertEquals(number, clonedNumber);
        Assert.assertEquals(numbers, clonedNumbers);
        Assert.assertNotEquals(numberChanged, clonedNumberChanged);
        Assert.assertNotEquals(numbersChanged, clonedNumbersChanged);

        SudokuBoard deepClonedBoard2 = null;
        try {
            deepClonedBoard2 = sudokuBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        for (int n = MIN_INDEX; n < MAX_INDEX; n++) {
            for (int m = MIN_INDEX; m < MAX_INDEX; m++) {
                int number2 = sudokuBoard.getBoard().get(n).getElement(m).getNumber();
                int clonedNumber2 = deepClonedBoard2.getBoard().get(n).getElement(m).getNumber();
                List<Integer> numbers2 = sudokuBoard.getBoard().get(n).getElement(m).getNumbers();
                List<Integer> clonedNumbers2 = deepClonedBoard2.getBoard().get(n).getElement(m).getNumbers();
                Assert.assertEquals(number2, clonedNumber2);
                Assert.assertEquals(numbers2, clonedNumbers2);
            }
        }
    }

    @Test
    public void testSudokuBoardBuilder() {
        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard board = sudokuBoardBuilder.build("111122133144155166177188199");
        int count = 0;
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.getBoard().get(row).getElement(col).getNumber() != EMPTY) {
                    count++;
                }
            }
        }
        int number = board.getBoard().get(0).getElement(0).getNumber();

        Assert.assertEquals(9, count);
        Assert.assertEquals(1, number);
    }

    @Test
    public void testValidateIfDivisibleByThree() {
        String input1 = "112923";
        String input2 = "11292";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateIfDivisibleByThree());
        Assert.assertFalse(inputValidator2.validateIfDivisibleByThree());
    }

    @Test
    public void testValidateIfCorrectRange(){
        String input1 = "112923";
        String input2 = "110292";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateIfCorrectRange());
        Assert.assertFalse(inputValidator2.validateIfCorrectRange());
    }

    @Test
    public void testValidateDistinctNumbersInARow() {
        String input1 = "112923";
        String input2 = "112119";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateDistinctNumbersInARow());
        Assert.assertFalse(inputValidator2.validateDistinctNumbersInARow());
    }

    @Test
    public void testValidateDistinctNumbersInAColumn() {
        String input1 = "112923";
        String input2 = "112192";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateDistinctNumbersInAColumn());
        Assert.assertFalse(inputValidator2.validateDistinctNumbersInAColumn());
    }

    @Test
    public void testValidateDistinctNumbersInABlock() {
        String input1 = "112923";
        String input2 = "112133";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateDistinctNumbersInABlock());
        Assert.assertFalse(inputValidator2.validateDistinctNumbersInABlock());
    }

    @Test
    public void testValidateInput() {
        String input1 = "112923";
        String input2 = "1121341191252";
        InputValidator inputValidator1 = new InputValidator(input1);
        InputValidator inputValidator2 = new InputValidator(input2);

        Assert.assertTrue(inputValidator1.validateInput());
        Assert.assertFalse(inputValidator2.validateInput());
    }

    @Test
    public void testFindBlockMinIndex() {
        BlockIndex blockIndex = new BlockIndex();

        int min1 = blockIndex.findBlockMinIndex(1);
        int min2 = blockIndex.findBlockMinIndex(4);
        int min3 = blockIndex.findBlockMinIndex(7);

        Assert.assertEquals(0, min1);
        Assert.assertEquals(3, min2);
        Assert.assertEquals(6, min3);
    }

    @Test
    public void testFindBlockMaxIndex() {
        BlockIndex blockIndex = new BlockIndex();

        int max1 = blockIndex.findBlockMaxIndex(1);
        int max2 = blockIndex.findBlockMaxIndex(4);
        int max3 = blockIndex.findBlockMaxIndex(7);

        Assert.assertEquals(3, max1);
        Assert.assertEquals(6, max2);
        Assert.assertEquals(9, max3);
    }

    @Test
    public void testAddBoard() {
        BoardStack boardStack = new BoardStack();
        SudokuBoard sudokuBoard = new SudokuBoard();

        boardStack.addBoard(sudokuBoard);

        Assert.assertEquals(1, boardStack.getBoardStack().size());
    }

    @Test
    public void testFindFirstEmpty() {
        FirstEmpty firstEmpty = new FirstEmpty();
        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("111");

        int row = firstEmpty.findRow(sudokuBoard);
        int column = firstEmpty.findColumn(sudokuBoard);

        Assert.assertEquals(0, row);
        Assert.assertEquals(1, column);

    }


    @Test
    public void testFindInsertedNumbersInRowColumnBlock() {

        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("521614715917422731151361281");
        InsertedNumbersFinder insertedNumbersFinder = new InsertedNumbersFinder(sudokuBoard);

        List<Integer> numbersInRow = insertedNumbersFinder.findInARow(0);
        List<Integer> numbersInColumn = insertedNumbersFinder.findInAColumn(0);
        List<Integer> numbersInBlock = insertedNumbersFinder.findInABlock(0,0);
        List<Integer> numbersInRowColumnBlock = insertedNumbersFinder.findNumbers(0,0);

        Assert.assertEquals(3, numbersInRow.size());
        Assert.assertEquals(5, numbersInColumn.size());
        Assert.assertEquals(3, numbersInBlock.size());
        Assert.assertEquals(8, numbersInRowColumnBlock.size());
    }

    @Test
    public void testSudokuSolver() {
        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("414517619427328632534138343545948451753857961865766267772173576686592196499");
        SudokuSolver sudokuSolver = new SudokuSolver();
        SudokuDto sudokuDto = sudokuSolver.solve(sudokuBoard);

        SudokuBoard solvedSudokuBoard = sudokuDto.getBoard();
        int count = sudokuDto.getCount();
        boolean isSolution = sudokuDto.isSolution();


        SudokuBoard completeSudokuBoard = sudokuBoardBuilder.build("111312213414715916517818619521922823124625226427328729731632433534335836937138239641842343244545446747948149451252753" +
                "954155356857658559961162563664865766267468369871772173374475576677278979381482983784285686187588889291592693894995196397798499");

        compareNumbersInBoards(solvedSudokuBoard, completeSudokuBoard);

        Assert.assertEquals(81, count);
        Assert.assertTrue(isSolution);
    }

    @Test
    public void testSudokuRunnerWhenMoreThan1000Solutions() {
        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("211512316918119321923727228133636337645846349152455661363568171372273778");
        SudokuRunner sudokuRunner = new SudokuRunner();
        BoardStack boardStack = sudokuRunner.run(sudokuBoard);

        SudokuBoard solvedSudokuBoard = boardStack.getBoardStack().pop();
        System.out.println(solvedSudokuBoard);

        SudokuBoard completeSudokuBoard = sudokuBoardBuilder.build("21151281341471531661791811932162292382412552672722842943173213323493563633783853994124274354464584644714834985115255335445595625" +
                "7658759661462363164265766967568869171372273974575476877778679581882683784385286187488989791992493694895196597398299");

        compareNumbersInBoards(solvedSudokuBoard, completeSudokuBoard);
        Assert.assertEquals(1000, boardStack.getBoardStack().size());
    }

    @Test
    public void testSudokuRunnerWhenLessThan1000Solutions() {
        SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();
        SudokuBoard sudokuBoard = sudokuBoardBuilder.build("213414817722225438643955758459466168969871574377681884787589392193694");
        SudokuRunner sudokuRunner = new SudokuRunner();
        BoardStack boardStack = sudokuRunner.run(sudokuBoard);

        SudokuBoard solvedSudokuBoard = boardStack.getBoardStack().peek();
        SudokuBoard completeSudokuBoard = sudokuBoardBuilder.build("911612213414115516817318719321722423924225826127528629131832533734635336937438239441942643144545746247848349251152853354" +
                "955656557758459761562363264865466667168969871272773574475976377678179681482983884385186787288589591392193694795296497998899");

        compareNumbersInBoards(solvedSudokuBoard, completeSudokuBoard);
        Assert.assertEquals(1, boardStack.getBoardStack().size());
    }


    private void compareNumbersInBoards(SudokuBoard solvedSudokuBoard, SudokuBoard completeSudokuBoard) {
        for (int n = MIN_INDEX; n < MAX_INDEX; n++) {
            for (int m = MIN_INDEX; m < MAX_INDEX; m++) {
                int actualNumber = solvedSudokuBoard.getBoard().get(n).getElement(m).getNumber();
                int expectedNumber = completeSudokuBoard.getBoard().get(n).getElement(m).getNumber();
                Assert.assertEquals(expectedNumber, actualNumber);
            }
        }
    }

}
