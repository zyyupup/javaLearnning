package cn.edu.javabasic.practice.MyInterface;

public interface USBDeviceInterface  extends DeviceInterface{
    public default void show(){
        System.out.println("USB device");
    }
}
