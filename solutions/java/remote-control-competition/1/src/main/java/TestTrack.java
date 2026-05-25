import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
//        throw new UnsupportedOperationException("Please implement the (static) TestTrack.race() method");
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sorted = new ArrayList<>(cars);
        Collections.sort(sorted);
        return sorted;


    }
}

