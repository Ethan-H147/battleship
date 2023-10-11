import java.util.Scanner;

public class Board {
     Scanner scan = new Scanner(System.in);
    private int row = 10;//set the size of the board
    private int column = 10;
    //int[] ships = new int[5]; this is useless although I keeped it, ships are not considered an entity in the code

    int [][] game = new int[row][column];
    int x;  
    int y;
    //initializing 2d arrays and coordinates

public void placeShip(String shipType, int shipSize){//place ship, this is a simplified version, 
    //for each ship I just need to call this with different size and name
    int coordinate;//initializing the coordinate for the ship in a two digit integer
    System.out.println("\n"+shipType);
    
    do{
    coordinate = scan.nextInt();
    x = (int)(coordinate/10);
    y = coordinate%10;
        if(isOutofbound(x,y)||isOccupied(x,y)){
        System.out.print("Invalid coordinate, try again.");
    }
    }
    while(isOutofbound(x,y)||isOccupied(x,y));
    

    game[x][y] = shipSize;

    System.out.println("East(1),North(2),West(3),South(4)");
    int facing = scan.nextInt();
        for(int i=1; i<shipSize; i++){
            switch(facing){
            case 1: 
            if(isOutofbound(x, y+i)||isOccupied(x, y+i))//short circuit calculation
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
    
    
   
   
    private boolean isOccupied(int x, int y){//if the cell is not 0 it's occupied
        return (game[x][y]!=0);
    } 

    private boolean isOutofbound(int x, int y){//if x or y goes out it's out of bound
        
        return (x<0||x>9||y<0||y>9);
    } 
   
    public void printBoard(){//print the 10x10 board with ships using two for loops
        for (int r = 0; r <= column-1; r++){
            System.out.print("\n");
            for (int c = 0; c <= row-1; c++){
                System.out.print(game[r][c]+" ");
            }
        }
    }
}
