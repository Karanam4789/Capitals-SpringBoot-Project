package org.example.capitals.controller;

import org.example.capitals.Entity.Capitals;
import org.example.capitals.service.CapitalsDataServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capitals")
public class CapitalsControllerImpl implements CapitalsControllerInterface{
    @Autowired
    private CapitalsDataServiceInterface service;

    @Override
    @GetMapping("/AllStatesAndCapitals")
    public List<Capitals> allCapitalsData() {
        return service.TotalCapitalsAndStateDetails();
    }

    @Override
    @PostMapping("/addNewCapitalData")
    public ResponseEntity<String> addNewCapitalData(@RequestBody Capitals capital) {
        String mesg = service.addCapital(capital);
        return new ResponseEntity<>(mesg, HttpStatus.CREATED);
    }
}
