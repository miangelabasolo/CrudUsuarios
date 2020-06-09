package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImplMiguel implements UsuarioServiceMiguel{

    List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    @Override
    public void setUsuario(Usuario usuario) {
    this.listaUsuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        this.listaUsuarios.remove(((int) usuario.id)-1);

    }

    @Override
    public List<Usuario> getUsuarios() {

        return this.listaUsuarios;
    }

    @Override
    public void actualizaPosicion(int position, Usuario usuario) {
        this.listaUsuarios.add(position,usuario);

    }

    @Override
    public void imprimeUsuarios(List<Usuario> lista) {

        for (Usuario usuario: lista)
            System.out.println(usuario);
    }
}
