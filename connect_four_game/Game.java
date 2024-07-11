import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        player1 = new Player("Player 1", 'R');
        player2 = new Player("Player 2", 'Y');
        currentPlayer = player1;
    }

    public void start() {
        boolean gameWon = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameWon && !board.isFull()) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getDisc() + ")");
            System.out.print("Choose a column (0-6): ");
            int col = scanner.nextInt();

            if (col < 0 || col >= 7) {
                System.out.println("Invalid column. Try again.");
                continue;
            }

            if (!board.dropDisc(col, currentPlayer.getDisc())) {
                System.out.println("Column is full. Try again.");
                continue;
            }

            gameWon = board.checkForWin(currentPlayer.getDisc());
            if (gameWon) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        if (board.isFull() && !gameWon) {
            board.printBoard();
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}
