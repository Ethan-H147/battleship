import java.util.Scanner;

public class Board {//the class for regular game, SmallBoard is a simplified version of this
     Scanner scan = new Scanner(System.in);
    private int row = 10;//set the size of the board
    private int column = 10;
    //int[] ships = new int[5]; this is useless although I keeped it, ships are not considered an entity in the code

    int [][] game = new int[row][column];
    char [][] guess = new char[row][column];
    int x;  
    int y;
    //initializing 2d arrays and coordinates

//place ship, this is a simplified version, for each ship I just need to call this with different size and name
    public void placeShip(String shipType, int shipSize){
        int coordinate;//initializing the coordinate for the ship in a two digit integer
        System.out.println("\n"+shipType+" (Place your coordinate)");
    
        do{
        coordinate = scan.nextInt();
        x = (int)(coordinate/10);
        y = coordinate%10;
        if(isOutofbound(x,y)||isOccupied(x,y)){
            System.out.print("Invalid coordinate, try again.");
        }
    }
    while(isOutofbound(x,y)||isOccupied(x,y));//short circuit calculation
    
    game[x][y] = shipSize;

    int facing;
	boolean facingValid;//here even if you make it true later in the do while loop there still need to be a switch, otherwise it can't switch back

    do {
        facingValid = true;//I made a mistake here, I initially had this statement outside the do while loop, so if the first
        System.out.println("East(1),North(2),West(3),South(4)");//time it become false, it won't change back, so I have to set the value
        facing = scan.nextInt();                                  //in the loop
        for (int i = 1; i < shipSize; i++) {
            //do a check for the facing selected, if the ship is overlapping or out of bound it will label the facing as invalid and will prompt the user again
            switch (facing) {
                case 1: 
                    if (isOutofbound(x,y+i) || isOccupied(x,y+i)) {
                        facingValid = false;//switch the boolean so it go back and prompt again
                    }
                    break;
                case 2:
                    if (isOutofbound(x-i,y) || isOccupied(x-i,y)) {
                        facingValid = false;
                    }
                    break;
                case 3:
                    if (isOutofbound(x,y -i) || isOccupied(x,y-i)) {
                        facingValid = false;
                    }
                    break;
                case 4:
                    if (isOutofbound(x+i,y) || isOccupied(x+i,y)) {
                        facingValid = false;
                    }
                    break;
            }
            if (!facingValid) {
                System.out.println("Invalid facing, try again.");
                break;
            }
        }
    } while (!facingValid);//repeat until the player gets a valid facing
        
    
    for(int i=1; i<shipSize; i++){//place the entire ship after proven valid
            switch(facing){
            case 1: 
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

    //I made this just to set up the board, if I put it in the guessCoordinate method it will reset the whole board every time the player guesses
    public void guessSetup() {
		for (int r = 0; r < row; r++){ 
            for (int c = 0; c < column; c++){
                guess[r][c]='0';
            }
        }
	}

    //the same format as the coordinates in placeShips, if the position on the ship board is not 0, then it's a hit, and the cell on guessing board will become x
    public void guessCoordinate() {
        System.out.println("\nEnter your guess");
        int coordinate;
        do{
        coordinate = scan.nextInt();
        x = coordinate / 10;
        y = coordinate % 10;
        }
        while(isOutofbound(x,y));
	    if (game[x][y] != 0) {//the corresponding position on the board with ships, if it's not 0 then it's a hit
               System.out.println("Hit!");
                guess[x][y] = 'X';
            } 
		else {// if not 0 will become O
                System.out.println("Miss!");
				guess[x][y] = 'O';
            }
        printBoard2();
    }


    //this method is to check if the game's over, if for any non zero cell on the ship board,
    // the corresponding position on the guessing board is not X, that means the games is not over yet
    public boolean shipsAnnihilated() {
    boolean shipsAnnihilated = true;
    for (int r = 0; r < row; r++) {
        for (int c = 0; c < column; c++) {
            if (game[r][c] != 0 && guess[r][c] != 'X') {
                shipsAnnihilated = false;
                return shipsAnnihilated;  // early exit if there's an unmarked hit
            }
        }
    }
    return shipsAnnihilated;
    }

    //if the cell is not 0 it's occupied
    private boolean isOccupied(int x, int y){
        return (game[x][y]!=0);
    } 

    //if x or y goes out it's out of bound
    private boolean isOutofbound(int x, int y){
        
        return (x<0||x>9||y<0||y>9);
    } 
   
    //print the 10x10 board with ships using two for loops
    public void printBoard(){
        for (int r = 0; r <= column-1; r++){
            System.out.print("\n");
            for (int c = 0; c <= row-1; c++){
                System.out.print(game[r][c]+" ");
            }
        }
    }

    //same thing except print the guessing board instead of the ship board
    public void printBoard2(){
        for (int r = 0; r <= column-1; r++){
            System.out.print("\n");
            for (int c = 0; c <= row-1; c++){
                System.out.print(guess[r][c]+" ");
            }
        }
    }
}
