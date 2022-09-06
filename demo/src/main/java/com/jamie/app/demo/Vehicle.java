package com.jamie.app.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Vehicle {

    @Id
    private Integer vehicleNumber;

    private String supplyGroupCode;

    private Date notionalDeliveryDate;

    public Integer getVehicleNumber() { return vehicleNumber; }

    public void setVehicleNumber(Integer vehicleNumber) {this.vehicleNumber = vehicleNumber;}

    public String getSupplyGroupCode() {
        return supplyGroupCode;
    }

    public void setSupplyGroupCode(String supplyGroupCode) {
        this.supplyGroupCode = supplyGroupCode;
    }

    public Date getNotionalDeliveryDate() {
        return notionalDeliveryDate;
    }

    public void setNotionalDeliveryDate(Date notionalDeliveryDate) {
        this.notionalDeliveryDate = notionalDeliveryDate; }
}
