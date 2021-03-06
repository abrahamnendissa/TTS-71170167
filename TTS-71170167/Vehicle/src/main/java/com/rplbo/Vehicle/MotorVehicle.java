package com.rplbo.Vehicle;

public abstract class MotorVehicle implements Vehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmision;

    public MotorVehicle(){
        this.vehicleName = vehicleName;
        this.engine = engine;
        this.tire = tire;
        this.wheel = wheel;
        this. transmision = transmision;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire getTire() {
        return tire;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public String getVehicleName() {

        return vehicleName;
    }

    public Wheel getWheel() {

        return wheel;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmision(Transmision transmition) {
        this.transmision = transmition;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

 }
