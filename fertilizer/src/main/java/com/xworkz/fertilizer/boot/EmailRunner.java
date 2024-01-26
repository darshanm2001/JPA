package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.EmailEntity;
import com.xworkz.fertilizer.repo.EmailRepositry;
import com.xworkz.fertilizer.repo.EmailRepositryImpl;

import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity emailEntity=new EmailEntity(1,"gmail","darshan","veeresh","Interview schedule", LocalDate.of(2012,06,14),"yes");
        EmailRepositry  emailRepositry=new EmailRepositryImpl();
        emailRepositry.save(emailEntity);
    }
}
