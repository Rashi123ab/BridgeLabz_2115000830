class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
     int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
 
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }
}
class SmartHome{
    public static void main(String[] args) {
        Device genericDevice = new Device("D001", "On");
        Thermostat smartThermostat = new Thermostat("T001", "Active", 22);

        genericDevice.displayStatus();
        smartThermostat.displayStatus();
    }
}
