/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class Client {

    public InterpreterContext ic;

    public Client(InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(String str) {
        Expression exp = null;
        //create rules for expressions
        if (str.contains("Base64")) {
            str = str.replaceAll("to Base64", " ");
            exp = new TextToBase64(str);
        } else if (str.contains("ASCII")) {
            str = str.replaceAll("to ASCII", " ");
            exp = new TextToASCII(str);
        } else if (str.contains("HEXA")) {
            str = str.replaceAll("to HEXA", " ");
            exp = new TextToHexa(str);
        }else if (str.contains("Binary")) {
            str = str.replaceAll("to Binary", " ");
            exp = new TextToBinary(str);
        }else {
            return str;
        }
        return exp.interpreter(ic);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el texto: ");
        str = teclado.nextLine();

        Client ec = new Client(new InterpreterContext());
        System.out.println(ec.interpret(str));

    }

}
