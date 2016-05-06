/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.IngresarDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ariel
 */
public class ControlVentanaPrincipal implements ActionListener {

    
    private IngresarDatos ingreso;
    private Reporte resultado;
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(0);
        }
        
        else if (e.getActionCommand().equalsIgnoreCase("Ingresar Datos")){
            this.ingreso = new IngresarDatos(array de personas); 
        }
        
        else if (e.getActionCommand().equalsIgnoreCase("Resultado")){
            this.resultado= new Reporte(array de resultado);
        }
}
