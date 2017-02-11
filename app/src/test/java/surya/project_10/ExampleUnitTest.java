package surya.project_10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void  getvalues() throws  Exception {
            String str = "10";
         double a = Double.parseDouble(str);
        double b =5 ;
        final double NDrockUnitWeight = a/b;
        final String str1 =new Double(NDrockUnitWeight).toString();

        assertEquals(str1 , "2.0");

    }

    @Test
    public void calculateFS(){
        double x = Math.sin(90);
        assertNotEquals(x,1);

    }

    @Test
    public void calculateP(){
        double rad = 35 * Math.PI / 180;
        double P = (1-(.25))*(1/Math.sin(rad));// y

        System.out.println(P);
    }

    @Test
    public void calculateR(){

        double rad2 = 50 * Math.PI / 180;
        double rad = 35 * Math.PI / 180;
        double R = (.75*(1/Math.tan(rad))) - 1/Math.tan(rad2) ;
        System.out.println(rad);
        System.out.println(rad2);
        System.out.println((1/Math.tan(rad)));
        System.out.println((1/Math.tan(rad2)));
        System.out.println((.75*(1/Math.tan(rad))));
        System.out.println(R);
    }



}

