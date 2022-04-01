package com.example.capital.CapitalService;

import java.util.List;

public interface IcapitalService {
    public List<String> getCountryList();
    public String getCapitalList(String country);

}
