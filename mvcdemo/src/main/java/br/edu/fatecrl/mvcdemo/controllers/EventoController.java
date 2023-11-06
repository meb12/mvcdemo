package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/evento")
public class EventoController {
    private static final List<Evento> eventos = new ArrayList<Evento>();

public EventoController()
{
    eventos.add(new Evento("Luan Sanatana"," Praia Grande","11/02/2024"));
    eventos.add(new Evento("Lexa         "," Santos      ","12/02/2024"));
    eventos.add(new Evento("Gusttavo Lima"," São Vicente ","13/02/2024"));
}
@GetMapping
public String getEventos(Model model)
    {
        model.addAttribute("eventos",eventos);
        return "eventos";
    }
}

