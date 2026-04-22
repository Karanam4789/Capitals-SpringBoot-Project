package org.example.capitals.service;

import org.example.capitals.Entity.Capitals;
import org.example.capitals.repository.CapitalRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapitalsServiceImpl implements CapitalsDataServiceInterface {
    @Autowired
    private CapitalRepoInterface repo;
    @Override
    public List<Capitals> TotalCapitalsAndStateDetails() {
        return repo.findAll();
    }

    @Override
    public String addCapital(Capitals capital) {
        Capitals cap=repo.save(capital);
        return "Capital with Id "+cap.getCapitalId()+" is added to the database.";
    }
}
