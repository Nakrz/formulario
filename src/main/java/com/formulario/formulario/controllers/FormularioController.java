package com.formulario.formulario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.formulario.formulario.models.Usuario;


@Controller
public class FormularioController {

    @GetMapping("/formulario")
    public String showFormulario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "formulario";
    }



    @PostMapping("/submitFormu")
    @ResponseBody
    public String submitFormu(@RequestBody Usuario usuario){
        return "Eres un crack, estos son los datos que ingresaste: \n\n" + "\nNombre: " + usuario.getNombre() + "\nApellido: " + usuario.getApellido() + "\nEmail: " + usuario.getEmail();
    }

    
}
