public class StandardCharging implements ChargingStrategy {
    public int charge(int currentCharge, int consumeCharge) {
        return Math.min(currentCharge + consumeCharge, 100);
    }
}