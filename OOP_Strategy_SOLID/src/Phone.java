public class Phone {
    private String model;
    private int batteryChargeLevel;
    private PowerStatus powerStatus;
    private String phoneNumber;
    private ChargingStrategy chargingStrategy;

    public void setChargingStrategy(ChargingStrategy chargingStrategy) {
        this.chargingStrategy = chargingStrategy;
    }

    public Phone(String model, int batteryChargeLevel, PowerStatus powerStatus, String phoneNumber, ChargingStrategy chargingStrategy) {
        this.model = model;
        this.batteryChargeLevel = batteryChargeLevel;
        this.powerStatus = powerStatus;
        this.phoneNumber = phoneNumber;
        if (chargingStrategy == null) {
            this.chargingStrategy = new StandardCharging();
        } else {
            this.chargingStrategy = chargingStrategy;
        }
    }

    public void consumeBatteryLevel(int amount) {
        if (this.batteryChargeLevel - amount <= 100 && this.batteryChargeLevel - amount > 0 && powerStatus == PowerStatus.ON) {
            this.batteryChargeLevel -= amount;
        } else if (powerStatus == PowerStatus.OFF) {
            System.out.println("The charge level cannot decrease");
        } else if (this.batteryChargeLevel - amount <= 0) {
            this.batteryChargeLevel = 0;
            this.powerStatus = PowerStatus.OFF;
        } else {
            System.out.println("Battery can not be less than 0 or more than 100");
        }
    }

    public void chargeBatteryLevel(int amount) {
        this.batteryChargeLevel = chargingStrategy.charge(this.batteryChargeLevel, amount);
    }

    public int getBatteryChargeLevel() {
        return batteryChargeLevel;
    }

    public PowerStatus getPowerStatus() {
        return powerStatus;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", batteryChargeLevel=" + batteryChargeLevel +
                ", powerStatus=" + powerStatus +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", chargingStrategy=" + chargingStrategy +
                '}';
    }
}