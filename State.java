package angelesquivelstatemachineexam;

abstract class State {
    
    static State main, update, login, data, reports, printing,
            current, previous;
    
    abstract void enter();
    abstract void update();
    
}