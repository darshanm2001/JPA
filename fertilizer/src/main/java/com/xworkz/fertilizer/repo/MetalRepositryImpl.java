package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.MetalEntity;

import javax.persistence.*;

public class MetalRepositryImpl implements MetalRepositry{

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(MetalEntity metalEntity) {
        System.out.println("starting save for metal entity:"+metalEntity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            System.out.println("Starting Et");
            et.begin();;
            System.out.println("starting persist");
            em.persist(metalEntity);
            System.out.println("Persist complete");
            et.commit();
        }

        catch (PersistenceException e){
            System.out.println("PersistenceException is saved  method of Metal:"+e.getMessage() );
            et.rollback();

        }

        finally {
            System.out.println("Closing resource");
            em.close();

        }
        return null;
    }
}
