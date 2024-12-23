package Project02;
import Project1.Game;

import Project1.Player;

public class UpgradedGame extends Game {
    private NewBoard board;
    private int winRequirement;

    public UpgradedGame(int size, int winRequirement, Player player1, Player player2) {
        super(player1, player2, size);
        this.board = new NewBoard(size, winRequirement);
    }
    
    // Game flow - playing game logic
    @Override public void playGame() {
        Player currentPlayer = player1;

        while (true) {
            board.display();

            if (currentPlayer == player1){
                System.out.println("Player 1 " + "(" + currentPlayer.getSymbol() + ")" + " turn!");
            }
            else{
                System.out.println("Player 2 " + "(" + currentPlayer.getSymbol() + ")" + " turn!");
            }

            int[] move = currentPlayer.getMove(board);
            board.placeSymbol(move[0], move[1], currentPlayer.getSymbol());

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.display();
                if (currentPlayer == player1){
                    System.out.println("Player 1 " + "(" + currentPlayer.getSymbol() + ")" + " Wins!");
                }
                else{
                    System.out.println("Player 2 " + "(" + currentPlayer.getSymbol() + ")" + " Wins!");
                }
                break;
            }

            // Checks if board is full - for draw
            if (board.isFull()) {
                board.display();
                System.out.println("It's a draw!");
                break;
            }

            if (currentPlayer == player1){
                currentPlayer = player2;
            }
            else{
                currentPlayer = player1;
            }
        }
    }
}
