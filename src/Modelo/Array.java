/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Enrique
 */
import java.util.ArrayList;
public class Array {
    public ArrayList<Object> lista;
    public Array()
    {
        lista=new ArrayList<Object>();
    }
    public void agregar(Object element)
    {
        lista.add(element);
    }
}
