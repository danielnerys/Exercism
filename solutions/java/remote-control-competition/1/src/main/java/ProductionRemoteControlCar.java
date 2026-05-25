class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance = 0;
    private int vicotories= 0;
    public void drive() {
//        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.drive() method")
//        ;
        this.distance +=10;
    }

    public int getDistanceTravelled() {
//        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getDistanceTravelled() method");
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.vicotories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.vicotories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if(this.getNumberOfVictories() < o.getNumberOfVictories()){
            return 1;
        }else if(this.getNumberOfVictories() > o.getNumberOfVictories()){
            return -1;
        }else{
            return 0;
        }
    }
}
