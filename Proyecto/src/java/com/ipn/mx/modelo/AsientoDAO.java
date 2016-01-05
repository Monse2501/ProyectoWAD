/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo;

import com.ipn.mx.clases.Asiento;
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
public class AsientoDAO {
    
    public void create(Asiento a) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.save(a);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void update(Asiento a) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.update(a);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void delete(Asiento a) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.delete(a);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public Asiento read(Asiento a) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            a = (Asiento) s.get(Asiento.class, a.getIdAsiento());
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return a;
    }

    public List readAll() {
        Session s = HibernateUtil.getSessionFactory().openSession(); //de tipo org.hibernate
        Transaction t = s.getTransaction();
        List resultado = null;
        try {
            t.begin();
            Query q = s.createQuery("from Asiento");
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
