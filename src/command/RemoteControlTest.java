package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        SimpleRemoteControl remoteLivingRoomOn = new SimpleRemoteControl();
        Light lightLivingRoom = new Light();
        LightOnCommand lightLivingRoomOn = new LightOnCommand(lightLivingRoom);

        remoteLivingRoomOn.setCommand(lightLivingRoomOn);
        remoteLivingRoomOn.buttonWasPressed();


        SimpleRemoteControl remoteLivingRoomOff = new SimpleRemoteControl();
        LightOnCommand lightLivingRoomOff = new LightOnCommand(lightLivingRoom);

        remoteLivingRoomOff.setCommand(lightLivingRoomOff);
        remoteLivingRoomOff.buttonWasPressed();



        SimpleRemoteControl remoteKitchenRoomOn = new SimpleRemoteControl();
        Light lightKitchenRoom = new Light();
        LightOnCommand lightKitchenRoomOn = new LightOnCommand(lightKitchenRoom);

        remoteKitchenRoomOn.setCommand(lightKitchenRoomOn);
        remoteKitchenRoomOn.buttonWasPressed();


        SimpleRemoteControl remoteKitchenRoomOff = new SimpleRemoteControl();
        LightOnCommand lightKitchenRoomOff = new LightOnCommand(lightKitchenRoom);

        remoteKitchenRoomOff.setCommand(lightKitchenRoomOff);
        remoteKitchenRoomOff.buttonWasPressed();



        CeilingFan lightKitchenRoom = new Light();
        LightOnCommand lightKitchenRoomOn = new LightOnCommand(lightKitchenRoom);

        remoteKitchenRoomOn.setCommand(lightKitchenRoomOn);
        remoteKitchenRoomOn.buttonWasPressed();
    }
}
