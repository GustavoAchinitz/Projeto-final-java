
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class TratandoExecoesException extends Exception{
       
    public TratandoExecoesException(){   
    
    }    
    
    public void VerificaValores(double valor, String tipo) throws Exception{
        if(tipo.equals("Quadrado") && (valor < 10 || valor > 40)){
            throw new Exception ("O lado do quadrado deve ter no mínimo 10 e no máximo 40 cm.");
        }
        if(tipo.equals("Triangular") && (valor < 20 || valor > 60)){
            throw new Exception ("O lado do triângulo deve ter no mínimo 20 e no máximo 60 cm.");
        }
        if(tipo.equals("Circular") && (valor < 7 || valor > 23)){
            throw new Exception ("O raio do círculo deve ter no mínimo 7 e no máximo 23 cm.");
        }
    } 
    
}
