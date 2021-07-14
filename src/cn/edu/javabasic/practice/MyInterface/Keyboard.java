package cn.edu.javabasic.practice.MyInterface;

public class Keyboard implements USBDeviceInterface {
    @Override
    public void powerOn() {
        System.out.println("Keyboard power on");
    }

    @Override
    public void powerOff() {
        System.out.println("keyboard power off");
    }
    public void tapping(){
        System.out.println("keyboard tapping");
    }
}
