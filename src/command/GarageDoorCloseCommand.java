package command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
