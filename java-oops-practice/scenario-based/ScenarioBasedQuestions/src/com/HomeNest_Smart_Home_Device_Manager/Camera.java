package HomeNest_Smart_Home_Device_Manager;
class Camera extends Device {

    public Camera(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Camera angle reset");
    }
}
