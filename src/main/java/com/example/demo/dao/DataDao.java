package com.example.demo.dao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.modelo.ApiData;
@Component
public class DataDao implements IDataDao {

    @Autowired
    private RestTemplate restTemplate;

	@Override
    public ApiData obtenerDatos() {
        String url = "https://reqres.in/api/users";
        //RestTemplate restTemplate = new RestTemplate();
        ApiData entrada = restTemplate.getForObject(url, ApiData.class);
        return entrada;
    }
}
