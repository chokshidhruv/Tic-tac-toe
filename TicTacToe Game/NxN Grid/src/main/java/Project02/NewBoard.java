package Project02;
import Project1.Board;

public class NewBoard extends Board {
    private int winRequirement; // Number of markers needed to win (M)

    public NewBoard(int size, int winRequirement) {
        super(size); // Call the original constructor
        this.winRequirement = winRequirement;

        // Initialize the board to be empty
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    @Override public boolean checkWin(char symbol) {
        // Check rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - winRequirement; j++) {
                boolean win = true;
                for (int k = 0; k < winRequirement; k++) {
                    if (grid[i][j + k] != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win){
                    return true;
                }
            }
        }

        // Check columns
        for (int i = 0; i <= size - winRequirement; i++) {
            for (int j = 0; j < size; j++) {
                boolean win = true;
                for (int k = 0; k < winRequirement; k++) {
                    if (grid[i + k][j] != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win){
                    return true;
                }            
            }
        }

        // Check diagonals (first way)
        for (int i = 0; i <= size - winRequirement; i++) {
            for (int j = 0; j <= size - winRequirement; j++) {
                boolean win = true;
                for (int k = 0; k < winRequirement; k++) {
                    if (grid[i + k][j + k] != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win){
                    return true;
                }                
            }
        }

        // Check diagonals (second way)
        for (int i = 0; i <= size - winRequirement; i++) {
            for (int j = winRequirement - 1; j < size; j++) {
                boolean win = true;
                for (int k = 0; k < winRequirement; k++) {
                    if (grid[i + k][j - k] != symbol) {
                        win = false;
                        break;
                    }
                }
                if (win){
                    return true;
                }    
            }
        }

        return false;
    }

}
