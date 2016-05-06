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
public class SalvaPersonas {
    public Persona crearPersona(String cedula, String tipo)
    {
        Persona per=null;
        if(tipo.equals("Migrante"))
        {
            per=new Migrante(cedula);
        }
        else if(tipo.equals("Indigena"))
        {
            per=new Indigena(cedula);
        }
        else if(tipo.equals("Ciudadano"))
        {
            per=new Ciudadano(cedula);
        }
        else if(tipo.equals("Refugiado"))
        {
            per=new Refugiado(cedula);
        }
        return per;
    }
    
}
