package command;

public class LivingRoomOnCommand implements Command {
    Light light;

    public LivingRoomOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
