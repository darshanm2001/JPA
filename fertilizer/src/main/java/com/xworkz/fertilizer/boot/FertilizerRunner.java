package com.xworkz.fertilizer.boot;


import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repo.FertilizerRepositry;
import com.xworkz.fertilizer.repo.FertilizerrepositryImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FertilizerRunner {
    public static void main(String[] args) {

        FertilizerEntity fertilizerEntity=new FertilizerEntity("Nitrate fertilizers",100,100, LocalDate.of(2023,03,16),LocalDate.of(2025,05,15));
        FertilizerEntity fertilizerEntity1=new FertilizerEntity("sodium",200,600, LocalDate.of(2023,04,16),LocalDate.of(2025,05,15));
        FertilizerEntity fertilizerEntity2=new FertilizerEntity("urea fertilizers",300,800, LocalDate.of(2023,03,16),LocalDate.of(2025,05,15));
        FertilizerEntity fertilizerEntity3=new FertilizerEntity("pottassium fertilizers",400,1000, LocalDate.of(2023,03,16),LocalDate.of(2025,05,15));
        FertilizerEntity fertilizerEntity4=new FertilizerEntity("zinc fertilizers",500,1200, LocalDate.of(2023,03,16),LocalDate.of(2025,05,15));


        FertilizerRepositry fertilizerRepositry=new FertilizerrepositryImpl();
       // List<FertilizerEntity> entities= Arrays.asList(fertilizerEntity,fertilizerEntity1,fertilizerEntity2,fertilizerEntity3,fertilizerEntity4);
      //  fertilizerRepositry.savaAll(entities);

        List<FertilizerEntity> list=fertilizerRepositry.findAllByQuantity(100);
        list.forEach(f-> System.out.println(f));




    }
}

