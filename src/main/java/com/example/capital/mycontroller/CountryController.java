package com.example.capital.mycontroller;

import com.example.capital.CapitalService.IcapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
 IcapitalService icapitalService;
    @GetMapping("/getCountryList")
    public List<String> getCountryList(){
        return icapitalService.getCountryList();
    }
    @GetMapping("/getCapitalsList/{Country}")

   public  String getCapitalsList(@PathVariable String Country){
        return icapitalService.getCapitalList(Country);
   }


}
