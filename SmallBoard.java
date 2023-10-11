import java.util.Scanner;
public class SmallBoard {
    Scanner scan = new Scanner(System.in);
    private int row = 8;//set the size of the board
    private int column = 8;

    int [][] game = new int[row][column];
    char [][] guess = new char[row][column];
    
    int x;  
    int y;

    public void printBoard(){//print the 8x8 board with ships,only for testing
            for (int r = 0; r <= column-1; r++){
                System.out.print("\n");
                for (int c = 0; c <= row-1; c++){
                    System.out.print(game[r][c]+" ");
                }
            }
    }
}