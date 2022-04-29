package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Reports extends State{
    void enter(){
        System.out.println();
        System.out.println("Now in Reports");
        System.out.println("1. Print Reports.");
        System.out.println("2. Data Entry.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = printing;
                previous = reports;
                return;
            case "2":
                current = data;
                previous = reports;
                return;
            default:
                System.out.println("Please make a valid selection");
        }
        }
    }
    
}
