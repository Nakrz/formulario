package com.formulario.formulario.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.formulario.formulario.models.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/usuario")


public class FomularioRestController {

    @GetMapping("/lista")
    public List<Usuario> listIndex() {
        Usuario usuario = new Usuario("Tribilin", "SSJ", "Holatio@gmail.com");
        
        List<Usuario> listUsuarios = new ArrayList<>();
        listUsuarios.add(usuario);
        return listUsuarios;
    }


}
