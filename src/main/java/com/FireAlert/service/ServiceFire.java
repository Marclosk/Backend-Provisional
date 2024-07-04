package com.FireAlert.service;

import com.FireAlert.models.Coordinate;
import com.FireAlert.models.Data;
import com.FireAlert.models.Fire;
import com.FireAlert.repositories.Icrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceFire {

        @Autowired
        Icrud icrud;

        public Coordinate findCoordinate(int id){
            Fire fire = icrud.findById(id).orElseThrow();
            Coordinate coordinate = new Coordinate(fire.getLatitude(), fire.getLongitude());
            return coordinate;
        }
        public Data findData(int id){
            Fire fire = icrud.findById(id).orElseThrow();
            Data data1 = new Data(fire.getName(), fire.getPhone(),fire.getMessage());
            return data1;
        }

        public ArrayList<Fire> getAllFires(){
            return (ArrayList<Fire>) icrud.findAll();
        }

        public void deleteAllFires() {
            icrud.deleteAll();
        }

        public void deleteFireById(int id) {
            icrud.deleteById(id);
        }

        public Fire createFire(Fire newFire) {
            return icrud.save(newFire);
        }
}
