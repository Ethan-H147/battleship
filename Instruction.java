import java.util.Scanner;

public class Instruction {
    Scanner scan = new Scanner(System.in);
    public void instruction(){
        System.out.println("Do you know the rules?(y/n)");
        String yes = scan.nextLine();
        if(yes.equals("y")||yes.equals("Y")){
        }
        else if(yes.equals("n")||yes.equals("N")){
            System.out.println("Do you know the rules?(y/n)");
        }
        
    }
}
