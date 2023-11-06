package br.edu.fatecrl.mvcdemo.controllers;
import br.edu.fatecrl.mvcdemo.models.Evento;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("api/eventos")
public class DadosController {
    private static final List<Evento> eventos = new ArrayList<Evento>();

    public DadosController()
    {
        eventos.add(new Evento("Luan Sanatana"," Praia Grande","11/02/2024"));
        eventos.add(new Evento("Lexa         "," Santos      ","12/02/2024"));
        eventos.add(new Evento("Gusttavo Lima"," São Vicente ","13/02/2024"));
    }

    @GetMapping
    public List<Evento> getAlunos()
    {
        return eventos;
    }

}
