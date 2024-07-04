package com.FireAlert.models;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Data {
        private String name;
        private int phone;
        private String message;
    public Data(String name, int phone, String message) {
        //   this.id = id;
        this.name = name;
        this.phone = phone;
        this.message = message;
    }
}
