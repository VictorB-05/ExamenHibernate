package org.example.DAO;

import org.example.entities.Empleados;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class IEmpleadosImpl implements IEmpleados {
    /**
     * inserta un nuevo registro
     *
     * @param empleado Aquel que se va a crear en la base de datos
     */
    @Override
    public void create(Empleados empleado) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(empleado);
            session.getTransaction();
        }
    }

    /**
     * Metodo por el que se busca todos los empleados para recivirlos
     *
     * @return todos los empleados en las base de datos
     */
    @Override
    public List<Empleados> findAll() {
        List<Empleados> empleados;
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {
            empleados = session.createQuery("from Empleados",Empleados.class).list();
        }
        return empleados;
    }
}
