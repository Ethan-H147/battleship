import java.util.Scanner;

public class Tester{
     public static void main(String[] args){
      System.out.println("Fast/Regular Game?(F/R)");
      Board ten = new Board();
      Scanner scan = new Scanner(System.in);
      String gametype = scan.nextLine();
      if(gametype.equals("R")||gametype.equals("r"))
        ten.placeShip();
     }
}