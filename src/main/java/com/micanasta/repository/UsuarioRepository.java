package com.micanasta.repository;

import com.micanasta.dto.UsuarioDto;
import com.micanasta.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {
    Usuario findByDni(String dni);
}
