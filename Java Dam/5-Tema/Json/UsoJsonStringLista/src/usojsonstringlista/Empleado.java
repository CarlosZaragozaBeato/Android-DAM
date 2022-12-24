/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usojsonstringlista;

/**
 *
 * @author usumaniana1
 */
public class Empleado {
    private int id;
    private String nombre;
    private String empresa;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", empresa=" + empresa + '}';
    }
  
    
}
