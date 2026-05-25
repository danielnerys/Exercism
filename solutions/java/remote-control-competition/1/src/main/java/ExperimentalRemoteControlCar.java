public class ExperimentalRemoteControlCar implements RemoteControlCar  {
    private int distance;

    public void drive() {
//        throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.drive() method");
        this.distance +=20;
    }


    public int getDistanceTravelled() {
//        throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
        return this.distance;
    }
}
