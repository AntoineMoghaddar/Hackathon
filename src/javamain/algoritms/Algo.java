package javamain.algoritms;

public class Algo {
    int uls1, uls2, uls3, bws, ir;
    //Singleton variable
    private static Algo single_instance = null;

    //We only need one instance that 'knows of everything' within this program
    public static Algo getInstance() {
        if (single_instance == null) {
            single_instance = new Algo();
        }
        return single_instance;
    }

    public void nextPos() {

    }

    public void calcOptim() {

    }

    public int getUls1() {
        return uls1;
    }

    public void setUls1(int uls1) {
        this.uls1 = uls1;
    }

    public int getUls2() {
        return uls2;
    }

    public void setUls2(int uls2) {
        this.uls2 = uls2;
    }

    public int getUls3() {
        return uls3;
    }

    public void setUls3(int uls3) {
        this.uls3 = uls3;
    }

    public int getBws() {
        return bws;
    }

    public void setBws(int bws) {
        this.bws = bws;
    }

    public int getIr() {
        return ir;
    }

    public void setIr(int ir) {
        this.ir = ir;
    }
}
