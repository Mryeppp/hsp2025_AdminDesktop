package Chapter10.Interface;

public class Computer {

    public void work(UsbInterface usbInterface){
            usbInterface.start();
            usbInterface.stop();
    }
}
