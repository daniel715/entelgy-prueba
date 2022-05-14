package com.example.demo.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.service.IDataService;
import com.example.demo.modelo.*;
import com.example.demo.controlador.IDataControlador;

@RequestMapping("/datos")
@RestController
@Component
public class DataControlador implements IDataControlador {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IDataService datoService;

    @Override
    @PostMapping
    public ResponseEntity<dataFormateada> obtenerDatos() {
        dataFormateada salida = datoService.obtenerDatos();
        return new ResponseEntity<>(salida, HttpStatus.CREATED);
    }
}
