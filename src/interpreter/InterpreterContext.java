/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author Johanna
 */
public class InterpreterContext {

    public String getBse64Format(String t) {
        String encodedString = Base64.getEncoder().encodeToString(t.getBytes());
        return encodedString;
    }

    public String getASCII(String t) {
        char character = 0;
        String finalAscci = null;
        for (int i = 0; i < t.length(); i++) {   // while counting characters if less than the length add one        
            character = t.charAt(i); // start on the first character
            int ascii = (int) character; //convert the first character
            int[] ass = new int[]{ascii};
            System.out.println("--------------- " + ascii);
            finalAscci = Arrays.toString(ass);
            System.out.println(character + " " + finalAscci);
        }

        return finalAscci;
    }

    public String getHexaFormat(String t) {
        StringBuffer sb = new StringBuffer();
        //Converting string to character array
        char ch[] = t.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String hexString = Integer.toHexString(ch[i]);
            sb.append(hexString);
        }
        String result = sb.toString();
        return result;
    }

    public String getBinaryFormat(String t) {
        String result = "";
        char[] messChar = t.toCharArray();

        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }
        return result;
    }
    
}
