package com.FireAlert.controllers;

import com.FireAlert.models.Coordinate;
import com.FireAlert.models.Data;
import com.FireAlert.models.Fire;
import com.FireAlert.service.ServiceFire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controllers {
        @Autowired
        ServiceFire serviceFire;

        @GetMapping(path = "/getAll")
        public ArrayList<Fire> getAllFires(){
            return serviceFire.getAllFires();
        }

        @GetMapping(path = "/getCoordinate/{id}")
        public Coordinate findByTitle(@PathVariable int id){
            return serviceFire.findCoordinate(id);
        }
        @GetMapping(path = "/getData/{id}")
        public Data findByTitlePersonalData(@PathVariable int id){
            return serviceFire.findData(id);
        }

        @DeleteMapping(path = "/deleteAll")
        public void deleteAllFires(){
            serviceFire.deleteAllFires();
        }

        @DeleteMapping(path = "/delete/{id}")
        public void deleteFireById(@PathVariable int id){
            serviceFire.deleteFireById(id);
        }

        @PostMapping(path = "/add")
        public Fire createFire(@RequestBody Fire newFire){
            return serviceFire.createFire(newFire);
        }
    }
