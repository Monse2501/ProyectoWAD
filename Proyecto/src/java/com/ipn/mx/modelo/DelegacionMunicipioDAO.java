/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo;

import com.ipn.mx.clases.Delegacionmunicipio;
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
public class DelegacionMunicipioDAO {
    
    public void create(Delegacionmunicipio d) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.save(d);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void update(Delegacionmunicipio d) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.update(d);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public void delete(Delegacionmunicipio d) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            s.delete(d);
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }
    }

    public Delegacionmunicipio read(Delegacionmunicipio d) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.getTransaction();
        try {
            t.begin();
            d = (Delegacionmunicipio) s.get(Delegacionmunicipio.class, d.getIdDelegacionMunicipio());
            t.commit();
        } catch (HibernateException he) {
            if (t.isActive()) {
                t.rollback();
            }
        } finally {
            s.close();
        }

        return d;
    }

    public List readAll() {
        Session s = HibernateUtil.getSessionFactory().openSession(); //de tipo org.hibernate
        Transaction t = s.getTransaction();
        List resultado = null;
        try {
            t.begin();
            Query q = s.createQuery("from Delegacionmunicipio");
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
