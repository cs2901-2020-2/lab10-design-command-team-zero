package command;

public class RemoteControl {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);

    CeilingFan ceilingFan = new CeilingFan();
    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
}
