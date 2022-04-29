package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Data extends State {
    void enter(){
        System.out.println();
        System.out.println("Now in Data Entry");
        System.out.println("1. Reports.");
        System.out.println("2. Return to Main.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = reports;
                previous = data;
                return;
            case "2":
                current = main;
                previous = data;
                return;
            default:
                System.out.println("Please make a valid selection.");
        }
        }
    }
    
}
