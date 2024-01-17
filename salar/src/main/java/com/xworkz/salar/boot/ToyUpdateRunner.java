package com.xworkz.salar.boot;

import com.xworkz.salar.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("Em :"+em);
        EntityTransaction et= em.getTransaction();
        et.begin();
        System.out.println("ET Begin");
        ToyEntity toyEntity=em.find(ToyEntity.class,2);

        if (toyEntity !=null){
            //set properties amd merge-
            toyEntity.setColor("black");
            em.merge(toyEntity);
            System.out.println("Data updated Successfully");

        }
        else
            System.out.println("Details can't updated");
        et.commit();
        em.close();
        emf.close();
    }

}
