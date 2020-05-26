package com.micanasta.dto;

import com.micanasta.model.RolPorUsuarioIdentity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FamiliaBusquedaMiembrosDto {

    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

}
