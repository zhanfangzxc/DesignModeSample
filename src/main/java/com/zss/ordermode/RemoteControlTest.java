package com.zss.ordermode;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        control.setCommand(lightOnCommand);
        control.onButtonWasPushed(1);
        Door door = new Door();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);
//        control.setCommand(doorOpenCommand);
//        control.buttonWasPressed();
    }
}
