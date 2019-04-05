//package ru.home.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//import ru.home.form.CarForm;
//import ru.home.model.Car;
//import ru.home.services.CarService;
//
//import java.util.List;
//
//@Component
//public class CarsController {
//
//    @Autowired
//    private CarService carService;
//
//    @GetMapping("/car")
//    public ModelAndView getCarPage(){
//        List<Car> allCar = carService.getAllCar();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("cars", allCar);
//        modelAndView.setViewName("car_page");
//        return modelAndView;
//    }
//
//    @PostMapping("/car")
//    public String addNewCar(CarForm form){
//        carService.addCar(form);
//        return "redirect:/car";
//    }
//}
