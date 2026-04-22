package org.example.capitals.service;

import org.example.capitals.Entity.Capitals;

import java.util.List;

public interface CapitalsDataServiceInterface {
    public List<Capitals> TotalCapitalsAndStateDetails();
    public String addCapital(Capitals capital);
}
