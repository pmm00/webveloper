package com.iesemilidarder.webveloper.controller;

import com.iesemilidarder.webveloper.data.DataHelper;
import com.iesemilidarder.webveloper.data.Hotel;
import com.iesemilidarder.webveloper.data.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class YouthinkRestController {


    @RequestMapping("/hotel")
    public Producto getHotel(@RequestParam(value = "name", defaultValue = "Hotel Saratoga") String name) {
        Hotel hotel = new Hotel();
        hotel.setTitulo(name);
        DataHelper.list.add(hotel);
        return hotel;
    }

    @RequestMapping("/getAll")
    public List<Producto> getList() {
        return DataHelper.list;
    }
}

