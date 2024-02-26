package classWork;

public class IronOnCommand implements Command {

    private Iron iron;

    public IronOnCommand(Iron iron) {
        this.iron = iron;
    }

    @Override
    public void execute() {
    	iron.on();
    }

}
