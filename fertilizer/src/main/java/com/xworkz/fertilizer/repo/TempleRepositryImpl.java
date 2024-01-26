package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.TempleEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TempleRepositryImpl implements TempleRepositry {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TempleEntity templeEntity) {
        System.out.println("Starting save of temple :" + templeEntity);
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("Starting Et");
            et.begin();
            System.out.println("Starting persist");
            em.persist(templeEntity);
            System.out.println("ET Completed");
            et.commit();

        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in save method of temple :" + pe.getMessage());
            et.rollback();

        } finally {
            em.close();

        }
        return null;
    }

    @Override
    public void saveAll(List<TempleEntity> list) {
        System.out.println("Starting save of temple :" + list);
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("Et Starting");
            et.begin();
            System.out.println("persist starting");
            list.forEach(e -> em.persist(e));
            System.out.println("complteted ET");
            et.commit();


        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in saveAll method of temple :" + pe.getMessage());
            et.rollback();


        } finally {
            em.close();

        }


    }

    @Override
    public List<TempleEntity> findAllByLocation(String location) {
        System.out.println("starting save of fertilizer:" + location);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("Et Started");
            Query query = em.createNamedQuery("findAllByLocation");
            query.setParameter("lo", location);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;

        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in findAllByLocation method in temple :" + pe.getMessage());
            et.rollback();

        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double entryFee) {
        System.out.println("starting save of fertilizer:" + entryFee);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("Et Started");
            Query query = em.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("gr", entryFee);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;


        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in findAllByEntryFeeGreaterThan method in temple:" + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
        return TempleRepositry.super.findAllByEntryFeeGreaterThan(entryFee);
    }

    @Override
    public List<TempleEntity> findAllByEntryInagrudateDateGreaterThan(LocalDate inagurateDate) {
        System.out.println("starting save of fertilizer:" + inagurateDate);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("Et Started");
            Query query = em.createNamedQuery("findAllByEntryInagrudateDateGreaterThan");
            query.setParameter("dm", inagurateDate);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;

        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in findAllByEntryInagrudateDateGreaterThan method in temple:" + pe.getMessage());
            et.rollback();


        } finally {
            em.close();

        }

        return TempleRepositry.super.findAllByEntryInagrudateDateGreaterThan(inagurateDate);
    }

    @Override
    public List<TempleEntity> findById(int id) {
        System.out.println("starting save of fertilizer:" + id);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Et Started");
            et.begin();
            Query query = em.createNamedQuery("findById");
            query.setParameter("dd", id);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;


        } catch (PersistenceException pe) {
            System.out.println("PersistenceException in findById method in temple :" + pe.getMessage());
            et.rollback();

        } finally {
            em.close();

        }

        return TempleRepositry.super.findById(id);
    }

    @Override
    public List<TempleEntity> findByIdMainGod(int id, String mainGod) {
        System.out.println("starting save of fertilizer:" + id+ "and" +mainGod);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Et Started");
            et.begin();
            Query query = em.createNamedQuery("findByIdMainGod");
            query.setParameter("id",id);
            query.setParameter("mainGod",mainGod);
            List<TempleEntity> list = query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;


        }
        catch (PersistenceException pr){
            System.out.println("PersistenceException in findByIdMainGod method in temple :" + pr.getMessage());
            et.rollback();

        }

        finally {
            em.close();

        }
        return TempleRepositry.super.findByIdMainGod(id, mainGod);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        System.out.println("starting save of fertilizer:" + startFee+ "and" +endFee);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("Et Started");
            et.begin();
            Query query = em.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("startFee",startFee);
            query.setParameter("endFee",endFee);
            List<TempleEntity> list=query.getResultList();
            et.commit();
            System.out.println("list saved successfully");
            return list;

        }

        catch (PersistenceException pe){
            System.out.println("PersistenceException in findAllByEntryFeeBetween method in temple :" + pe.getMessage());
            et.rollback();


        }

        finally {

        }
        return TempleRepositry.super.findAllByEntryFeeBetween(startFee, endFee);
    }
}



