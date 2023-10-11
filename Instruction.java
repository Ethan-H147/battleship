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
                break;
            case "P":
            break;
            case "G":
            break;
            case "S":
            break;
        }
    }
}
