package com.rplbo.Vehicle;

public class Main {
    public static void main(String[] args) {
        Engine dieselEngine = new Engine("Solar", 3500);
        Transmision manualTransmision = new Transmision("Manual", 6);
        Tire trailTire = new Tire("Trail", 309, 70, 20);
        Wheel truckWheel = new Wheel(8, 18);
        Truck truckHino = new Truck(dieselEngine, manualTransmision, trailTire, truckWheel, 4500);
        truckHino.setEngine(dieselEngine);
        truckHino.setVehicleName("HINO DUTRO CARGO 110 SD");
        System.out.println("CC mesin: "+ truckHino.getEngine().getCapacity());
        truckHino.setTransmision(manualTransmision);
        System.out.println("Tipe transmisi: "+ truckHino.getTransmision().getTransType());
        truckHino.setTire(trailTire);
        System.out.println("Tipe Ban : "+ truckHino.getTire().getTireType());
        truckHino.setWheel(truckWheel);
        System.out.println("Diameter Roda : R"+ truckHino.getWheel().getDiameter());
    }
}
