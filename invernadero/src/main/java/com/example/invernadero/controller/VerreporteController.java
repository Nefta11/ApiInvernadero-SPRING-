package com.example.invernadero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.example.invernadero.dto.VerreporteDTO;
import com.example.invernadero.service.VereporteService;

@RestController
@RequestMapping("api/control/v1/vereporte")
@CrossOrigin(origins = "http://127.0.0.1:5500" )
public class VerreporteController {

    @Autowired
    private VereporteService reporteService;

    @GetMapping
    public ResponseEntity<List<VerreporteDTO>> getAllVerreporte() {
        List<VerreporteDTO> verreporteDTOs = reporteService.getAllVerreporte()
                .stream()
                .map(reporte -> new VerreporteDTO(reporte.getId_reporte(), reporte.getFecha(), reporte.getHora(), reporte.getObservaciones()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(verreporteDTOs, HttpStatus.OK);
    }
    
}
