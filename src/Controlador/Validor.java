/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Ariel
 */
public class Validor {
    
    private final static String fibonacciPattern = "^(?x) .? | ( \\2?+ (\\1|^.) )* ..";
    private final static String numPattern = "^\\d*";
    
   
    public boolean validarCedula(String cedula)
    {
        Pattern pat= Pattern.compile(fibonacciPattern, Pattern.CASE_INSENSITIVE);
        Pattern patt= Pattern.compile(numPattern, Pattern.CASE_INSENSITIVE);
        Matcher mat= pat.matcher(cedula);
        return mat.find();
    }
    
}
