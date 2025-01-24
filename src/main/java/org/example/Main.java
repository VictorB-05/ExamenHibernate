package org.example;

import org.example.DAO.IEmpleados;
import org.example.DAO.IEmpleadosImpl;
import org.example.entities.Empleados;
import org.example.util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.createSessionFactory();
        IEmpleados iEmpleados = new IEmpleadosImpl();
        Empleados empleado1 = new Empleados(null,"Paco","SuMorrenito69@yahoo.es","RRHH");
        Empleados empleado2 = new Empleados(null,"Pepe","pepeDomingez1990@gmail.com","Marketing");
        Empleados empleado3 = new Empleados(null,"Manuel","MamuMax01@gmail.com","desarrollo");
        iEmpleados.create(empleado1);
        iEmpleados.create(empleado2);
        iEmpleados.create(empleado3);
        List<Empleados> empleados = iEmpleados.findAll();
        for(Empleados emple : empleados){
            System.out.println(emple);
        }
    }
}