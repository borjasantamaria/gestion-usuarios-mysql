package com.cice.mysql.gestionusuarios.service.impl;

import com.cice.mysql.gestionusuarios.controller.dto.UsuarioDTO;
import com.cice.mysql.gestionusuarios.repository.UsuarioRepository;
import com.cice.mysql.gestionusuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl  implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Long buscarUsuarioByLogin(UsuarioDTO usuarioDTO){
       return usuarioRepository.buscarUsuarioByLogin(usuarioDTO.getUser(), usuarioDTO.getPass());
    }
}
