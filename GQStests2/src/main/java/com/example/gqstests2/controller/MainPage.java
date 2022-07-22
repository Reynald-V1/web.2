package com.example.gqstests2.controller;

import com.example.gqstests2.model.Sapatos;
import com.example.gqstests2.service.SapatosService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.List;
@Controller
public class MainPage {

    private final SapatosService service;

    public MainPage(SapatosService service ) {
        this.service = service;

    }


    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/index")
    public String home(Model model) throws IOException {
        List<Sapatos> sapatos = service.findAll();
        model.addAttribute("sapatos", sapatos);

        return "index";
    }

    @GetMapping("/cadastra")
    public String cadastraSap(Model model){
        Sapatos sapato = new Sapatos();
        model.addAttribute("sapato", sapato);
        return "cadastra";
    }
    @GetMapping("/update/{id}")
    public String updateSap(Model model, @PathVariable Long id){
        Sapatos sapato = service.findById(id);
        model.addAttribute("sapato", sapato);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String DeleteSap(Model model, @PathVariable Long id){
        service.delete(id);
        return "redirect:/index";
    }

    @PostMapping("salvar")
    public String SalvaSapato(@ModelAttribute Sapatos sapato){
        service.update(sapato);
        return "redirect:/index";
    }

}

