package Chapter10.Interface;

public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("相机在工作");
    }
    @Override
    public void stop(){
        System.out.println("相机停止工作");
    }
}
