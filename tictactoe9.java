public class tictactoe9 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println(hasWon('X'));
    }

    static boolean hasWon(char symbol) {

        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol &&
                board[1][col] == symbol &&
                board[2][col] == symbol) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

}
