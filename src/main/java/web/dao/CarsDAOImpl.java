package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDAOImpl implements CarsDAO{

    private final List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("Model1", 1500, 2000));
        carList.add(new Car("Model2", 2000, 2019));
        carList.add(new Car("Model3", 4000, 2022));
        carList.add(new Car("Model4", 3000, 2021));
        carList.add(new Car("Model5", 4500, 2023));
    }

    @Override
    public List<Car> getListCars(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
