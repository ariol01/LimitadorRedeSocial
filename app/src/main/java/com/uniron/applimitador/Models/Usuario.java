package com.uniron.applimitador.Models;

import android.content.Context;

import com.uniron.applimitador.Repository.UsuarioRepository;

import org.w3c.dom.Text;

public class Usuario {


    private  Integer id;
    private String nome;
    private Context _context;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void Insert(Context _context){

        UsuarioRepository u = new UsuarioRepository(_context);
        u.Insert(this);
    }


}
