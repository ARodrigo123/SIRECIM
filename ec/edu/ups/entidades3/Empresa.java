/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entidades3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacip
 */
public class Empresa {
    private int id;
    private String descripcion;
    private String direccion;
    private String telefono;
    private List<Departamento> departamentoList;

    public Empresa(int id, String descripcion, String direccion, String telefono) {
        this.id = id;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentoList = new ArrayList<Departamento>();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }
    
    public void agregarDepartamento(Departamento d)
    {
        this.departamentoList.add(d);
    }
    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", descripcion=" + descripcion + ", direccion=" + direccion + ", telefono=" + telefono + ", departamentoList=" + departamentoList + '}';
    }
    
    
}
