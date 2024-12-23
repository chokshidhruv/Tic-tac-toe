package Project1;

public class Game {
    public Board board;
    public Player player1;
    public Player player2;

    public Game(Player player1, Player player2, int size) {
        this.board = new Board(size);
        this.player1 = player1;
        this.player2 = player2;
    }

    // Game flow - playing game logic
    public void playGame() {
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

            // Checks for draw if board is full
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