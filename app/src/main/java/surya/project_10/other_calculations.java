package surya.project_10;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class other_calculations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_calculations);
        addListenerOnButton();
        final EditText heightOfRockSlope = (EditText) findViewById(R.id.editText);
        final EditText RockUnitWeight = (EditText) findViewById(R.id.editText2);
        final EditText SchargePressure = (EditText) findViewById(R.id.editText3);
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

        // new added values
        final EditText newS = (EditText) findViewById(R.id.editText31);
        final EditText newd = (EditText) findViewById(R.id.editText32);
        final EditText newfy = (EditText) findViewById(R.id.editText33);
        final EditText newfsb = (EditText) findViewById(R.id.editText34);
        final EditText newfal = (EditText) findViewById(R.id.editText35);
        final Button BNLsubmit = (Button) findViewById(R.id.button10);
        final TextView bresult = (TextView) findViewById(R.id.editText36);
        final TextView Nresult = (TextView) findViewById(R.id.editText37);
        final TextView Lresult = (TextView) findViewById(R.id.editText38);

        // *******T calculation *****


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String xyz = heightOfRockSlope.getText().toString();
                String xyz1 = RockUnitWeight.getText().toString();
                String xyz2 = SchargePressure.getText().toString();
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
                    Toast.makeText(other_calculations.this, "Please enter height Of Rock Slope",
                            Toast.LENGTH_LONG).show();
                } else if (xyz1.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Rock Unit Weight",
                            Toast.LENGTH_LONG).show();
                } else if (xyz2.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Scharge Pressure",
                            Toast.LENGTH_LONG).show();
                } else if (xyz4.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Depth Of Tensi on Crack",
                            Toast.LENGTH_LONG).show();
                } else if (xyz5.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Depth Of Water Tensi on Crack",
                            Toast.LENGTH_LONG).show();
                } else if (xyz6.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Angle Of Inclination Stab Force",
                            Toast.LENGTH_LONG).show();
                } else if (xyz7.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Angle Of Sharing Resistance",
                            Toast.LENGTH_LONG).show();
                } else if (xyz8.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Cohesion Joint Plane",
                            Toast.LENGTH_LONG).show();
                } else if (xyz9.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Slope Horizontal Inclination",
                            Toast.LENGTH_LONG).show();
                } else if (xyz10.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter Failure Plane horizontal Inclination",
                            Toast.LENGTH_LONG).show();
                } else if (xyz11.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter HzSeismic Coefficient",
                            Toast.LENGTH_LONG).show();
                } else if (xyz12.length() == 0) {
                    Toast.makeText(other_calculations.this, "Please enter VrSeismic Coefficient",
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
                        Log.d("e", Double.toString(e));
                        Log.d("d", Double.toString(d));
                        Log.d("a", Double.toString(a));

                        //		final String NDsurcharge =new Double(NDsurcharge1).toString();
                        final String NDsurcharge = form.format(NDsurcharge1).toString() + "  Nondimensional Surcharge";
                        Result3.setText(NDsurcharge);
                        //              Nondimensional Stabilizing force
               //         String str4 = StablizingForce.getText().toString();
                //        double f = Double.parseDouble(str4);
                        final double GymaH = (d * a * d);
                        Log.d("d", Double.toString(d));
                        Log.d("a", Double.toString(a));

                        //	final String NDstabForce =new Double(NDstabForce1).toString();
               //         final String NDstabForce = form.format(NDstabForce1).toString() + "  Nondimensional Stabilizing Force";
              //          Result4.setText(NDstabForce);
                        //              Nondimensional Depth of tension crack
                        String str5 = DepthOfTensionCrack.getText().toString();
                        double z = Double.parseDouble(str5);
                        final double NDdepthOfTensionCrack1 = z / d;
                        Log.d("z", Double.toString(z));
                        //	final String NDdepthOfTensionCrack =new Double(NDdepthOfTensionCrack1).toString();
                        final String NDdepthOfTensionCrack = form.format(NDdepthOfTensionCrack1).toString() + "  Nondimensional Depth of tension crack";
                        Result5.setText(NDdepthOfTensionCrack);
                        //              Nondimensional Depth of water in tension crack
                        String str12 = DepthOfWaterTensionCrack.getText().toString();
                        double zw = Double.parseDouble(str12);
                        final double DepthOfWaterTensionCrack1 = zw / d;
                        Log.d("zw", Double.toString(zw));
                        //	final String aa =new Double(DepthOfWaterTensionCrack1).toString();
                        final String aa = form.format(DepthOfWaterTensionCrack1).toString() + "  Nondimensional Depth of water in tension crack";
                        Result6.setText(aa);
                        //              Calculating P
                        String str6 = FailurePlanehorizontalInclination.getText().toString();
                        double y = Double.parseDouble(str6);
                        Log.d("y", Double.toString(y));
                        double rad = y * Math.PI / 180;
                        double finalrad = y;
                        double P = (1 - NDdepthOfTensionCrack1) * (1 / Math.sin(rad));
                        Log.d("NDdepthOfTensionCrack1", Double.toString(NDdepthOfTensionCrack1));
                        Log.d("P", Double.toString(P));
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
                        Log.d("zz", Double.toString(zz));
                        Log.d("g", Double.toString(g));
                        Log.d("NDsurcharge1", Double.toString(NDsurcharge1));
                        Log.d("R", Double.toString(R));
                        Log.d("Q", Double.toString(Q));

                        Log.d("2cstar P", Double.toString(ss));
                        //              angle of sharing resistance
                        String str11 = AngleOfSharingResistence.getText().toString();
                        double k = Double.parseDouble(str11);
                        //              vv
                        double vv = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.sin(rad));
                        double uu = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.cos(rad));
                        double rad3 = k * Math.PI / 180;
                        double rr = Math.tan(rad3);
                        Log.d("vv", Double.toString(vv));
                        Log.d("uu", Double.toString(uu));
                        Log.d("rr", Double.toString(rr));


                        //              yy
                        String str9 = AngleOfInclinationStabForce.getText().toString();
                        double i = Double.parseDouble(str9);
                        double rad4 = i * Math.PI / 180;

                       double yy = 2 * (Math.cos(rad4));
                 //       Log.d("yy", Double.toString(yy));
                        //              tt
                        double tt = (DepthOfWaterTensionCrack1 / NDrockUnitWeight1) * p2;
                        Log.d("tt", Double.toString(tt));

                        // gg
                        double gg = 2  * (Math.sin(rad4));
              //          Log.d("gg", Double.toString(gg));
                        String str10 = HzSeismicCofficient.getText().toString();



                        double j = Double.parseDouble(str10);

                        double rad5 = (j/(1+g));
                        double thita = Math.toDegrees(Math.atan((rad5)));
                        Log.d("j", Double.toString(j));




                        double xx = (Math.cos( Math.toRadians(thita) +  Math.toRadians(y))) / (Math.cos( Math.toRadians(thita)));
                        Log.d("xx", Double.toString(xx));
                        Log.d("thita", Double.toString(thita));
                        Log.d("rad", Double.toString(rad));
                        double ww = (Math.sin(Math.toRadians(thita) +  Math.toRadians(y))) / (Math.cos(Math.toRadians(thita)));


                        Log.d("this is y", Double.toString(y));
                        Log.d("ww", Double.toString(ww));
                        //                ****Final Result ****

                        //Extra calculation for T
                        String str13 = OptionalFs.getText().toString();
                        double m = Double.parseDouble(str13);

                        final double TnumValue = (((zz * ww) + uu) * m - ss - ((zz * xx) - vv - tt) * rr) * GymaH;
                        final double Tdenovalue = (yy * rr) + (gg * m);

                        final double Tresult = Math.ceil(TnumValue/Tdenovalue);


               //         final double finalResult1 = ss + ((zz * xx) - vv - tt + yy) * rr;
                //        Log.d("finalResult1", Double.toString(finalResult1));
             //           final double finalResult2 = (zz * ww) + uu - gg;
             //           Log.d("finalResult2", Double.toString(finalResult2));
                //        final double finalResult3 = finalResult1 / finalResult2;
                //        Log.d("finalResult3", Double.toString(finalResult3));
                        //	final String finalResult =new Double(finalResult3).toString();

                        // T result

                //        final double tNumerator = (((zz*ww) + ww)*finalResult3 - ss - ( (zz * xx) - vv -tt) * rr) * (d * a * d) ;
              //          final double tDenomenator = 2*(((Math.cos(rad4))*rr) + (Math.sin(rad4))* finalResult3);
               //         final double finalTresult = tNumerator/tDenomenator;

                        final String finalTresult1 = form.format(Tresult).toString() /*+ "  Factor of Safety"*/ ;
                        FinalResult8.setText(finalTresult1);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //        new calaculations

      BNLsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                Log.d("e", Double.toString(e));
                Log.d("d", Double.toString(d));
                Log.d("a", Double.toString(a));

                //		final String NDsurcharge =new Double(NDsurcharge1).toString();
                final String NDsurcharge = form.format(NDsurcharge1).toString() + "  Nondimensional Surcharge";
                Result3.setText(NDsurcharge);
                //              Nondimensional Stabilizing force
                //         String str4 = StablizingForce.getText().toString();
                //        double f = Double.parseDouble(str4);
                final double GymaH = (d * a * d);
                Log.d("d", Double.toString(d));
                Log.d("a", Double.toString(a));

                //	final String NDstabForce =new Double(NDstabForce1).toString();
                //         final String NDstabForce = form.format(NDstabForce1).toString() + "  Nondimensional Stabilizing Force";
                //          Result4.setText(NDstabForce);
                //              Nondimensional Depth of tension crack
                String str5 = DepthOfTensionCrack.getText().toString();
                double z = Double.parseDouble(str5);
                final double NDdepthOfTensionCrack1 = z / d;
                Log.d("z", Double.toString(z));
                //	final String NDdepthOfTensionCrack =new Double(NDdepthOfTensionCrack1).toString();
                final String NDdepthOfTensionCrack = form.format(NDdepthOfTensionCrack1).toString() + "  Nondimensional Depth of tension crack";
                Result5.setText(NDdepthOfTensionCrack);
                //              Nondimensional Depth of water in tension crack
                String str12 = DepthOfWaterTensionCrack.getText().toString();
                double zw = Double.parseDouble(str12);
                final double DepthOfWaterTensionCrack1 = zw / d;
                Log.d("zw", Double.toString(zw));
                //	final String aa =new Double(DepthOfWaterTensionCrack1).toString();
                final String aa = form.format(DepthOfWaterTensionCrack1).toString() + "  Nondimensional Depth of water in tension crack";
                Result6.setText(aa);
                //              Calculating P
                String str6 = FailurePlanehorizontalInclination.getText().toString();
                double y = Double.parseDouble(str6);
                Log.d("y", Double.toString(y));
                double rad = y * Math.PI / 180;
                double finalrad = y;
                double P = (1 - NDdepthOfTensionCrack1) * (1 / Math.sin(rad));
                Log.d("NDdepthOfTensionCrack1", Double.toString(NDdepthOfTensionCrack1));
                Log.d("P", Double.toString(P));
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
                Log.d("zz", Double.toString(zz));
                Log.d("g", Double.toString(g));
                Log.d("NDsurcharge1", Double.toString(NDsurcharge1));
                Log.d("R", Double.toString(R));
                Log.d("Q", Double.toString(Q));

                Log.d("2cstar P", Double.toString(ss));
                //              angle of sharing resistance
                String str11 = AngleOfSharingResistence.getText().toString();
                double k = Double.parseDouble(str11);
                //              vv
                double vv = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.sin(rad));
                double uu = ((DepthOfWaterTensionCrack1 * DepthOfWaterTensionCrack1) / NDrockUnitWeight1) * (Math.cos(rad));
                double rad3 = k * Math.PI / 180;
                double rr = Math.tan(rad3);
                Log.d("vv", Double.toString(vv));
                Log.d("uu", Double.toString(uu));
                Log.d("rr", Double.toString(rr));


                //              yy
                String str9 = AngleOfInclinationStabForce.getText().toString();
                double i = Double.parseDouble(str9);
                double rad4 = i * Math.PI / 180;

                double yy = 2 * (Math.cos(rad4));
                //       Log.d("yy", Double.toString(yy));
                //              tt
                double tt = (DepthOfWaterTensionCrack1 / NDrockUnitWeight1) * p2;
                Log.d("tt", Double.toString(tt));

                // gg
                double gg = 2  * (Math.sin(rad4));
                //          Log.d("gg", Double.toString(gg));
                String str10 = HzSeismicCofficient.getText().toString();



                double j = Double.parseDouble(str10);

                double rad5 = (j/(1+g));
                double thita = Math.toDegrees(Math.atan((rad5)));
                Log.d("j", Double.toString(j));




                double xx = (Math.cos( Math.toRadians(thita) +  Math.toRadians(y))) / (Math.cos( Math.toRadians(thita)));
                Log.d("xx", Double.toString(xx));
                Log.d("thita", Double.toString(thita));
                Log.d("rad", Double.toString(rad));
                double ww = (Math.sin(Math.toRadians(thita) +  Math.toRadians(y))) / (Math.cos(Math.toRadians(thita)));


                Log.d("this is y", Double.toString(y));
                Log.d("ww", Double.toString(ww));
                //                ****Final Result ****

                //Extra calculation for T
                String str13 = OptionalFs.getText().toString();
                double m = Double.parseDouble(str13);

                final double TnumValue = (((zz * ww) + uu) * m - ss - ((zz * xx) - vv - tt) * rr) * GymaH;
                final double Tdenovalue = (yy * rr) + (gg * m);

                final double Tresult = Math.ceil(TnumValue/Tdenovalue);



                //**** b N L calculation****


                String str21 = newS.getText().toString();
                double NewS = Double.parseDouble(str21);
                Log.d("newS", Double.toString(NewS));

                String str22 = newd.getText().toString();
                double Newd = Double.parseDouble(str22);
                Log.d("Newd", Double.toString(Newd));

                String str23 = newfy.getText().toString();
                double Newfy = Double.parseDouble(str23);
                Log.d("Newfy", Double.toString(Newfy));

                String str24 = newfsb.getText().toString();
                double Newfsb = Double.parseDouble(str24);
                Log.d("Newfsb", Double.toString(Newfsb));

                String str25 = newfal.getText().toString();
                double Newfal = Double.parseDouble(str25);
                Log.d("Newfal", Double.toString(Newfal));


                //                b calculation

                double newp = ((3.14) * (Newd * Newd) * Newfy) / 4 * Newfsb;

                double bcalculation = newp * (c - NDdepthOfTensionCrack1) * Math.sin(rad4 + rad) / Newfy * NewS * (Math.cos(rad4 + rad - rad2));
                double ncalculation =  (c - NDdepthOfTensionCrack1) * Math.sin(rad4 + rad) / NewS * bcalculation * (Math.cos(rad4 + rad - rad2));
                double lcalculation =  ncalculation*NewS*Math.sin(rad + rad2)/ Math.cos(rad)+Newfal;



                final String finalBvalue = form.format(bcalculation).toString() + "  Value of b";
                final String finalNvalue = form.format(ncalculation).toString() + "  Value of N";
                final String finalLvalue = form.format(lcalculation).toString() + "  Value of L";
                bresult.setText(finalBvalue);
                Nresult.setText(finalNvalue);
                Lresult.setText(finalLvalue);

            }
        });


    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button home = (Button) findViewById(R.id.button5);
        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home_page.class);
                startActivity(intent);
            }
        });

    }







}