package ActivityConstructor;

public class Cars {

    private int speed;
    private int battery;
    private int batteryDrain;
    private int distanceDriven;
    private RaceTrack raceTrack;

    public Cars(int speed, int batteryDrain) {

        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.raceTrack = new RaceTrack();

    }

    public void Drive() {
        battery -= batteryDrain;
        distanceDriven += speed;
        System.out.println("distance left: " + totalDistanceDriven());
        System.out.println("battery left: " + battery);
        System.out.println("battery drained?: " + isBatteryDrained());

    }
    public int totalDistanceDriven() {

        int remainingDistance = raceTrack.getDistance() - distanceDriven;;
        return remainingDistance;
    }

    public boolean isBatteryDrained() {
        return battery <= 0;

    }


}
