package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositryImpl implements  TravelRepositry{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TravelEntity travelEntity) {
        System.out.println("tarting save for travel entity :"+travelEntity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            System.out.println("Et starting");
            et.begin();
            System.out.println("starting persist");
            em.persist(travelEntity);
            System.out.println("Et complteted");
            et.commit();

        }

        catch (PersistenceException exception){
            System.out.println("PersistenceException is save method in travel:"+exception.getMessage());
            et.rollback();


        }

        finally {
            em.close();


        }
        return null;
    }
}
