package com.xworkz.fertilizer.repo;

import com.xworkz.fertilizer.entity.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepositry {

    Integer save(TempleEntity templeEntity);

   default void saveAll(List<TempleEntity> list){

    }

 default List<TempleEntity> findAllByLocation (String location){

       return Collections.emptyList();
  }

 default List<TempleEntity> findAllByEntryFeeGreaterThan (double entryFee){
       return Collections.emptyList();


  }
 default List<TempleEntity> findAllByEntryInagrudateDateGreaterThan (LocalDate inagurateDate){
       return Collections.emptyList();
  }

    default List<TempleEntity> findById (int id) {
        return Collections.emptyList();

    }
   default List<TempleEntity>  findByIdMainGod(int id, String mainGod){
       return  Collections.emptyList();

    }
   default List<TempleEntity> findAllByEntryFeeBetween(double startFee,double endFee){
       return  Collections.emptyList();
    }


  }





