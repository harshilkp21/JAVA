package Unit2;

import java.util.*;

class Vehicle
{
    String registrationNumber;
    String color;
    String typeOfVehicle;

    public Vehicle(String registrationNumber,String color,String typeOfVehicle)
    {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.typeOfVehicle = typeOfVehicle;
    }
}

class Car extends Vehicle
{
    String make;
    int CC;
    String fuelType;

    public Car(String registrationNumber, String color, String typeOfVehicle,String make, int CC, String fuelType)
    {
        super(registrationNumber, color, typeOfVehicle);
        this.make = make;
        this.CC = CC;
        this.fuelType = fuelType;
    }
}

class Truck extends Vehicle
{
    String make;
    int CC;
    String fuelType;

    public Truck(String registrationNumber, String color, String typeOfVehicle,String make, int CC, String fuelType)
    {
        super(registrationNumber, color, typeOfVehicle);
        this.make = make;
        this.CC = CC;
        this.fuelType = fuelType;
    }
}

class motorCycle extends Vehicle
{
    String make;
    int CC;
    String fuelType;

    public motorCycle(String registrationNumber, String color, String typeOfVehicle,String make, int CC, String fuelType)
    {
        super(registrationNumber, color, typeOfVehicle);
        this.make = make;
        this.CC = CC;
        this.fuelType = fuelType;
    }
}

public class VehicleTest {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Car Details: ");
        System.out.print("Registration Number: ");
        String carRegNum = s.nextLine();
        System.out.print("Color: ");
        String carColor = s.nextLine();
        System.out.print("Type of Vehicle: ");
        String carType = s.nextLine();
        System.out.print("Make: ");
        String carMake = s.nextLine();
        System.out.print("CC: ");
        int carCC = s.nextInt();
        s.nextLine();
        System.out.println("Fuel Type: ");
        String carFuelType = s.nextLine();

        Car car = new Car(carRegNum, carColor, carType, carMake, carCC,carFuelType);
       
       
        System.out.println("\nEnter truck details:");
        System.out.print("Registration Number: ");
        String truckRegNum = s.nextLine();
        System.out.print("Color: ");
        String truckColor = s.nextLine();
        System.out.print("Type of Vehicle: ");
        String truckType = s.nextLine();
        System.out.print("Make: ");
        String truckMake = s.nextLine();
        System.out.print("CC: ");
        int truckCC = s.nextInt();
        s.nextLine();
        System.out.print("Fuel Type: ");
        String truckFuelType = s.nextLine();

        Truck truck = new Truck(truckRegNum, truckColor, truckType, truckMake,truckCC, truckFuelType);

        System.out.println("\nEnter motorcycle details:");
        System.out.print("Registration Number: ");
        String motorcycleRegNum = s.nextLine();
        System.out.print("Color: ");
        String motorcycleColor = s.nextLine();
        System.out.print("Type of Vehicle: ");
        String motorcycleType = s.nextLine();
        System.out.print("Make: ");
        String motorcycleMake = s.nextLine();
        System.out.print("CC: ");
        int motorcycleCC = s.nextInt();
        s.nextLine(); // Consume newline character
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = s.nextLine();


        motorCycle motorcycle = new motorCycle(motorcycleRegNum,motorcycleColor, motorcycleType, motorcycleMake, motorcycleCC, motorcycleFuelType);

        s.close();


        System.out.println("\nCar Details:");
        System.out.println("Registration Number: " + car.registrationNumber);
        System.out.println("Color: " + car.color);
        System.out.println("Type of Vehicle: " + car.typeOfVehicle);
        System.out.println("Make: " + car.make);
        System.out.println("CC: " + car.CC);
        System.out.println("Fuel Type: " + car.fuelType);
        System.out.println("\nTruck Details:");
        System.out.println("Registration Number: " + truck.registrationNumber);
        System.out.println("Color: " + truck.color);
        System.out.println("Type of Vehicle: " + truck.typeOfVehicle);
        System.out.println("Make: " + truck.make);
        System.out.println("CC: " + truck.CC);
        System.out.println("Fuel Type: " + truck.fuelType);
        System.out.println("\nMotorcycle Details:");
        System.out.println("Registration Number: " + motorcycle.registrationNumber);
        System.out.println("Color: " + motorcycle.color);
        System.out.println("Type of Vehicle: " + motorcycle.typeOfVehicle);
        System.out.println("Make: " + motorcycle.make);
        System.out.println("CC: " + motorcycle.CC);
        System.out.println("Fuel Type: " + motorcycle.fuelType);

    }
}
