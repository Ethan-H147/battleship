import java.util.Scanner;

public class Board {
    private int row = 10;
    private int column = 10;
    int[] ships = new int[5];

    int [][] game = new int[row][column];



public void placeShip(String shipType, int shipSize){
    Scanner scan = new Scanner(System.in);
    int coordinate;//initializing the coordinate for the ship in a two digit integer
    System.out.println("\n"+shipType);
    coordinate = scan.nextInt();
    int x =coordinate%10;
    int y =(int)(coordinate/10);
    if(isOccupied(x,y)){
        System.out.print("Invalid coordinate, try again.");
    }
    game[x][y] = shipSize;

    System.out.println("East(1),North(2),West(3),South(4)");
    int facing = scan.nextInt();
    if(facing == 1){
        for(int i=1; i<shipSize; i++){
            game[x][y+i] = shipSize;
        }
    }
        else if(facing == 2){
            for(int i=1; i<shipSize; i++){
                game[x-i][y] = shipSize;
            }
        }
        else if(facing == 3){
            for(int i=1; i<shipSize; i++){
                game[x][y-i] = shipSize;
            }
        }
        else if(facing == 4){
            for(int i=1; i<shipSize; i++){
                game[x+i][y] = shipSize;
            }
        }
printBoard();
    }
   
   
private boolean isOccupied(int x, int y){
    return game[x][y]!=0;
} 
   
 public void printBoard(){
    for (int r = 0; r <= column-1; r++){
        System.out.print("\n");
        for (int c = 0; c <= row-1; c++){
    System.out.print(game[r][c]+" ");
    }
}
}
}
