public class tictactoe8 {
    

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                // human move logic here
            } else {
                System.out.println("Computer's turn");
                // computer move logic here
            }

            // Placeholder for win/draw check
            gameOver = true;   // remove this in later UC

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }
    }
}
