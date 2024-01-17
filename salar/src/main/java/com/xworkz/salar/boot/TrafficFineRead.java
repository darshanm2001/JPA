package com.xworkz.salar.boot;

import com.xworkz.salar.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRead {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        TrafficFineEntity trafficFineEntityDB=em.find(TrafficFineEntity.class,2);
        System.out.println("entity found :"+trafficFineEntityDB);

        System.out.println("ET commit");
        System.out.println("Created Toy details");
        em.close();
        emf.close();
    }
}
