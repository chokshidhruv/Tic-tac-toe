package Project1;

public abstract class Player {
    public char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    //Abstract class to be used by subclasses to change the Player logic based on Human vs Computer player
    public abstract int[] getMove(Board board);
}
