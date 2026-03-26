package model;

import java.time.LocalDate;

public abstract class Item extends Entity {
    protected String name;
    protected String description;
    protected double startingPrice;
    protected double currentHighestPrice;
    protected LocalDate startTime;
    protected LocalDate endTime;

    public Item(String name, String description, double startingPrice, double currentHighestPrice, LocalDate startTime, LocalDate endTime) {
        super();
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.currentHighestPrice = startingPrice;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double getCurrentHighestPrice() {
        return currentHighestPrice;
    }

    public void setCurrentHighestPrice(double currentHighestPrice) {
        this.currentHighestPrice = currentHighestPrice;
    }

    public String getName() {
        return name;
    }

    public abstract void PrintInfo();
}
