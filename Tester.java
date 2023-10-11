import java.util.Scanner;

public class Tester{
     public static void main(String[] args){
      Board ten = new Board();
     Instruction a = new Instruction();
      Scanner scan = new Scanner(System.in);
      a.instruction();
          System.out.println("Fast/Regular Game?(F/R)");
      String gametype = scan.nextLine();
      if(gametype.equals("R")||gametype.equals("r")){
        ten.placeShip("Aircraft Carrier", 5);
        ten.placeShip("Battleship", 4);
        ten.placeShip("Cruiser", 3);
        ten.placeShip("Submarine", 2);
        ten.placeShip("Destroyer", 2);
        ten.guessSetup();
        do{
        ten.guessCoordinate();
		}
		while(!ten.shipsAnnihilated());
		System.out.println("Congratulations! You won the game! All ships have been annihilated!");
     }
     }
}	
