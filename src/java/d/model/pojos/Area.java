package d.model.pojos;
// Generated 11/05/2022 06:31:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Area generated by hbm2java
 */
public class Area  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Character status;
     private Set empleados = new HashSet(0);

    public Area() {
    }

	
    public Area(String nombre) {
        this.nombre = nombre;
    }
    public Area(String nombre, Character status, Set empleados) {
       this.nombre = nombre;
       this.status = status;
       this.empleados = empleados;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Character getStatus() {
        return this.status;
    }
    
    public void setStatus(Character status) {
        this.status = status;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}


