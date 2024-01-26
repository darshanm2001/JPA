package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.TempleEntity;
import com.xworkz.fertilizer.repo.TempleRepositry;
import com.xworkz.fertilizer.repo.TempleRepositryImpl;

import java.time.LocalDate;
import java.util.List;

public class TempleRunner {
    public static void main(String[] args) {
//      TempleEntity templeEntity = new TempleEntity("Tirupati", "Tirumala", 300, 600, LocalDate.of(2023, 02, 11), "Venketesha");
////        TempleEntity templeEntity1 = new TempleEntity("Badrinath Temple", "Uttarakhand", 1000, 5000, LocalDate.of(1947, 03, 11), "Venketesha");
////        TempleEntity templeEntity2 = new TempleEntity("Sun Temple", "Odisha", 300, 1000, LocalDate.of(1896, 12, 11), "Venketesha");
////        TempleEntity templeEntity3 = new TempleEntity("Somnath Temple", "Gujarat", 3000, 5500, LocalDate.of(1025, 06, 11), "Venketesha");
////        TempleEntity templeEntity4 = new TempleEntity("Kedarnath Temple", "Uttarakhand", 2000, 3000, LocalDate.of(1857, 10, 11), "Venketesha");
////        TempleEntity templeEntity5 = new TempleEntity("Vaishno Devi Temple", "Jammu and Kahsmir", 500, 800, LocalDate.of(1888, 07, 11), "Venketesha");
////        TempleEntity templeEntity6 = new TempleEntity("Golden Temple", "Punjab", 600, 1000, LocalDate.of(1586, 07, 01), "Venketesha");
////        TempleEntity templeEntity7 = new TempleEntity("Ram Mandir", "Ayodhya", 1200, 1800, LocalDate.of(2024, 01, 22), "Venketesha");

        TempleRepositry templeRepositry = new TempleRepositryImpl();
        // templeRepositry.save(templeEntity);
        // List<TempleEntity> entities= Arrays.asList(templeEntity,templeEntity1,templeEntity2,templeEntity3,templeEntity4,templeEntity5,templeEntity6,templeEntity7);
        // templeRepositry.saveAll(entities);

//         List<TempleEntity> entities=templeRepositry.findAllByLocation("Uttarakhand");
//        entities.forEach(f-> System.out.println(f));

//        List<TempleEntity> entities=templeRepositry.findAllByEntryFeeGreaterThan(1000);
//        entities.forEach(f-> System.out.println(f));

//        List<TempleEntity> entities=templeRepositry.findAllByEntryInagrudateDateGreaterThan(LocalDate.of(2023,1,1));
//        entities.forEach(d-> System.out.println(d));

//        List<TempleEntity> entities=templeRepositry.findById(1);
//        entities.forEach(g-> System.out.println(g));

//        List<TempleEntity> entities=templeRepositry.findByIdMainGod(2,"Venketesha");
//        entities.forEach(k-> System.out.println(k));

        List<TempleEntity> entities=templeRepositry.findAllByEntryFeeBetween(500,600);
        entities.forEach(s-> System.out.println(s));
        }

    }

