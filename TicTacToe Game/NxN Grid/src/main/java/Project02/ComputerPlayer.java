package Project1;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(char symbol) {
        super(symbol);
        random = new Random();
    }

    // Method that returns the specific column and row to make a move (randomly)
    @Override public int[] getMove(Board board) {
        int row, col;

        do {
            row = random.nextInt(board.sizeOfCell());
            col = random.nextInt(board.sizeOfCell());

        } while (!board.isCellEmpty(row, col)); 

        return new int[]{row, col};
    }
}

