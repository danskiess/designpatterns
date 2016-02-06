package fi.daniel;

//Invoker
public class GamerGuru {

    //Could save commands to a list and undo them.
    private Command command;

    public void tellXboxGamerWhatToDo(Command command){
        this.command = command;
        command.execute();
    }
}
