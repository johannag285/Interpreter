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
public class TextToBase64 implements Expression{
    
    public String texto;

    
    
    public TextToBase64(String texto){
       this.texto = texto;
    }
    
    @Override
    public String interpreter(InterpreterContext ic) {
        return ic.getBse64Format(texto);
    }

}
