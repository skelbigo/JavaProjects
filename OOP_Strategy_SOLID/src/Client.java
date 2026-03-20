import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> installApps = new ArrayList<>(Arrays.asList("Telegram", "Maps"));
        Smartphone smartphone = new Smartphone("iPhone 14", 15, PowerStatus.ON,
                "+380992345946", new StandardCharging(), installApps, 128.0, 80);
        System.out.println(smartphone);
        System.out.println("Charge by 20 (Standard)");
        smartphone.chargeBatteryLevel(20);
        System.out.println("Charge: " + smartphone.getBatteryChargeLevel() + "%");

        System.out.println("Install a fun game (30 ГБ)");
        smartphone.installApps("FunGame", 30);
        System.out.println("Available memory: " + smartphone.getAmountOfFreeMemory() + " ГБ");

        System.out.println("We use up 80% of the charge");
        smartphone.consumeBatteryLevel(80);
        System.out.println("Charge" + smartphone.getBatteryChargeLevel() + "%");
        System.out.println("Power status" + smartphone.getPowerStatus());

        System.out.println("Discharge a powered-off phone");
        smartphone.consumeBatteryLevel(10);

        System.out.println("I want to charge my phone to 500%");
        smartphone.chargeBatteryLevel(500);
        System.out.println("Charge" + smartphone.getBatteryChargeLevel() + "%");

        System.out.println(smartphone);
    }
}