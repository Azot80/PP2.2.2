package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Car Producer One", "Car Model"));
        carList.add(new Car(2, "Car Producer Two", "Car Model"));
        carList.add(new Car(3, "Car Producer Three", "Car Model"));
        carList.add(new Car(4, "Car Producer Four", "Car Model"));
        carList.add(new Car(5, "Car Producer Five", "Car Model"));
    }

    public List<Car>getCarList(int numCars) {
        return carList.stream().limit(numCars).toList();
    }
}
