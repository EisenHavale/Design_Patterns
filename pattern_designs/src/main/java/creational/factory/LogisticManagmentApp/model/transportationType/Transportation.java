package creational.factory.LogisticManagmentApp.model.transportationType;

import creational.factory.LogisticManagmentApp.interfaces.Vehicle;
import creational.factory.LogisticManagmentApp.model.Package;
import java.util.List;

public abstract class Transportation
{
    private String driversName;
    private String plate;
    private String model;
    private List<Package> packages;
    private Integer capacity;

    public abstract Vehicle createTransportation();
}
