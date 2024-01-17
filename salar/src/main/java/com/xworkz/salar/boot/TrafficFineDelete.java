package com.xworkz.salar.boot;


import com.xworkz.salar.entity.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineDelete {
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
          em.remove(trafficFineEntityDB);
            System.out.println("Details Deleted Sucessfully");
        }
        else
            System.out.println("Detials  can't Delete");
        et.commit();
        em.close();
        emf.close();
    }


}
