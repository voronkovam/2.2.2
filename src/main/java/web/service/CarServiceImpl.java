package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.dao.CarsDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    CarsDAO carsDAO;

    @Autowired
    public CarServiceImpl(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }


    @Override
    public List<Car> getListCars(int count) {
        return carsDAO.getListCars(count);
    }

}
