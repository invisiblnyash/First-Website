package com.example.First.Website.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class city {
    @Id
    private int  id;
    private int population;
    private int size;
    private String name;
    private int AvgHousePrice;



    @Override
    public String toString() {
        return "city{" +
                "id=" + id +
                ", population=" + population +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", AvgHousePrice=" + AvgHousePrice +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgHousePrice() {
        return AvgHousePrice;
    }

    public void setAvgHousePrice(int avgHousePrice) {
        AvgHousePrice = avgHousePrice;
    }

    public city() {
    }

    public city(int id, int population, int size, String name, int avgHousePrice) {
        this.id = id;
        this.population = population;
        this.size = size;
        this.name = name;
        AvgHousePrice = avgHousePrice;
    }
}
