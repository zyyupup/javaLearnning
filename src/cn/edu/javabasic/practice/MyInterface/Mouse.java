package cn.edu.javabasic.practice.MyInterface;

public class Mouse implements USBDeviceInterface {
    @Override
    public void powerOn() {
        System.out.println("Mouse power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Mouse power off");
    }
    public void click(){
        System.out.println("mouse click");
    }
}
