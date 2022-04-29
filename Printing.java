package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Printing extends State {
    void enter(){
        System.out.println();
        System.out.println("Now in Printing");
        System.out.println("1. Printing Finished.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = reports;
                previous = printing;
                return;
            default:
                System.out.println("Please make a valid selection");
        }
        }
    }
    
}
