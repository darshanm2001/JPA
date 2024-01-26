package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;
import java.util.List;

public class FertilizerrepositryImpl implements  FertilizerRepositry{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    @Override
    public Integer save(FertilizerEntity fertilizerEntity) {
        System.out.println("starting save of fertilizer: "+fertilizerEntity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            System.out.println("Starting ET ");
            et.begin();
            System.out.println("Staring Persist");
            em.persist(fertilizerEntity);
            System.out.println("persist complete");
            et.commit();
        }

        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of fertilizer :"  +pe.getMessage());
            et.rollback();


        }

        finally {
            System.out.println("closing resource");
            em.close();


        }
        return null;
    }

    @Override
    public void savaAll(List<FertilizerEntity> list) {
        System.out.println("starting save of fertilizer:"+list);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try{

            et.begin();
            System.out.println("Et Started");
            list.forEach(e->em.persist(e));
            et.commit();
            System.out.println("list saved successfully");


        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in saveAll method of fertilizer");
            et.rollback();

        }
        finally {
            em.close();

        }
        FertilizerRepositry.super.savaAll(list);
    }

    @Override
    public List<FertilizerEntity> findAllByQuantity(int quantity) {
        System.out.println("starting save of fertilizer:"+quantity);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            et.begin();
            System.out.println("Et Started");
           Query query= em.createNamedQuery("findAllByQuantity");
            query.setParameter("qt",quantity);
            List<FertilizerEntity> list=query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;


        }

        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllBy in fertilizer");
            et.rollback();


        }

        finally {
            em.close();

        }
        return FertilizerRepositry.super.findAllByQuantity(quantity);
    }
}
