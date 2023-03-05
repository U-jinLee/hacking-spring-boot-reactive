package com.greglturnquist.hackingspringboot.reactive;

import com.mongodb.client.model.geojson.Point;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Item {
    private @Id String id;
    private String name;
    private String description;
    private double price;
    private String distributorRegion;
    private Date releaseDate;
    private Integer availableUnits;
    private Point location;
    private Boolean active;

    private Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
