package ss5_thuc_hanh;

public class MainStaticProperty {
    public static void main(String[] args) {

        StaticProperty.Car car1 = new StaticProperty.Car("Mazda 3","Skyactiv 3");

        System.out.println(StaticProperty.Car.numberOfCars);

        StaticProperty.Car car2 = new StaticProperty.Car("Mazda 6","Skyactiv 6");

        System.out.println(StaticProperty.Car.numberOfCars);

    }

}
