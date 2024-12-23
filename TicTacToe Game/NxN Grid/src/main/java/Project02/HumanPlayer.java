package Project1;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(char symbol) {
        super(symbol);
        scanner = new Scanner(System.in);
    }

    // Method that returns the specific column and row to make a move
    @Override public int[] getMove(Board board) {
        int row, col;
        while (true) {
            try {
                System.out.println("Enter row (1-" + board.sizeOfCell() + "): ");
                row = scanner.nextInt() - 1;
                System.out.println("Enter column (1-" + board.sizeOfCell() + "): ");
                col = scanner.nextInt() - 1;

                if (row >= 0 && row < board.sizeOfCell() && col >= 0 && col < board.sizeOfCell()) {
                    if (board.isCellEmpty(row, col)) {
                        return new int[]{row, col};
                    } else {
                        System.out.println("Cell is already occupied. Choose a different cell.");
                    }
                } else {
                    System.out.println("Invalid input. Row and column must be between 1 and " + board.sizeOfCell() + ".");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers between 1 and " + board.sizeOfCell() + ".");
                scanner.nextLine();
            }
        }
    }
}
