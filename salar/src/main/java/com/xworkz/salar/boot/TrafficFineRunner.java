package com.xworkz.salar.boot;


import com.xworkz.salar.entity.TrafficEntity;
import com.xworkz.salar.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRunner {

    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        TrafficFineEntity trafficFineEntity =new TrafficFineEntity(2,"drink and Drive","KA01 6542","Mahesh",5000);
        em.persist(trafficFineEntity);
        System.out.println("Operation complete");
      et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
    }
}
