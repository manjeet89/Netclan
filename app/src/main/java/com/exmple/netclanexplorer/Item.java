package com.exmple.netclanexplorer;

public class Item {
    String name, location, position, charges, prelocation,applyting;

    public Item(String name, String location, String position, String charges, String prelocation, String applyting) {
        this.name = name;
        this.location = location;
        this.position = position;
        this.charges = charges;
        this.prelocation = prelocation;
        this.applyting = applyting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getPrelocation() {
        return prelocation;
    }

    public void setPrelocation(String prelocation) {
        this.prelocation = prelocation;
    }

    public String getApplyting() {
        return applyting;
    }

    public void setApplyting(String applyting) {
        this.applyting = applyting;
    }
}



