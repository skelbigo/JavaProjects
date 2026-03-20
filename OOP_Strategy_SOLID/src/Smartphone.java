import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Phone {
    private List<String> listOfInstalledApps;
    private double amountOfFreeMemory;
    private int screenBrightness;

    public Smartphone(String model, int batteryChargeLevel, PowerStatus powerStatus, String phoneNumber,
                      ChargingStrategy chargingStrategy, List<String> listOfInstalledApps, double amountOfFreeMemory,
                      int screenBrightness) {
        super(model, batteryChargeLevel, powerStatus, phoneNumber, chargingStrategy);
        this.listOfInstalledApps = new ArrayList<>(listOfInstalledApps);
        this.amountOfFreeMemory = amountOfFreeMemory;
        this.screenBrightness = screenBrightness;
    }

    public void uninstallApps(String app, double appSize) {
        if (listOfInstalledApps.remove(app)) {
            this.amountOfFreeMemory += appSize;
        }
    }

    public void installApps(String appName, double appSize) {
        if (this.amountOfFreeMemory >= appSize) {
            this.listOfInstalledApps.add(appName);
            this.amountOfFreeMemory -= appSize;
        } else {
            System.out.println("Amount of free memory = 0");
        }
    }

    public double getAmountOfFreeMemory() {
        return amountOfFreeMemory;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone{" +
                "listOfInstalledApps=" + listOfInstalledApps +
                ", amountOfFreeMemory=" + amountOfFreeMemory +
                ", screenBrightness=" + screenBrightness +
                '}';
    }
}