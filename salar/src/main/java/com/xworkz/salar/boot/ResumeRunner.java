package com.xworkz.salar.boot;

import com.xworkz.salar.entity.ResumeEntity;
import com.xworkz.salar.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ResumeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM :" +em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET Begain");
        System.out.println("Starting Opertaion");
        ResumeEntity resumeEntity=new ResumeEntity(2,"Abhi","Kusugal","BA",4);
        em.persist(resumeEntity);
        System.out.println("Operation com;plete");
        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();




    }
}

