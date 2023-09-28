public class Board {
    int row = 10;
    int column = 10;
    int[] ships = new int[5];

    int[][] game = new int[row][column];



public void printBoard(){
    for (int r = 0; r <= column; r++){
        for (int c = 0; c <= row; c++){
    System.out.print(game[r][c]);
    }
}
System.out.print("\n");
}
}