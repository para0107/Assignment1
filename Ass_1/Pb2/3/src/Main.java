import domain.Car;
import repository.Car_Res;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Peugeot", 2003, 70);
        Car c2 = new Car("Mazda", 2010, 200);
        Car c3 = new Car("Volvo", 2020, 150);
        Car c4 = new Car("Insigna", 2010, 100);
        Car c5 = new Car("GWagon", 2024, 500);
//        System.out.println(c1);
//        c1.tune_car();
//        System.out.println(c1);
        Car_Res cars = new Car_Res(null);
        cars.add_car(c1);
        cars.add_car(c2);
        cars.add_car(c3);

        cars.add_car(c1);
        cars.cancel_reservation(c3);
        System.out.println(cars);



    }
}