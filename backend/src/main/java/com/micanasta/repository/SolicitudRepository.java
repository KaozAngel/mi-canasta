package com.micanasta.repository;

import com.micanasta.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    Optional<Solicitud> findBySolicitudIdentityUsuarioDni(String dni);
    Optional<Solicitud> findBySolicitudIdentityFamiliaId(Long idFamilia);
    List<Solicitud> findAllBySolicitudIdentityFamiliaId (Long id);
}
