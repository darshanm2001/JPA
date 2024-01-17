package com.xworkz.salar.boot;

import com.xworkz.salar.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        SportEntity sportEntityDB=em.find(SportEntity.class,3);
        if(sportEntityDB!=null){
            em.remove(sportEntityDB);
            System.out.println("Removed successfully");
        }
        else
            System.out.println("cannot be removed");
        et.commit();
        em.close();
        emf.close();
    }
}
