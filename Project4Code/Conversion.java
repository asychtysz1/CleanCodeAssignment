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
    public static String Convert(int userInput){
        String result = "";
        int currentNum = userInput;  
        do {
           if (userInput >= 1000)    {
               result += "M";
               userInput -= 1000;
           }
           else if(userInput >= 900) {
               result += "CM";
               userInput -= 900;
           }
           else if(userInput >= 800) {
               result += "DCCC";
               userInput -= 800;
           }
           else if(userInput >= 700) {
               result += "DCC";
               userInput -= 700;
           }
           else if(userInput >= 600) {
               result += "DC";
               userInput -= 600;
           }
           else if(userInput >= 500) {    
               result += "D";
               userInput -= 500;
           }
           else if(userInput >= 400) {
               result += "CD";
               userInput -= 400;
           }
           else if(userInput >= 300) {
               result += "CCC";
               userInput -= 300;
           }
           else if(userInput >= 200) {
               result += "CC";
               userInput -= 200;
           }
           else if(userInput >= 100) {
               result += "C";
               userInput -= 100;
           }
           else if(userInput >= 90) {
               result += "XC";
               userInput -= 90;
           }
           else if(userInput >= 80) {
               result += "LXXX";
               userInput -= 80;
           }
           else if(userInput >= 70) {
               result += "LXX";
               userInput -= 70;
           }
           else if(userInput >= 60) {
               result += "LX";
               userInput -= 60;
           }
           else if(userInput >= 50) {
               result += "L";
               userInput -= 50;
           }else if(userInput >= 40) {
               result += "XL";
               userInput -= 40;
           }
           else if(userInput >= 10) {
               result += "X";
               userInput -= 10;
           }
           else if(userInput == 9) {
               result += "IX";
               userInput -= 9;
           }else if(userInput == 8) {
               result += "VIII";
               userInput -= 8;
           }
           else if(userInput == 7) {
               result += "VII";
               userInput -= 7;
           }
           else if(userInput == 6) {
               result += "VI";
               userInput -= 6;
           }
           else if(userInput == 5) {
               result += "V";
               userInput -= 5;
           }
           else if(userInput == 4) {
               result += "IV";
               userInput -= 4;
           }else if(userInput == 3) {
               result += "III";
               userInput -= 3;
           } 
           else if(userInput == 2) {
               result += "II";
               userInput -= 2;
           }
           else if(userInput == 1) {
               result += "I";
               userInput -= 1;
           }
        } while (userInput > 0);
        return (currentNum + " in Roman numerals is " + result);  
    }
}    