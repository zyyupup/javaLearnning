package cn.edu.javabasic.practice.MyInterface;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<USBDeviceInterface> deviceList = new ArrayList<>();
        deviceList.add(new Mouse());
        deviceList.add(new Keyboard());
        Laptop laptop = new Laptop();
        for (USBDeviceInterface usbDeviceInterface : deviceList) {
            laptop.useUSBDevice(usbDeviceInterface);
        }
    }
}
