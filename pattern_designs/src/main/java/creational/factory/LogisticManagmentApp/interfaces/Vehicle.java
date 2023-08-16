package creational.factory.LogisticManagmentApp.interfaces;

import creational.factory.LogisticManagmentApp.model.Package;
import java.util.List;

/*
 * First is important to define a Interface that will hell us to define the behavior 
 * for each vehicle since all of them are part of the same kind however each has its own 
 * way to interpretation 
 */
public interface Vehicle<T>
{
    public T deliverPackage();

    public void collectPackage();

    String driversName = null;
    String plate = null;
    String model = null;
    List<Package> packages = null;
    Integer capacity = null;

}
