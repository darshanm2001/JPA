package com.xworkz.crud.boot;

import com.xworkz.crud.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("Et begains");
        BulbEntity bulbEntity = em.find(BulbEntity.class,2);
        if (bulbEntity!=null){
            em.remove(bulbEntity);
            System.out.println("Deleted successfully");
        }
        else
            System.out.println("cannot be deleted");
        et.commit();
        em.close();
        emf.close();

    }
}
