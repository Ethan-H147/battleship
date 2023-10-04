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
    int x;
    int y;
    do{
    coordinate = scan.nextInt();
    x = coordinate%10;
    y = (int)(coordinate/10);
    System.out.println(x+y);
        if(isOccupied(x,y)||isOutofbound(x,y)){
        System.out.print("Invalid coordinate, try again.");
    }
    }
    while(isOccupied(x,y)||isOutofbound(x,y));
    

    //game[x][y] = shipSize;

    System.out.println("East(1),North(2),West(3),South(4)");
    int facing = scan.nextInt();
        for(int i=1; i<shipSize; i++){
            switch(facing){
            case 1: 
            //if(isOutofbound(x, y+i)||isOccupied(x, y+i))
            game[x][y+i] = shipSize;
            break;
            case 2:
            game[x-i][y] = shipSize;
            break;
            case 3:
            game[x][y-i] = shipSize;
            break;
            case 4:
            game[x+i][y] = shipSize;
            break;
            }
        }
        printBoard();
    }
    
    
   
   
    private boolean isOccupied(int x, int y){
        return (game[x][y]!=0);
    } 

    private boolean isOutofbound(int x, int y){
        
        return (x<0||x>9||y<0||y>9);
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
