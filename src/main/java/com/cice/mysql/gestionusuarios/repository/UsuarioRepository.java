package com.cice.mysql.gestionusuarios.repository;

import com.cice.mysql.gestionusuarios.repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    @Query(value = "SELECT id FROM usuario WHERE usuario.user = :user AND usuario.pass = :pass", nativeQuery = true)
    Long buscarUsuarioByLogin(@Param(value = "user") String user, @Param(value = "pass") String pass);

    @Query(value = "INSERT INTO usuario (user, pass) VALUES(:user, :pass)", nativeQuery = true)
    Long crearNuevoUsuario(@Param(value = "user") String user, @Param(value = "user") String pass);
}
