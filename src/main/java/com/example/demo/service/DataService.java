package com.example.demo.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IDataDao;
import com.example.demo.modelo.ApiData;
import com.example.demo.modelo.dataFormateada;
import java.util.List;
@Component
public class DataService implements IDataService {
	   @Autowired
	    private IDataDao datoDAO;
	   
	@Override
	public dataFormateada obtenerDatos() {
        ApiData entrada = datoDAO.obtenerDatos();
        List<String> data = new ArrayList<>();
        String dataFormateada;
        for (int i = 0; i < entrada.getData().size(); i++) {
        	dataFormateada =
                    entrada.getData().get(i).getId() + "|"
                            + entrada.getData().get(i).getLast_name() + "|"
                            + entrada.getData().get(i).getEmail();
            data.add(dataFormateada);
        }
        dataFormateada salida = new dataFormateada();
        salida.setData(data);
        return salida;
	}

}
