package HomeNest_Smart_Home_Device_Manager;
class Device implements IControllable {

    protected int deviceId;
    private boolean status;     // encapsulated
    protected double energyUsage;

    private String firmwareLog = "Firmware Updated Successfully"; // secured log

    // Constructor
    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println("Device " + deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println("Device " + deviceId + " turned OFF");
    }

    public double calculateEnergy(int hours) {
        return energyUsage * hours; // operator usage
    }

    public void showFirmwareLog() {
        System.out.println(firmwareLog);
    }

    @Override
    public void reset() {
        System.out.println("Device reset to default");
    }
}
