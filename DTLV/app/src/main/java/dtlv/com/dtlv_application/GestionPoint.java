package dtlv.com.dtlv_application;

/**
 * Created by nourr on 08/12/2015.
 */
public class GestionPoint {

    private int pointTot;

    // Points test by test (For detailed results)
    private int t1;
    private int t2;
    private int t3;
    private int t4;
    private int t5;
    private int t6;
    private int t7;
    private int t8;
    private int t9;
    private int t10;

    //Tab grouping all points
    int[] pointParTest = {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10};


    public Controleur controleur;

    public GestionPoint(Controleur contro) {
        controleur = contro;
    }

    //Getters Setter
    public int[] getPointParTest() {
        return pointParTest;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    /**
     * Make the sum of all points for each sub-test
     * @return Total of points of the test
     */
    public int getPointTot() {
        //Update pointTot
        pointTot = 0;
        for (int i = 0; i < pointParTest.length; i++ ){
            pointTot += pointParTest[i];
        }
        return pointTot;
    }


    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getT3() {
        return t3;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }

    public int getT4() {
        return t4;
    }

    public void setT4(int t4) {
        this.t4 = t4;
    }

    public int getT5() {
        return t5;
    }

    public void setT5(int t5) {
        this.t5 = t5;
    }

    public int getT6() {
        return t6;
    }

    public void setT6(int t6) {
        this.t6 = t6;
    }

    public int getT7() {
        return t7;
    }

    public void setT7(int t7) {
        this.t7 = t7;
    }

    public int getT8() {
        return t8;
    }

    public void setT8(int t8) {
        this.t8 = t8;
    }

    public int getT9() {
        return t9;
    }

    public void setT9(int t9) {
        this.t9 = t9;
    }

    public int getT10() {
        return t10;
    }

    public void setT10(int t10) {
        this.t10 = t10;
    }


    /**
     * Set points of each test
     * @param testNb    Number of the test
     * @param pts       Points of the test
     */
    public void setPoint(int testNb, int pts){
        switch (testNb){
            case 1:
                setT1(pts);
                break;
            case 2:
                setT2(pts);
                break;
            case 3:
                setT3(pts);
                break;
            case 4:
                setT4(pts);
                break;
            case 5:
                setT5(pts);
                break;
            case 6:
                setT6(pts);
                break;
            case 7:
                setT7(pts);
                break;
            case 8:
                setT8(pts);
                break;
            case 9:
                setT9(pts);
                break;
            case 10:
                setT10(pts);
                break;
        }
    }


}
