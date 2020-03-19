package structural.bridge;

import structural.bridge.device.Device;
import structural.bridge.device.Radio;
import structural.bridge.device.Tv;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

public class DemoBridge {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
