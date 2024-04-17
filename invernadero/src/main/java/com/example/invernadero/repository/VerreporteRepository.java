package com.example.invernadero.repository;

import com.example.invernadero.dto.VerreporteDTO;
import com.example.invernadero.models.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VerreporteRepository extends JpaRepository<Reporte, Long> {
    @Query("SELECT new com.example.invernadero.dto.VerreporteDTO(r.id_reporte, r.fecha, r.hora, r.observaciones) FROM Reporte r")
    List<VerreporteDTO> findAllCustom();
}
