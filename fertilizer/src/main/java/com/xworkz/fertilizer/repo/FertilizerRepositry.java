package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface FertilizerRepositry {

    Integer save(FertilizerEntity fertilizerEntity);

    default void savaAll(List<FertilizerEntity> list){

    }

    default  List< FertilizerEntity> findAllByQuantity(int quantity){
        return Collections.emptyList();
    }

}
