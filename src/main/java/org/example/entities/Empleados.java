package org.example.entities;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table
public class Empleados {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Name("id_empleado")
    private Integer idEmpleado;

    @Column
    private String nombre;

    @Column
    private String email;

    @Column
    private String departamento;

    public Empleados(){

    }

    public Empleados(Integer idEmpleado, String nombre, String email, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.email = email;
        this.departamento = departamento;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleados: " + idEmpleado +
                ", nombre: " + nombre +
                ", email: " + email +
                ", departamento: " + departamento;
    }

}
