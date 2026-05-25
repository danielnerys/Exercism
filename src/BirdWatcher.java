class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        if (numberOfDays >= birdsPerDay.length) {
            for (int j : birdsPerDay) {
                total += j;
            }
        }
        else{
            for (int i = 0; i < numberOfDays; i++) {
                total += birdsPerDay[i];
            }
        }
        return total;
    }


    public int getBusyDays() {
        int busy = 0;
        for(int j: birdsPerDay){
            if(j >= 5){
                busy+=1;
            }
        }
        return busy;
    }
}