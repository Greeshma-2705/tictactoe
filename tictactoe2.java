import java.util.Random;

public class tictactoe2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Toss logic
    static void tossAndAssignSymbols() {
        Random random = new Random();

        // 0 or 1 randomly
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first with symbol: " + humanSymbol);
            System.out.println("Computer gets symbol: " + computerSymbol);
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first with symbol: " + computerSymbol);
            System.out.println("Human gets symbol: " + humanSymbol);
        }
    }
}
