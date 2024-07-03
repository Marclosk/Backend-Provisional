package com.FireAlert.service;

import com.FireAlert.repositories.Icrud;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Icrud icrud;
}
