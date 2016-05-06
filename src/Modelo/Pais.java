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
public class Pais {
    private String nombre;
    private int traslados;
    
    public Pais(String nombre, int traslados) {
        this.nombre = nombre;
        this.traslados = traslados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTraslados() {
        return traslados;
    }

    public void setTraslados(int traslados) {
        this.traslados = traslados;
    }
    public void nuevMigrante()throws Exception
    {
        if(traslados==0)
            throw new Exception("Se ha llegado al limite de traslados");
        else
            traslados--;
    }
}
