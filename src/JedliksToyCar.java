public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return "Battery " + (((this.battery > 0)) ? "at " + this.battery + "%" : "Empty");

    }

    public void drive() {
        this.distance += 20;
        if(this.battery > 0){
            this.battery -=1;
        }else{
            this.battery = 0;
        }

    }
}