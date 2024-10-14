package repository;
import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Car_Res {
     ArrayList<Car> list = null;

    public Car_Res(List<Car> list) {
        this.list = new ArrayList<>();
    }

    public void add_car(Car c)
    {
        if (c.isAvaliable())
        { list.add(c);
            c.setAvaliable(false);}
        else
            System.out.println("This "+c+" car is unavaliable");

    }
    public void cancel_reservation(Car c)
    {
        if(!c.isAvaliable())
        {
            list.remove(c);
            c.setAvaliable(true);
        }
        else
            System.out.println("This car is not reserved");
    }


    @Override
    public String toString() {
        return "Car_Res{" +
                "list=" + list +
                '}';
    }
}

