/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entidades2;

import ec.edu.ups.entidades3.Empleado;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nacip
 */
public class Parroquia {
    private int id;
    private String nombre;
    private String localizacion;
    private String numeropobladores;
     private List<Parroquia> parroquiaList;

    public Parroquia(int id, String nombre, String localizacion, String numeropobladores) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.numeropobladores = numeropobladores;
        this.parroquiaList= new ArrayList<Parroquia>();
    }

    public Parroquia() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNumeropobladores() {
        return numeropobladores;
    }

    public void setNumeropobladores(String numeropobladores) {
        this.numeropobladores = numeropobladores;
    }

    public List<Parroquia> getParroquiaList() {
        return parroquiaList;
    }

    public void setParroquiaList(List<Parroquia> parroquiaList) {
        this.parroquiaList = parroquiaList;
    }
    
    
    public void nuevaParroquia(int c, String n, String l, String p)
    {
        this.parroquiaList.add(new Parroquia(c,n,l,p));
    }

    @Override
    public String toString() {
        return "Parroquia{" 
                + "\n id=" + id 
                + "\n nombre=" + nombre
                + "\n localizacion=" + localizacion 
                + "\n numeropobladores=" + numeropobladores
                + "\n parroquiaList=" + parroquiaList + '}';
    }

   
    
}
