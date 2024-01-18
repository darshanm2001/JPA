package com.xworkz.crud.boot;

import com.xworkz.crud.entity.BulbEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BulbRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :"+em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET :" +et);
        et.begin();
        System.out.println("et begains");
        System.out.println("Records Created");
        BulbEntity bulbEntity=new BulbEntity(2,"GM","LED","High bright","B18", "10 Watt Hours","Red","580 Voltage",10);
        em.persist(bulbEntity);
        et.commit();
        em.close();
        emf.close();
    }
}
