package com.example.capital.CapitalService;

import com.example.capital.CapitalService.IcapitalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CountryService implements IcapitalService {
    @Override
    public List<String> getCountryList() {
        List<String> CountryList=new ArrayList<>();
        CountryList.add("India");
        CountryList.add("US");
        CountryList.add("china");
        return CountryList;
    }

    @Override
    public String getCapitalList(String country) {
        HashMap<String,String> CapitalsList=new HashMap<>();
        CapitalsList.put("India","NewDelhi");
        CapitalsList.put("US","Wasignton");
        CapitalsList.put("China","Bejing");
        return CapitalsList.get(country);
    }
}
