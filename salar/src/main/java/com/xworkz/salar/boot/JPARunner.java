package com.xworkz.salar.boot;

import com.xworkz.salar.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPARunner {
    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        SuperHeroEntity superHeroEntity=new SuperHeroEntity(2,"Yash","Rockey","Gold","India","Mother");
        em.persist(superHeroEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();




    }
}
