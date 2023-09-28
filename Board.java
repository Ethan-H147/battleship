import java.util.Scanner;

public class Board {
    private int row = 10;
    private int column = 10;
    int[] ships = new int[5];

    int [][] game = new int[row][column];



public void printBoard(){
    Scanner scan = new Scanner(System.in);
    int co;
    for(int i = 0; i < 5; i++){
    co = scan.nextInt() - 1;
    game[(int)(co/10-1)][co%10] = 3;
    }
    
    for (int r = 0; r <= column-1; r++){
        System.out.print("\n");
        for (int c = 0; c <= row-1; c++){
    System.out.print(game[r][c]);
    }
}
}
}