package org.example.capitals.controller;

import org.example.capitals.Entity.Capitals;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CapitalsControllerInterface {

    public List<Capitals> allCapitalsData();

    public ResponseEntity<String> addNewCapitalData(Capitals capital);
}
