package com.xworkz.salar.boot;

import com.xworkz.salar.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsReadRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        SportEntity sportEntityDB=em.find(SportEntity.class,2);
        System.out.println("entity Found :"+sportEntityDB );
           em.close();
           emf.close();
    }
}
