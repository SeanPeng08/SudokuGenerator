import java.util.Arrays;
import java.util.Random;

public class SudokuGenerator2 {

    private static final int GRID_SIZE = 9;
    
    public static void main(String[]args){
        int [][] GamingBoard = new int[9][9];

        for (int i = 0; i <= 8; i++) {
            for(int j=0; j<=8; j++){
                GamingBoard[i][j]=0;
            }
            
        }

        for(int a=0; a<=8; a++){
            while (true){
                int RandomRow =(int)(Math.random()*10-1);
                int RandomColumn = (int)(Math.random()*10-1);
                if (GamingBoard[RandomRow][RandomColumn]==0){
                    GamingBoard[RandomRow][RandomColumn]=a+1;
                    break;
                }
            }
        }
    
    if (solveBoard(GamingBoard)) {
        Random rand = new Random();
        int max =60;
        int min= 40;
        int result = rand.nextInt(max-min)+min;
        int HowManyNumbers = 81 - result;
        System.out.println(HowManyNumbers);

        for(int x = 0; x<= result-1; x++){
            while(true){
                int newRandomRow =(int)(Math.random()*10-1);
                int newRandomColumn = (int)(Math.random()*10-1);
                if (GamingBoard[newRandomRow][newRandomColumn]!=0){
                    GamingBoard[newRandomRow][newRandomColumn]=0;
                    break;
                }
            }
        }
    }
    else {
        
    }

    System.out.println(Arrays.deepToString(GamingBoard));
    }


        // Checking the rows

    private static boolean isNumberInRow(int[][] GamingBoard, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (GamingBoard[row][i] == number) {
                return true;
            }
        }
        return false;
    }
    
    // Checking the columns

    private static boolean isNumberInColumn(int[][] GamingBoard, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (GamingBoard[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // Checking the boxes

    private static boolean isNumberInBox(int[][] GamingBoard, int number, int row, int column) {
        int LocalBoxRow = row - row % 3;
        int LocalBoxColumn = column - column % 3;

        for (int i = LocalBoxRow; i < LocalBoxRow + 3; i++) {
            for (int j = LocalBoxColumn; j < LocalBoxColumn+3; j++) {
                if (GamingBoard[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // Final check

    private static boolean isValidPlaceement(int[][] GamingBoard, int number, int row, int column){
        return !isNumberInRow(GamingBoard, number, row) &&
            !isNumberInColumn(GamingBoard, number, column) &&
            !isNumberInBox(GamingBoard, number, row, column);
    }

    private static boolean solveBoard(int[][] GamingBoard) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++){
                if (GamingBoard[row][column] == 0){
                    for (int NumberToTry = 1; NumberToTry <= GRID_SIZE; NumberToTry++) {
                        if (isValidPlaceement(GamingBoard, NumberToTry, row, column)) {
                            GamingBoard[row][column] = NumberToTry;

                            if (solveBoard(GamingBoard)) {
                                return true;
                            }
                            else {
                                GamingBoard[row][column] = 0;
                            } 
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
}
