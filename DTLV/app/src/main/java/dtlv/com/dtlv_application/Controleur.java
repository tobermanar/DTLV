package dtlv.com.dtlv_application;

/**
 * Created by nourr on 08/12/2015.
 */
public class Controleur {
    Config config;
    Credits cred;
    Language lang;
    Menu menu;
    Test1 t1;
    Test2 t2;
    Test3 t3;
    Test4 t4;
    Test5 t5;
    Test6 t6;
    Test7 t7;
    Test8 t8;
    Test9 t9;
    Test10 t10;
    Tutorial tuto;
    GestionPoint gestionPoint;



    public Controleur(){

        config = new Config(this);
        cred = new Credits(this);
        lang = new Language(this);
        menu = new Menu(this);
        //TODO Modifier les constructeur
        //t1 = new Test1(this);
        //t2 = new Test2(this);
        t3 = new Test3(this);
        t4 = new Test4(this);
        t5 = new Test5(this);
        t6 = new Test6(this);
        t7 = new Test7(this);
        t8 = new Test8(this);
        t9 = new Test9(this);
        t10 = new Test10(this);
        tuto = new Tutorial(this);
        gestionPoint = new GestionPoint(this);

    }


// Interface GestionPoint
    /**
     * Set points for each sub-test (Callable by the sub-test)
     * @param testNumber    Number of the test
     * @param pts           Points for this test
     */
    public void setPoint(int testNumber, int pts){
        gestionPoint.setPoint(testNumber,pts);
    }

    /**
     * Get the results detailed ( value: int[i] for the test i+1 )
     * @return int[] Tab of results detailed
     */
    public int[] getResultsDetailed() {
        return gestionPoint.getPointParTest();
    }

    /**
     * Get the result of the test
     * @return int The result
     */
    public int getResultsGlobal() {
        return  gestionPoint.getPointTot();
    }
}
