package HomeNest_Smart_Home_Device_Manager;
class Light extends Device {

    public Light(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Light brightness reset to default");
    }
}
