package cn.edu.javabasic.practice.MyInterface;

public class Laptop implements DeviceInterface{

    @Override
    public void powerOn() {
        System.out.println("laptop power on");
    }

    @Override
    public void powerOff() {
        System.out.println("laptop power off");
    }

    public void useUSBDevice(USBDeviceInterface de){
        de.show();
        if(de instanceof Mouse){
            de.powerOn();
            ((Mouse) de ).click();
            de.powerOff();
        }else if(de instanceof Keyboard){
            de.powerOn();
            ((Keyboard) de).tapping();
            de.powerOff();
        }else {
            System.out.println("error");
        }
    }
}
