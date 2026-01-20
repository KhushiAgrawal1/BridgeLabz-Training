package HomeNest_Smart_Home_Device_Manager;
class Lock extends Device {

    public Lock(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Lock reset to secured mode");
    }
}

