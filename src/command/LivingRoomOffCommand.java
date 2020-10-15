package command;

public class LivingRoomOffCommand implements Command {
    Light light;

    public LivingRoomOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
