package org.example.capitals.RunnerClass;

import org.example.capitals.Entity.Capitals;
import org.example.capitals.service.CapitalsDataServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CapitalRunnerClass implements CommandLineRunner {
    @Autowired
    private CapitalsDataServiceInterface service;
    @Override
    public void run(String... args) throws Exception {
       List<Capitals> list=service.TotalCapitalsAndStateDetails();
       list.forEach(System.out::println);
       Capitals cap = new Capitals(2,"North Carolina","Raleigh","USA");
        System.out.println(service.addCapital(cap));
    }
}
