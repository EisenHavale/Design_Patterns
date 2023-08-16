package creational.factory.LogisticManagmentApp.model.vehicles;

import creational.factory.LogisticManagmentApp.interfaces.Vehicle;
import creational.factory.LogisticManagmentApp.model.Package;
import creational.factory.LogisticManagmentApp.model.transportationType.Transportation;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Truck implements Vehicle
{

    private String driversName;
    private String plate;
    private String model;
    private List<Package> packages;
    private Integer capacity;


    @Override
    public Object deliverPackage()
    {
        return null;
    }

    @Override
    public void collectPackage()
    {

    }
}
