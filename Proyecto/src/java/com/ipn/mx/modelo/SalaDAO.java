/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo;

import com.ipn.mx.clases.Sala;
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
public class SalaDAO {
    
    public void create(Sala sa) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.save(sa);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void update(Sala sa) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.update(sa);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void delete(Sala sa) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.delete(sa);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public Sala read(Sala sa) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            sa = (Sala) s.get(Sala.class, sa.getIdSala());
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return sa;
    }

    public List readAll() {
        Session s = HibernateUtil.getSessionFactory().openSession(); //de tipo org.hibernate
        Transaction t = s.getTransaction();
        List resultado = null;
        try {
            t.begin();
            Query q = s.createQuery("from Sala");
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
