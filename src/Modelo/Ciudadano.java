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
public class Ciudadano implements Persona{
    private String cedula, paisActual;
    private int traslados;

    public Ciudadano(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getTraslados()
    {
        return traslados;
    }
    public String getPaisActual()
    {
        return paisActual;
    }
    @Override
    public void realizarTraslado(String pais)throws Exception{
        if(paisActual.equals(pais))
        {
            throw new Exception("Se encuentra actualmente en este pais");
        }
        else
        {
            paisActual=pais;
        }
        traslados++;
    }
    
}
