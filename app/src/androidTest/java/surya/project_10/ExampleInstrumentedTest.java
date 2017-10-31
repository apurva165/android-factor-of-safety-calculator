package surya.project_10;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("surya.project_10", appContext.getPackageName());
    }
    @Test
    public void testtanInverse() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        double degrees = .1818;
        double radians = Math.toRadians(degrees);
        String tanuse = Double.toString((Math.toDegrees(Math.atan((.2)/(1.1)))));
        Log.d("tan calculation", tanuse);
    }
    @Test
    public void checkXX() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        double xx = (Math.cos( Math.toRadians(10.3) +  Math.toRadians(35))) / (Math.cos( Math.toRadians(10.3)));
        Log.d("fuck2", Double.toString(xx));
        System.out.println("fuck you");
    }

}
