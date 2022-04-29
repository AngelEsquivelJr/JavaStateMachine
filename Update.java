package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Update extends State {
    void enter(){
        System.out.println();
        System.out.println("Software Updating");
        System.out.println("1. Update Complete.");
        System.out.println("2. Exit.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = previous;
                previous = update;
                return;
            case "2":
                System.exit(0);
                return;
            default:
                System.out.println("Please make a valid selection");
        }
        }
    }
    
}
