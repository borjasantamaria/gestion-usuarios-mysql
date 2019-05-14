package com.cice.mysql.gestionusuarios.service;

import com.cice.mysql.gestionusuarios.controller.dto.UsuarioDTO;

public interface UsuarioService {


    /**
     *
     * @param usuarioDTO
     */
    Long buscarUsuarioByLogin(UsuarioDTO usuarioDTO);
}
