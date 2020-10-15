package command;

public class KitchenRoomOffCommand implements Command {
    Light light;

    public KitchenRoomOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
