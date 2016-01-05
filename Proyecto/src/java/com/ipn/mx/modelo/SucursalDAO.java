/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo;

import com.ipn.mx.clases.Sucursal;
import com.ipn.mx.conf.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Max
 */
public class SucursalDAO {
    
    public void create(Sucursal su) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.save(su);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void update(Sucursal su) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.update(su);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void delete(Sucursal su) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.delete(su);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public Sucursal read(Sucursal su) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            su = (Sucursal) s.get(Sucursal.class, su.getIdSucursal());
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return su;
    }

    public List readAll() {
        Session s = HibernateUtil.getSessionFactory().openSession(); //de tipo org.hibernate
        Transaction t = s.getTransaction();
        List resultado = null;
        try {
            t.begin();
            Query q = s.createQuery("from Sucursal");
            resultado = q.list();
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return resultado;
    }
}
