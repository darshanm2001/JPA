package com.xworkz.salar.boot;

import com.xworkz.salar.entity.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsUpdateRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("entity manager :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        SportEntity sportEntityDB=em.find(SportEntity.class,1);
        if(sportEntityDB!=null){
            sportEntityDB.setCaptainName("Dhoni");
            System.out.println("Updated Successfullt");
        }
        else
            System.out.println("cannot update");
        et.commit();
        em.close();
        emf.close();
    }
}
