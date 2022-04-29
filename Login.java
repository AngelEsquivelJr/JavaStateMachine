package angelesquivelstatemachineexam;

import java.util.Scanner;

public class Login extends State{
        void enter(){
        System.out.println();
        System.out.println("Now in Login Menu");
        System.out.println("1. Login.");
        System.out.println("2. Update Software.");
        System.out.println("3. Exit.");

    }
    
    void update(){
        while(true){ 
        Scanner s = new Scanner(System.in);
        String input  = s.next();
        
        switch(input){
            
            case "1":
                current = main;
                previous = login;
                return;
            case "2":
                current = update;
                previous = login;
                return;
            case "3":
                System.exit(0);
                return;
            default:
                System.out.println("Please make a valid selection.");
        }
        }
    }
    
}
