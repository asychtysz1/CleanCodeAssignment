/**
 * A conversion class with a simple Roman Numeral Conversion method.
 *
 * @author Andrew Sychtysz
 * @version 3/29/2019
 */
public class Conversion   {
    /**
     * This method is used to convert an integer and return it's value
     * as a Roman Numeral in a string.
     * @param roman Number to be converted
     * @return result This returns the Roman Numeral String
     */
    public static String Convert(int roman){
        String result = "";
        int currentNum = roman;  
        do {
           if (roman >= 1000)    {
               result += "M";
               roman -= 1000;
           }
           else if(roman >= 900) {
               result += "CM";
               roman -= 900;
           }
           else if(roman >= 800) {
               result += "DCCC";
               roman -= 800;
           }
           else if(roman >= 700) {
               result += "DCC";
               roman -= 700;
           }
           else if(roman >= 600) {
               result += "DC";
               roman -= 600;
           }
           else if(roman >= 500) {    
               result += "D";
               roman -= 500;
           }
           else if(roman >= 400) {
               result += "CD";
               roman -= 400;
           }
           else if(roman >= 300) {
               result += "CCC";
               roman -= 300;
           }
           else if(roman >= 200) {
               result += "CC";
               roman -= 200;
           }
           else if(roman >= 100) {
               result += "C";
               roman -= 100;
           }
           else if(roman >= 90) {
               result += "XC";
               roman -= 90;
           }
           else if(roman >= 80) {
               result += "LXXX";
               roman -= 80;
           }
           else if(roman >= 70) {
               result += "LXX";
               roman -= 70;
           }
           else if(roman >= 60) {
               result += "LX";
               roman -= 60;
           }
           else if(roman >= 50) {
               result += "L";
               roman -= 50;
           }else if(roman >= 40) {
               result += "XL";
               roman -= 40;
           }
           else if(roman >= 10) {
               result += "X";
               roman -= 10;
           }
           else if(roman == 9) {
               result += "IX";
               roman -= 9;
           }else if(roman == 8) {
               result += "VIII";
               roman -= 8;
           }
           else if(roman == 7) {
               result += "VII";
               roman -= 7;
           }
           else if(roman == 6) {
               result += "VI";
               roman -= 6;
           }
           else if(roman == 5) {
               result += "V";
               roman -= 5;
           }
           else if(roman == 4) {
               result += "IV";
               roman -= 4;
           }else if(roman == 3) {
               result += "III";
               roman -= 3;
           } 
           else if(roman == 2) {
               result += "II";
               roman -= 2;
           }
           else if(roman == 1) {
               result += "I";
               roman -= 1;
           }
        } while (roman > 0);
        return (currentNum + " in Roman numerals is " + result);  
    }
}    