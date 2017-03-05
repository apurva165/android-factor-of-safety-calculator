package surya.project_10;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.view.View.OnClickListener;

import java.text.DecimalFormat;

public class Main_page extends AppCompatActivity {


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_page);
        addListenerOnButton();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText heightOfRockSlope = (EditText) findViewById(R.id.editText);
        final EditText RockUnitWeight = (EditText) findViewById(R.id.editText2);
        final EditText SchargePressure = (EditText) findViewById(R.id.editText3);
        final EditText StablizingForce = (EditText) findViewById(R.id.editText4);
        final EditText DepthOfTensionCrack = (EditText) findViewById(R.id.editText5);
        final EditText DepthOfWaterTensionCrack = (EditText) findViewById(R.id.editText6);
        final EditText AngleOfInclinationStabForce = (EditText) findViewById(R.id.editText7);
        final EditText AngleOfSharingResistence = (EditText) findViewById(R.id.editText8);
        final EditText CohesionJointPlane = (EditText) findViewById(R.id.editText9);
        final EditText SlopeHorizontalInclination = (EditText) findViewById(R.id.editText10);
        final EditText FailurePlanehorizontalInclination = (EditText) findViewById(R.id.editText11);
        final EditText HzSeismicCofficient = (EditText) findViewById(R.id.editText12);
        final EditText VrSeismicCofficient = (EditText) findViewById(R.id.editText13);
        final EditText OptionalFs = (EditText) findViewById(R.id.editText24);
        final TextView Result1 = (TextView) findViewById(R.id.editText14);
        final TextView Result2 = (TextView) findViewById(R.id.editText15);
        final TextView Result3 = (TextView) findViewById(R.id.editText16);
        final TextView Result4 = (TextView) findViewById(R.id.editText17);
        final TextView Result5 = (TextView) findViewById(R.id.editText18);
        final TextView Result6 = (TextView) findViewById(R.id.editText19);
        final TextView FinalResult7 = (TextView) findViewById(R.id.editText23);
        final TextView FinalResult8 = (TextView) findViewById(R.id.editText25);
        final TextView Result10 = (TextView) findViewById(R.id.editText20);
        final TextView Result8 = (TextView) findViewById(R.id.editText21);
        final TextView Result9 = (TextView) findViewById(R.id.editText22);
        final Button submit = (Button) findViewById(R.id.button);


        /*****Calculating Nondimensional paramater******/


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String xyz = heightOfRockSlope.getText().toString();
                String xyz1 = RockUnitWeight.getText().toString();
                String xyz2 = SchargePressure.getText().toString();
                String xyz3 = StablizingForce.getText().toString();
                String xyz4 = DepthOfTensionCrack.getText().toString();
                String xyz5 = DepthOfWaterTensionCrack.getText().toString();
                String xyz6 = AngleOfInclinationStabForce.getText().toString();
                String xyz7 = AngleOfSharingResistence.getText().toString();
                String xyz8 = CohesionJointPlane.getText().toString();
                String xyz9 = SlopeHorizontalInclination.getText().toString();
                String xyz10 = FailurePlanehorizontalInclination.getText().toString();
                String xyz11 = HzSeismicCofficient.getText().toString();
                String xyz12 = VrSeismicCofficient.getText().toString();

                if (xyz.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter height Of Rock Slope",
                            Toast.LENGTH_LONG).show();
                } else if (xyz1.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Rock Unit Weight",
                            Toast.LENGTH_LONG).show();
                } else if (xyz2.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Scharge Pressure",
                            Toast.LENGTH_LONG).show();
                } else if (xyz3.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Stabilizing Force",
                            Toast.LENGTH_LONG).show();
                } else if (xyz4.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Depth Of Tensi on Crack",
                            Toast.LENGTH_LONG).show();
                } else if (xyz5.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Depth Of Water Tensi on Crack",
                            Toast.LENGTH_LONG).show();
                } else if (xyz6.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Angle Of Inclination Stab Force",
                            Toast.LENGTH_LONG).show();
                } else if (xyz7.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Angle Of Sharing Resistance",
                            Toast.LENGTH_LONG).show();
                } else if (xyz8.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Cohesion Joint Plane",
                            Toast.LENGTH_LONG).show();
                } else if (xyz9.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Slope Horizontal Inclination",
                            Toast.LENGTH_LONG).show();
                } else if (xyz10.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter Failure Plane horizontal Inclination",
                            Toast.LENGTH_LONG).show();
                } else if (xyz11.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter HzSeismic Coefficient",
                            Toast.LENGTH_LONG).show();
                } else if (xyz12.length() == 0) {
                    Toast.makeText(Main_page.this, "Please enter VrSeismic Coefficient",
                            Toast.LENGTH_LONG).show();
                } else {
                    try {
                        //              Nondimensional unit weight of rock
                        String str = RockUnitWeight.getText().toString();
                        double a = Double.parseDouble(str);
                        double b = 10.0; /*****GAMAw*****/
                        final double NDrockUnitWeight1 = a / b;
                        DecimalFormat form = new DecimalFormat("0.00");
                        final String NDrockUnitWeight = form.format(NDrockUnitWeight1).toString() + "  Nondimensional unit weight of Rock";
                        Result1.setText(NDrockUnitWeight);
                        //              Nondimensional cohesion
                        String str1 = CohesionJointPlane.getText().toString();
                        double c = Double.parseDouble(str1);
                        String str2 = heightOfRockSlope.getText().toString();
                        double d = Double.parseDouble(str2);
                        final double NDcohesion1 = c / (d * a);
                        double NDcohesion2 = Double.valueOf(NDcohesion1);
                        //	final String NDcohesion =new Double(NDcohesion1).toString();
                        final String NDcohesion = form.format(NDcohesion1).toString() + "  Nondimensional cohesion  ";
                        Result2.setText(NDcohesion);
                        //              Nondimensional Surcharge
                        String str3 = SchargePressure.getText().toString();
                        double e = Double.parseDouble(str3);
                        final double NDsurcharge1 = e / (d * a);
                        //		final String NDsurcharge =new Double(NDsurcharge1).toString();
                        final String NDsurcharge = form.format(NDsurcharge1).toString() + "  Nondimensional Surcharge";
                        Result3.setText(NDsurcharge);
                        //              Nondimensional Stabilizing force
                        String str4 = StablizingForce.getText().toString();
                        double f = Double.parseDouble(str4);
                        final double NDstabForce1 = f / (d * a * d);
                        //	final String NDstabForce =new Double(NDstabForce1).toString();
                        final String NDstabForce = form.format(NDstabForce1).toString() + "  Nondimensional Stabilizing Force";
                        Result4.setText(NDstabForce);
                        //              Nondimensional Depth of tension crack
                        String str5 = DepthOfTensionCrack.getText().toString();
                        double z = Double.parseDouble(str5);
                        final double NDdepthOfTensionCrack1 = z / d;
                        //	final String NDdepthOfTensionCrack =new Double(NDdepthOfTensionCrack1).toString();
                        final String NDdepthOfTensionCrack = form.format(NDdepthOfTensionCrack1).toString() + "  Nondimensional Depth of tension crack";
                        Result5.setText(NDdepthOfTensionCrack);
                        //              Nondimensional Depth of water in tension crack
                        String str12 = DepthOfWaterTensionCrack.getText().toString();
                        double zw = Double.parseDouble(str12);
                        final double DepthOfWaterTensionCrack1 = zw / d;
                        //	final String aa =new Double(DepthOfWaterTensionCrack1).toString();
                        final String aa = form.format(DepthOfWaterTensionCrack1).toString() + "  Nondimensional Depth of water in tension crack";
                        Result6.setText(aa);
                        //              Calculating P
                        String str6 = FailurePlanehorizontalInclination.getText().toString();
                        double y = Double.parseDouble(str6);
                        double rad = y * Math.PI / 180;
                        double P = (1 - NDdepthOfTensionCrack1) * (1 / Math.sin(rad));
                        //final String p =new Double(P).toString();
                        final String p = form.format(P).toString();
                        final String p1 = form.format(P).toString() + "  Value of P";
                        double p2 = Double.valueOf(p);
                        Result10.setText(p1);
                        //              Calculating Q
                        String str7 = SlopeHorizontalInclination.getText().toString();
                        double x = Double.parseDouble(str7);
                        double rad2 = x * Math.PI / 180;
                        double Q = ((1 - (NDdepthOfTensionCrack1 * NDdepthOfTensionCrack1)) * (1 / Math.tan(rad))) - 1 / Math.tan(rad2);
                        //final String q =new Double(Q).toString();
                        final String q = form.format(Q).toString() + "  Value of Q";
                        Result8.setText(q);
                        //              Calculating R
                        double R = ((1 - (NDdepthOfTensionCrack1)) * (1 / Math.tan(rad))) - 1 / Math.tan(rad2);
                        //final String r =new Double(R).toString();
                        final String r = form.format(R).toString() + "  Value of R";
                        Result9.setText(r);



                        //                ******FS FORMULA *******
                        //              2cstar P
                        double ss = 2.0 * (NDcohesion2) * P;
                        //              (1+Kv)(Q +(2qstar*R))
                        String str8 = VrSeismicCofficient.getText().toString();
                        double g = Double.parseDouble(str8);
                        double zz = (1 + g) * (Q + (2 * NDsurcharge1 * R));
                        //              angle of sharing resistance
                        String str11 = AngleOfSharingResistence.getText().toString();
                        double k = Double.parseDouble(str11);
                        //              vv
                        double vv = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.sin(rad));
                        double uu = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.cos(rad));
                        double rad3 = k * Math.PI / 180;
                        double rr = Math.tan(rad3);
                        //              yy
                        String str9 = AngleOfInclinationStabForce.getText().toString();
                        double i = Double.parseDouble(str9);
                        double rad4 = i * Math.PI / 180;
                        double yy = 2 * f * (Math.cos(rad4));
                        //              tt
                        double tt = (DepthOfWaterTensionCrack1 / NDrockUnitWeight1) * p2;
                        String str10 = HzSeismicCofficient.getText().toString();
                        double j = Double.parseDouble(str10);
                        double rad5 = j * Math.PI / 180;
                        double thita = (Math.tan(rad5));
                        double xx = (Math.cos(thita + rad)) / (Math.cos(rad));
                        double ww = (Math.sin(thita + rad)) / (Math.cos(rad));
                        //                ****Final Result ****
                        final double finalResult1 = ss + (zz * xx) - vv - tt + (yy * rr);
                        final double finalResult2 = (zz * ww) + uu - yy;
                        final double finalResult3 = finalResult1 / finalResult2;
                        //	final String finalResult =new Double(finalResult3).toString();
                        final String finalResult = form.format(finalResult3).toString() /*+ "  Factor of Safety"*/ ;
                        FinalResult7.setText(finalResult);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // *******T calculation *****


    }
    // Navigation
    private void addListenerOnButton() {

        final Context context = this;

        final Button homePage = (Button) findViewById(R.id.button6);

        homePage.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home_page.class);
                startActivity(intent);

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //        if (id == R.id.action_settings) {
        //            return true;
        //        }
        return super.onOptionsItemSelected(item);
    }
}