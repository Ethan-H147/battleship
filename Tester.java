import java.util.Scanner;

//the main part of the game, carrying out the basic game logic, and the choice of fast and regular is made here
public class Tester{
    //main, the core of the program
     public static void main(String[] args){
      Board ten = new Board();
      SmallBoard eight = new SmallBoard();
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
        do{//continue to prompt the user for guesses until all ships are annihilated
        ten.guessCoordinate();
		}
		while(!ten.shipsAnnihilated());
		System.out.println("Congratulations! You won the game! All ships have been annihilated!");
     }
     if(gametype.equals("F")||gametype.equals("f")){
        eight.placeShip("Aircraft Carrier", 5);
        eight.placeShip("Battleship", 4);
        eight.placeShip("Cruiser", 3);
        eight.guessSetup();
        do{
        eight.guessCoordinate();
		}
		while(!eight.shipsAnnihilated());
		System.out.println("Congratulations! You won the game! All ships have been annihilated!");
     }
     }
}	
