package cibertec.edu.pe.appCineCibertec.controller.administracion;

import cibertec.edu.pe.appCineCibertec.service.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;
    @GetMapping("/frmestado")
    public String index(Model model){
        model.addAttribute("listaestados", estadoService.listarEstados());
        return "administracion/frmestado";
    }
}
