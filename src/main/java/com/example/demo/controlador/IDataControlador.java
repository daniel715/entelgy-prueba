package com.example.demo.controlador;

import org.springframework.http.ResponseEntity;


import com.example.demo.modelo.dataFormateada;

public interface IDataControlador {

	ResponseEntity<dataFormateada> obtenerDatos();

}
