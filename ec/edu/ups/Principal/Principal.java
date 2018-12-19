/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;


import ec.edu.ups.entidades2.Canton;
import ec.edu.ups.entidades2.Pais;
import ec.edu.ups.entidades2.Parroquia;
import ec.edu.ups.entidades2.Provincia;
import ec.edu.ups.entidades3.Departamento;
import ec.edu.ups.entidades3.Empresa;

/**
 *
 * @author nacip
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Departamento d = new Departamento(1,"Sistemas","Cuenca",7);//,new java.util.Date(2018, 11, 30));
        d.nuevoEmpleado(1, "Juan", "Perez", new java.util.Date(2017, 11, 30));
        d.nuevoEmpleado(1, "Luis", "Cabrera", new java.util.Date(2016, 01, 20));
        Empresa e = new Empresa(1,"Deltronic","San Blas","074033883");
        e.agregarDepartamento(d);
        System.out.println(d.toString());
        
        /////////////////////////////////////////////////////////
        Pais p = new Pais(1,"Ecuador","Dolar","Linin Moreno");
        Provincia pro = new Provincia(1,"Azuay","Sierra","830000");  
        Canton can = new Canton(1,"Cuenca","Sierra","331000");
        Parroquia pa1 = new Parroquia(1, "Ricaurte", "Azuay", "3000");
        Parroquia pa2 = new Parroquia(1, "San Juaquin", "Azuay", "2500");
       // System.out.println(pa1.toString());
         //System.out.println(pa2.toString());
        
        p.nuevaProvincia(1, "Azuay", "Sierra", "830000");
       // System.out.println(p.toString());
     
        pro.nuevoCanton(1, "Cuenca", "Sierra", "331000");
       // System.out.println(pro.toString());
     
        can.nuevaParroquia(1, "el valle", "Sierra", "1500");
       // System.out.println(can.toString());
        ///////////////////////////////////////////////////////
    }
    
}
