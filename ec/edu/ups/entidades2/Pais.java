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
public class Pais {
    private int id;
    private String nombre;
    private String moneda;
    private String presidente;
    private List<Provincia> provinciaList;

    public Pais(int id, String nombre, String moneda, String presidente) {
        this.id = id;
        this.nombre = nombre;
        this.moneda = moneda;
        this.presidente = presidente;
        this.provinciaList= new ArrayList<Provincia>();
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public List<Provincia> getProvinciaList() {
        return provinciaList;
    }

    public void setProvinciaList(List<Provincia> provinciaList) {
        this.provinciaList = provinciaList;
    }
 public void nuevaProvincia(int i, String n, String m, String p)
    {
        this.provinciaList.add(new Provincia(i,n,m,p));
    }
    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", moneda=" + moneda + ", presidente=" + presidente + ", provinciaList=" + provinciaList + '}';
    }
}
