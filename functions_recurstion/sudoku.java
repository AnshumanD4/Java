public class sudoku {
static int[][] board = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};

    static boolean canIPlace(int row, int col, int value){
        //check if the value in the row and col are not appearing
        // start the loop for 1 to 9
        for(int i = 0; i < board.length ; i++){
            if(board[row][i] == value){
                return false;

            }
        }
        for(int i = 0; i < board.length; i++){
            if(board[col][i == value]){
                return false;
            }
        }
        //check in subgrid
        int startRow = row - row%3;
        int endRow = row - row%3;

    }
    boolean solveSudoku(int row, int col, int value){
        //if cell is not empty
        if(col == board.length){
            //move to next row and set col 0
            row += 1;
            col = 0; 
        }
        //if row reach to end
        if(row == board.length){
            return true;
        }
        if(board[row][col] != 0){
            solveSudoku(row,col+1,value)
        }
        //If Cell is Empty fill b/w 1 to 9
        //Check if the number is present in column
        for(int i = 1; i <= 9; i++){
            if(canIPlace(row , col , i)){
                board[row][col] = i;
                boolean result = solveSudoku(row, col+1, value);
                if(result){
                    return result;
                }
                board[row][col] = 0;
            }
        }
         
    }

    public static void main(String[] args) {
        booolean result = solve
    }
}
