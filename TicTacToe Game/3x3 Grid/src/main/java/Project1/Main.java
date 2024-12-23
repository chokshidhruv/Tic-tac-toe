package Project1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Choose game mode:");
        System.out.println("1. Human vs Computer");
        System.out.println("2. Human vs Human");
        System.out.println("3. Computer vs Computer");

        int choice = scanner.nextInt();

        Player player1;
        Player player2;

        if (choice == 1) {
            player1 = new HumanPlayer('X');
            player2 = new ComputerPlayer('O');
        } 
        else if (choice == 2) {
            player1 = new HumanPlayer('X');
            player2 = new HumanPlayer('O');
        }
        else{
            player1 = new ComputerPlayer('X');
            player2 = new ComputerPlayer('O');
        }

        Game game = new Game(player1, player2, 3);
        game.playGame();
        scanner.close();
    }
}
