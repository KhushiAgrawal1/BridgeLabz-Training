package com.json_practice;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Toyota", "Innova", 2022);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}

