/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Array;
import Vista.IngresarDatos;
import Vista.Reporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ariel
 */
public class ControlVentanaPrincipal implements ActionListener {

    
    private IngresarDatos ingreso;
    private Reporte resultado;
    private Array array;
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")){
            System.exit(0);
        }
        
        else if (e.getActionCommand().equalsIgnoreCase("Ingresar Datos")){
            this.ingreso = new IngresarDatos(array); 
            ingreso.show();
        }
        
        else if(e.getActionCommand().equalsIgnoreCase("General Archivo XML")){
           // this.generarXML = new 
        }
        
        else if (e.getActionCommand().equalsIgnoreCase("Resultado")){
            this.resultado= new Reporte(array);
            resultado.show();
        }
}
