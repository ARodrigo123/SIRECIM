/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entidades2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacip
 */
public class Provincia {
    private int id;
    private String nombre;
    private String region;
    private String numeropobladores;
      private List<Canton> cantonList;

    public Provincia(int id, String nombre, String region, String numeropobladores) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
        this.numeropobladores = numeropobladores;
        this.cantonList= new ArrayList<Canton>();
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNumeropobladores() {
        return numeropobladores;
    }

    public void setNumeropobladores(String numeropobladores) {
        this.numeropobladores = numeropobladores;
    }

    public List<Canton> getCantonList() {
        return cantonList;
    }

    public void setCantonList(List<Canton> cantonList) {
        this.cantonList = cantonList;
    }
    
    public void nuevoCanton(int i, String n, String p, String l)
    {
        this.cantonList.add(new Canton(i,n,p,l));
    }

    @Override
    public String toString() {
        return "Provincia{" + "id=" + id + ", nombre=" + nombre + ", region=" + region + ", numeropobladores=" + numeropobladores + ", cantonList=" + cantonList + '}';
    }    
}
