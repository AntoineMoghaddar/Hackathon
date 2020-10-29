package javamain.objects;

public class DistanceCalc {
    private int distToWallFront = -1,
            distToWallSide = -1,
            beaconPos = -1;

    //Singleton variable
    private static DistanceCalc single_instance = null;

    //We only need one instance that 'knows of everything' within this program
    public static DistanceCalc getInstance() {
        if (single_instance == null) {
            single_instance = new DistanceCalc();
        }
        return single_instance;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double pythagoras(int a, int b){
        double c = 0;

        if (Math.abs(a) > Math.abs(b)) {
            c = b / a;
            c = Math.abs(a) * Math.sqrt(1 + c*c);
        }
        else if (b != 0) {
            c = a / b;
            c = Math.abs(b) * Math.sqrt(1 + c*c);
        }
        return c;
    }

    //Distance from car to the beacon has to be known before calling this method
    private void deterPosBeacon(){

    }

    public int getDistToWallFront() {
        return distToWallFront;
    }

    public void setDistToWallFront(int distToWallFront) {
        this.distToWallFront = distToWallFront;
    }

    public int getDistToWallSide() {
        return distToWallSide;
    }

    public void setDistToWallSide(int distToWallSide) {
        this.distToWallSide = distToWallSide;
    }

    public int getBeaconPos() {
        return beaconPos;
    }

    public void setBeaconPos(int beaconPos) {
        this.beaconPos = beaconPos;
    }

}
