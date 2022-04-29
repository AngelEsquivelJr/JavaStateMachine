package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Main extends State{
     void enter(){
        System.out.println();
        System.out.println("Login Successful");
        System.out.println("1. Reports.");
        System.out.println("2. Update Software.");
        System.out.println("3. Data Entry.");
        System.out.println("4. Exit.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = reports;
                previous = main;
                return;
            case "2":
                current = update;
                previous = main;
                return;
            case "3":
                current = data;
                previous = main;
                return;
            case "4":
                System.exit(0);
                return;
            default:
                System.out.println("Please make a valid selection.");
        }
        }
    }
    
}
