/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Johanna
 */
public class TextToBinary implements Expression{
    
     public String texto;


    public TextToBinary(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpreter(InterpreterContext ic) {
        return ic.getBinaryFormat(texto);
    }
    
}
