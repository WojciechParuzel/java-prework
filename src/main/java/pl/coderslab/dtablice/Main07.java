package pl.coderslab.dtablice;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main07 {

    public static void main(String[] args) {

        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double[] tempsFahrenheit = new double[temps.length];

        double suma = 0.0;
        double avg = 0.0;

        for (int i = 0; i < temps.length; i++) {
            tempsFahrenheit[i] = temps[i] * 1.8 + 32;
            suma += tempsFahrenheit[i];
        }

        avg = suma / tempsFahrenheit.length;
        //System.out.printf("ŚREDNIA: %.2f", avg);
        //System.out.printf("%.2f", avg);
//        String avgString = String.format("%.2f", avg);
//        Double  avgDouble = Double.parseDouble(avgString);
//
//        System.out.println(avgDouble);
//        DecimalFormat df = new DecimalFormat("#.##");
//        String formatted = df.format(avg);
//        System.out.println(formatted);  //prints 2

        System.out.println(String.format(Locale.US, "%.2f", avg));



    }
}