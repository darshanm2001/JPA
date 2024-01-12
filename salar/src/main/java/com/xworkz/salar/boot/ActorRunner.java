package com.xworkz.salar.boot;

import com.xworkz.salar.entity.ActorEntity;
import com.xworkz.salar.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        ActorEntity actorEntity=new ActorEntity(2,"Sudeep",60,"Hebbuli",500000);
        em.persist(actorEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();




    }
}

