package com.xworkz.crud.boot;

import com.xworkz.crud.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("Et begains");
        BulbEntity bulbEntity = em.find(BulbEntity.class,3);
       if (bulbEntity!=null){
           bulbEntity.setBrand("Syska");
           em.merge(bulbEntity);
           System.out.println("updated successfully");
       }
       else
           System.out.println("cannot be updated");
       et.commit();
        em.close();
        emf.close();

    }
}

