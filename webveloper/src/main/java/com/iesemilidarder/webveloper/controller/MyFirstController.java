package com.iesemilidarder.webveloper.controller;

import com.iesemilidarder.webveloper.data.Hotel;
import com.iesemilidarder.webveloper.data.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class MyFirstController {
    @RestController
    public class MyFirstController {



        @RequestMapping("/car")
        public Producto getHotel(@RequestParam(value="name", defaultValue="brumbrum") String name) {


            Hotel hotel = new Hotel();
            hotel.setTitulo(name);
            return hotel;
        }
    }

}
