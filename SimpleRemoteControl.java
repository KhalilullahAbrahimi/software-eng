package classWork;

public class SimpleRemoteControl {
	private Command[] commands;

    public SimpleRemoteControl(Command[] commands) {
        this.commands = commands;
    }

    public void pressButton(int slot) {
        if (slot < commands.length) {
            commands[slot].execute();
        } else {
            System.out.println("Invalid slot number");
        }
    }

}
