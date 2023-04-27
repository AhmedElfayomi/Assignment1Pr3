/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Ahmed
 */
public class CurrencyConverter {
     private static final double USD_TO_ILS = 3.25;

    public static double convertToILS(double usd) {
        return usd * USD_TO_ILS;
    }

    public static double convertToUSD(double ils) {
        return ils / USD_TO_ILS;
    }
}
