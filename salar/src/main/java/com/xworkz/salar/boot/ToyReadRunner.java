package com.xworkz.salar.boot;


import com.xworkz.salar.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyReadRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
       /* ToyEntity toyEntity=new ToyEntity(3,"Doll","White",8000,"Cloth");
        em.persist(toyEntity);*/
        ToyEntity entityFromDB=em.find(ToyEntity.class,2);
        System.out.println("entity found :"+entityFromDB);


        System.out.println("ET commit");
        System.out.println("Created Toy details");
        em.close();
        emf.close();




    }
}

