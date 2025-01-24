package org.example.DAO;

import org.example.entities.Empleados;

import java.util.List;

public interface IEmpleados {
    /**
     * inserta un nuevo registro
     *
     * @param empleado Aquel que se va a crear en la base de datos
     */
    void create(Empleados empleado);

    /**
     * Metodo por el que se busca todos los empleados para recivirlos
     *
     * @return todos los empleados en las base de datos
     */
    List<Empleados> findAll();
}
