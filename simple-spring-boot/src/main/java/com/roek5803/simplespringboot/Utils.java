package com.roek5803.simplespringboot;

public class Utils {

    public static double computePi(int n) {
        double sequenceFormula = 0;

        for (int counter = 1; counter < n; counter += 2) {
            sequenceFormula = sequenceFormula + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));
        }

        return 4 * sequenceFormula;
    }


}
