package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {
    private CarDao carDao;
    public CarController(CarDao carDao) {this.carDao = carDao;}

    @GetMapping(value = "/cars")
    public String indexCar(@RequestParam(value="count", required = false, defaultValue= "5") int count, ModelMap model) {
        model.addAttribute("countCars", carDao.getCarList(count));
        return "cars";
    }
}