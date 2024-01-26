package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.MetalEntity;
import com.xworkz.fertilizer.repo.MetalRepositry;
import com.xworkz.fertilizer.repo.MetalRepositryImpl;

public class MetalRunner {
    public static void main(String[] args) {
        MetalEntity metalEntity=new MetalEntity(1,"Copper","blacck",4000,"50kg");
        MetalRepositry metalRepositry=new MetalRepositryImpl();
        metalRepositry.save(metalEntity);
    }
}
