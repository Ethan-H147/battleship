import java.util.Scanner;

public class Instruction {
    Scanner scan = new Scanner(System.in);


    public void instruction(){
        System.out.println("Instructions:Basic Rules-B||Placement Rules-P||Gametypes-G||Skip-S");
        String i = scan.nextLine();
        switch(i){
            case "B":
                System.out.print("- First player has a fleet of ships and a board to place those ships.\n" + 
                        "- Second player will guess the coordinates of the opponent's ships.\n" + 
                        "- Coordinates are represented by two digit integers, the first digit is the row number and the second is column.\n" +
                        "- In a 10x10 board, numbers are labelled from 0 to 9, so the top left is 00 and the bottom right is 99.\n" +
                        "- A hit is recorded with an 'X' when a guess lands on a part of a ship.\n" + 
                        "- A miss is recorded with a 'O' when a guess lands on an empty cell.\n" + 
                        "- The game continues until the first player's fleet is completely destroyed.\n");
                for(int j=0;j<10;j++){
                    System.out.print(j+" ");
                }
                for (int r = 0; r < 10; r++){
                    System.out.print("\n");
                    for (int c = 0; c < 10; c++){
                        System.out.print("0 ");
                    }
                    System.out.print(r);
                }
                System.out.print("\n");
                instruction();
                break;
            case "P":
                System.out.print("- In a regular game, the first player will be prompted to place 5 ships on the 10x10 board.\n" + 
                        "- The ships are: Aircraft Carrier, Battleship, Cruiser, Submarine and Destroyer.\n" + 
                        "- For each ship, player 1 will choose a starting coordinate(found in basic rules).\n" +
                        "- Then, the player will be asked to choose the facing of the ship.\n" +
                        "- Ships cannot go out of the board or overlap with other ships.\n" + 
                        "- If the starting coordinate or facing will make the ship overlap or go out of bound, the player will be reprompted.\n" + 
                        "- This phase will only end when the player has placed all 5 ships.\n");
                        instruction();
            break;
            case "G":
            System.out.print("- There are two modes: Regular game and fast game.\n" + 
                        "- For regular game rules, please read 'Basic Rules'.\n" +
                        "- In a fast game, the computer will automatically place 3 ships.\n" +
                        "- The only player will guess the coordinates of the three ships.\n" +
                        "- The board with ships will not be shown.");
                        instruction();
            break;
            case "S":
            break;
        }
    }
}
