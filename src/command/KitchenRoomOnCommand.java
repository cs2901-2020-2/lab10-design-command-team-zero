package command;

public class KitchenRoomOnCommand implements Command {
    Light light;

    public KitchenRoomOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
