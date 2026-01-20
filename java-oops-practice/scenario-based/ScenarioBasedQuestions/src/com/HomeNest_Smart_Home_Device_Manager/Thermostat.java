package HomeNest_Smart_Home_Device_Manager;
class Thermostat extends Device {

    public Thermostat(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Temperature reset to 24°C");
    }
}
