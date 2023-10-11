import java.util.Scanner;
public class SmallBoard {
    Scanner scan = new Scanner(System.in);
    private int row = 8;//set the size of the board
    private int column = 8;

    int [][] game = new int[row][column];
    char [][] guess = new char[row][column];
    
    int x;  
    int y;

    public void placeShip(String shipType, int shipSize){//place ship, this is a simplified version, 
        //for each ship I just need to call this with different size and name
        System.out.println("\n"+shipType);
        
        do{
        x = (int)8*Math.random();
        y = (int)8*Math.random();
        }
        while(isOutofbound(x,y)||isOccupied(x,y));
        
        game[x][y] = shipSize;
    
        int facing;
        boolean facingValid;
    
        do {
            facingValid = true;
            facing = (int)5*Math.random();                            
            for (int i = 1; i < shipSize; i++) {
                switch (facing) {
                    case 1:
                        if (isOutofbound(x,y+i) || isOccupied(x,y+i)) {
                            facingValid = false;
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
                    break;
                }
            }
        } while (!facingValid);//repeat until gets a valid facing
        
     
            for(int i=1; i<shipSize; i++){//now the facing is proven to be valid, it will just go on to place the whole ship
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




        public void guessSetup() {//copy pasted from regular, set up the guessing board
		for (int r = 0; r < row; r++){ 
            for (int c = 0; c < column; c++){
                guess[r][c]='0';
            }
        }
	}

    public void guessCoordinate() {//also copy pasted from regular, exact same thing
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

    public void printBoard(){//print the 8x8 board with ships,only for testing
            for (int r = 0; r <= column-1; r++){
                System.out.print("\n");
                for (int c = 0; c <= row-1; c++){
                    System.out.print(game[r][c]+" ");
                }
            }
    }

    public void printBoard2(){//exact same thing except print guess instead of game
            for (int r = 0; r <= column-1; r++){
                System.out.print("\n");
                for (int c = 0; c <= row-1; c++){
                    System.out.print(guess[r][c]+" ");
                }
            }
    }
}