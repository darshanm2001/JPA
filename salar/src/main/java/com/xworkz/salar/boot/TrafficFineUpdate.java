package com.xworkz.salar.boot;

import com.xworkz.salar.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begin");
        TrafficFineEntity trafficFineEntityDB=em.find(TrafficFineEntity.class,3);

        if(trafficFineEntityDB !=null){
            //set properties amd merge-
            trafficFineEntityDB.setFine(60000);
            System.out.println("Deatils Update successfully");
        }
        else
            System.out.println("Detials  can't update");
        et.commit();
        em.close();
        emf.close();
    }
}
