package angelesquivelstatemachineexam;


public class AngelEsquivelStateMachineExam {


    public static void main(String[] args) {
        
        State.login = new Login();
        State.main = new Main();
        State.update = new Update();
        State.data = new Data();
        State.reports = new Reports();
        State.printing = new Printing();
        State.current = State.login;
        
        while(true){
            State.current.enter();
            State.current.update();
        }
        
    }
    
}
