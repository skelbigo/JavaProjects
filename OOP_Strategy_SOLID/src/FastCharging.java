public class FastCharging implements ChargingStrategy{
    public int charge(int currentCharge, int consumeCharge) {
        return Math.min(currentCharge + (consumeCharge * 2), 100);
    }
}