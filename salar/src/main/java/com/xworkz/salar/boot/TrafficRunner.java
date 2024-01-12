package com.xworkz.salar.boot;

import com.xworkz.salar.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        TrafficEntity trafficEntity=new TrafficEntity(2,"Green","BTM","90sec",20);
        em.persist(trafficEntity);
        System.out.println("Operation complete");
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();




    }
}

