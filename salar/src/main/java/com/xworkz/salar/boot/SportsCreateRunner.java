package com.xworkz.salar.boot;

import com.xworkz.salar.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsCreateRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :" +em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
       et.begin();
        System.out.println("ET Begain");
       SportEntity sportEntity= new SportEntity(2,"Hockey","Canada","Jaipal Singh",11);
       em.persist(sportEntity);
       et.commit();
        em.close();
        emf.close();

    }
}
