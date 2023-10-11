import java.util.Scanner;

public class Tester{
     public static void main(String[] args){
     Instruction a = new Instruction();
      System.out.println("Fast/Regular Game?(F/R)");
      Board ten = new Board();
      Scanner scan = new Scanner(System.in);
      String gametype = scan.nextLine();
      if(gametype.equals("R")||gametype.equals("r")){
        ten.placeShip("Aircraft Carrier", 5);
        ten.placeShip("Battleship", 4);
        ten.placeShip("Cruiser", 3);
        ten.placeShip("Submarine", 2);
        ten.placeShip("Destroyer", 2);
     }
     }
}