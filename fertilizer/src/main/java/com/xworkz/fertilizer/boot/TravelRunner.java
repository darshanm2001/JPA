package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.TravelEntity;
import com.xworkz.fertilizer.repo.TravelRepositry;
import com.xworkz.fertilizer.repo.TravelRepositryImpl;

import java.time.LocalDate;

public class TravelRunner {
    public static void main(String[] args) {
        TravelEntity travelEntity =new TravelEntity(2,"bangalore","belgavi",5000,"600km","interview","10hr","car",LocalDate.of(2021,02,21),LocalDate.of(2021,03,01));
        TravelRepositry travelRepositry=new TravelRepositryImpl();
        travelRepositry.save(travelEntity);
    }
}
