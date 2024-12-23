package Project02;
import Project1.ComputerPlayer;
import Project1.HumanPlayer;
import Project1.Player;
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

        System.out.println("Select Size of Board (3<=N<=20): ");
        int size = scanner.nextInt();

        System.out.println("Select Winning Conditions (M markers in a row): ");
        int winRequirement = scanner.nextInt();
        
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

        UpgradedGame game = new UpgradedGame(size, winRequirement, player1, player2);
        game.playGame();
        scanner.close();
    }
}
