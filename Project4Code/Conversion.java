/**
 * The Conversion class that contains the Integer to Roman Numeral Conversion method.
 *
 * @author Andrew Sychtysz
 * @version 11/6/2020
 */
public class Conversion   {
    /**
     * This method is used to convert an integer and return it's value
     * as a Roman Numeral in a string.
     * @param integer variable "roman" is the number to be converted
     * @return String variable "result" here the converted version of roman is stored
     */
    public static String intToRomanNumString(int userInput){
        String convertedResult = "";
        int originalUserInput = userInput;  
        do {
           if (userInput >= 1000)    {
        	   convertedResult += "M";
               userInput -= 1000;
           }
           else if(userInput >= 900) {
        	   convertedResult += "CM";
               userInput -= 900;
           }
           else if(userInput >= 800) {
        	   convertedResult += "DCCC";
               userInput -= 800;
           }
           else if(userInput >= 700) {
        	   convertedResult += "DCC";
               userInput -= 700;
           }
           else if(userInput >= 600) {
        	   convertedResult += "DC";
               userInput -= 600;
           }
           else if(userInput >= 500) {    
        	   convertedResult += "D";
               userInput -= 500;
           }
           else if(userInput >= 400) {
        	   convertedResult += "CD";
               userInput -= 400;
           }
           else if(userInput >= 300) {
        	   convertedResult += "CCC";
               userInput -= 300;
           }
           else if(userInput >= 200) {
        	   convertedResult += "CC";
               userInput -= 200;
           }
           else if(userInput >= 100) {
        	   convertedResult += "C";
               userInput -= 100;
           }
           else if(userInput >= 90) {
        	   convertedResult += "XC";
               userInput -= 90;
           }
           else if(userInput >= 80) {
        	   convertedResult += "LXXX";
               userInput -= 80;
           }
           else if(userInput >= 70) {
        	   convertedResult += "LXX";
               userInput -= 70;
           }
           else if(userInput >= 60) {
        	   convertedResult += "LX";
               userInput -= 60;
           }
           else if(userInput >= 50) {
        	   convertedResult += "L";
               userInput -= 50;
           }else if(userInput >= 40) {
        	   convertedResult += "XL";
               userInput -= 40;
           }
           else if(userInput >= 10) {
        	   convertedResult += "X";
               userInput -= 10;
           }
           else if(userInput == 9) {
        	   convertedResult += "IX";
               userInput -= 9;
           }else if(userInput == 8) {
        	   convertedResult += "VIII";
               userInput -= 8;
           }
           else if(userInput == 7) {
        	   convertedResult += "VII";
               userInput -= 7;
           }
           else if(userInput == 6) {
        	   convertedResult += "VI";
               userInput -= 6;
           }
           else if(userInput == 5) {
        	   convertedResult += "V";
               userInput -= 5;
           }
           else if(userInput == 4) {
        	   convertedResult += "IV";
               userInput -= 4;
           }else if(userInput == 3) {
        	   convertedResult += "III";
               userInput -= 3;
           } 
           else if(userInput == 2) {
        	   convertedResult += "II";
               userInput -= 2;
           }
           else if(userInput == 1) {
        	   convertedResult += "I";
               userInput -= 1;
           }
        } while (userInput > 0); 
        return ("Original User Input: " + originalUserInput + ". Converted to Roman numerals: " + convertedResult);  // Return statement w/ convertedResult.
    }
}    