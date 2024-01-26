package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositryImpl implements EmailRepositry{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(EmailEntity emailEntity) {
        System.out.println("starting save of Email: "+emailEntity);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Staring persist");
            em.persist(emailEntity);
            System.out.println("Et Complete");
            et.commit();

        }

        catch (PersistenceException pe){
            System.out.println("PersistenceException save method in email:"+pe.getMessage());
            et.rollback();



        }

        finally {
            em.close();

        }

        return null;
    }
}
