/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entidades3;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nacip
 */
public class Departamento {
    private int id;
    private String descripcion;
    private String localidad;
    private int numero;
    private List<Empleado> empleadoList;

    public Departamento(int id, String descripcion, String localidad, int numero) {
        this.id = id;
        this.descripcion = descripcion;
        this.localidad = localidad;
        this.numero = numero;
        this.empleadoList= new ArrayList<Empleado>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }
    
    public void nuevoEmpleado(int c, String n, String a, Date f)
    {
        this.empleadoList.add(new Empleado(c,n,a,f));
    }
    @Override
    public String toString() {
        return "Departamento{"
                + "" + "\n id=" + id 
                + "\n  descripcion=" + descripcion 
                + "\n  localidad=" + localidad 
                + "\n  numero=" + numero
                + "\n empleadoList=" + empleadoList + '}';
    }
    
    
    
}
