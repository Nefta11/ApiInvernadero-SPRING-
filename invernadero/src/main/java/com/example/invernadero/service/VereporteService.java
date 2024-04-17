package com.example.invernadero.service;

import com.example.invernadero.dto.VerreporteDTO;
import com.example.invernadero.repository.VerreporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VereporteService {

    @Autowired
    private VerreporteRepository verreporteRepository;

    public List<VerreporteDTO> getAllVerreporte() {
        return verreporteRepository.findAllCustom();
    }
}
