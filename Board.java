import java.util.Scanner;

public class Board {
    private int row = 10;
    private int column = 10;
    int[] ships = new int[5];

    int [][] game = new int[row][column];



public void placeShip(String shipType, int shipSize){
    Scanner scan = new Scanner(System.in);
    int coordinate;//initializing the coordinate for the ship in a two digit integer
    System.out.println(shipType);
    coordinate = scan.nextInt();
    int x =coordinate%10;
    int y =(int)(coordinate/10);
    game[x][y] = 5;
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

    /*int BS;
    System.out.println("\nBattleship");
    BS = scan.nextInt();
    x =BS%10;
    y =(int)(BS/10);
    game[x][y] = 4;
    System.out.println("East(1),North(2),West(3),South(4)");
    facing = scan.nextInt();
    if(facing == 1){
            for(int i=1; i<4; i++){
                game[x][y+i] = 4;
            }
    }
        else if(facing == 2){
            for(int i=1; i<4; i++){
                game[x-i][y] = 4;
            }
    }
        else if(facing == 3){
            for(int i=1; i<4; i++){
                game[x][y-i] = 4;
            }
        }
        else if(facing == 4){
            for(int i=1; i<4; i++){
                game[x+i][y] = 4;
            }
        }
    printBoard();


    int CR;
    System.out.println("\nCruiser");
    CR = scan.nextInt();
    x =CR%10;
    y =(int)(CR/10);
    game[x][y] = 3;
    System.out.println("East(1),North(2),West(3),South(4)");
    facing = scan.nextInt();
    if(facing == 1){
            for(int i=1; i<3; i++){
                game[x][y+i] = 3;
            }
    }
    else if(facing == 2){
            for(int i=1; i<3; i++){
                game[x-i][y] = 3;
            }
    }
    else if(facing == 3){
            for(int i=1; i<3; i++){
                game[x][y-i] = 3;
            }
    }
    else if(facing == 4){
            for(int i=1; i<3; i++){
                game[x+i][y] = 3;
            }
    }
        printBoard();
    
        int SM;
    System.out.println("\nSubmarine");
    SM = scan.nextInt();
    x =SM%10;
    y =(int)(SM/10);
    game[x][y] = 2;
    System.out.println("East(1),North(2),West(3),South(4)");
    facing = scan.nextInt();
    if(facing == 1){
        for(int i=1; i<2; i++){
            game[x][y+i] = 2;
        }
    }
        else if(facing == 2){
            for(int i=1; i<2; i++){
                game[x-i][y] = 2;
        }
        }
        else if(facing == 3){
            for(int i=1; i<2; i++){
                    game[x][y-i] = 2;
            }
        }
        else if(facing == 4){
            for(int i=1; i<2; i++){
                game[x+i][y] = 2;
            }
        }
        printBoard();

    int DT;
    System.out.println("\nDestroyer");
    DT = scan.nextInt();
    x = DT%10;
    y =(int)(DT/10);
    game[x][y] = 2;
    System.out.println("East(1),North(2),West(3),South(4)");
    facing = scan.nextInt();
    if(facing == 1){
            for(int i=1; i<2; i++){
                game[x][y+i] = 2;
            }
    }
        else if(facing == 2){
            for(int i=1; i<2; i++){
                game[x-i][y] = 2;
            }
        }
        else if(facing == 3){
        for(int i=1; i<2; i++){
                game[x][y-i] = 2;
        }
        }
        else if(facing == 4){
            for(int i=1; i<2; i++){
                game[x+i][y] = 2;
            }
        }
    printBoard();
*/
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
