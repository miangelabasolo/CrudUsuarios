package com.crud.usuarios.api.service;

import java.util.ArrayList;

public class UsuarioServiceImplMiguel implements UsuarioServiceMiguel{
    ArrayList lista = new ArrayList();

    @Override
    public void setUsuario(String au) {
        lista.add(au);
        System.out.println("Tamaño de ArrayList después de agregar elementos:"+ lista.size());
    }

    @Override
    public void removerUsuario(int numero) {
        lista.remove(numero);
        System.out.println("Lista de todos los elementos:" + lista);
    }

    @Override
    public void getUsuarios() {
        System.out.println("Lista de todos los usuarios:" + lista);
    }

    @Override
    public void actualizaPosicion(int n, String s) {
        lista.remove(n);
        lista.add(n, s);
    }
}
