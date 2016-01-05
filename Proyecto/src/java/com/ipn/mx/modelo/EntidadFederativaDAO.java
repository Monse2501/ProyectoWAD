/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo;

import com.ipn.mx.clases.Entidadfederativa;
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
public class EntidadFederativaDAO {
    
    public void create(Entidadfederativa e) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.save(e);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void update(Entidadfederativa e) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.update(e);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void delete(Entidadfederativa e) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.delete(e);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public Entidadfederativa read(Entidadfederativa e) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            e = (Entidadfederativa) s.get(Entidadfederativa.class, e.getIdEntidadFederativa());
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return e;
    }

    public List readAll() {
        Session s = HibernateUtil.getSessionFactory().openSession(); //de tipo org.hibernate
        Transaction t = s.getTransaction();
        List resultado = null;
        try {
            t.begin();
            Query q = s.createQuery("from Entidadfederativa");
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
