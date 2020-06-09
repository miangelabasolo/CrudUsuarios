package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Usuario;

import java.util.List;

public interface UsuarioServiceMiguel {

    void setUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    List<Usuario> getUsuarios();
    void actualizaPosicion(int position, Usuario usuario);
    void imprimeUsuarios(List<Usuario> lista);
}
