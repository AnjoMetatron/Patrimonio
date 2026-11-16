package https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.controller.Patrimonio;

import https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.model.Patrimonio;
import https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("/patrimonios")
public class PatrimonioController {
@Autowired

    private PatrimonioService service;

@GetMapping

public String listar(Model model){
model.addAttribute("listarPatrimonios",service.listarTodos());
return "lista";

}
@GetMapping("/novo")

public String novoFormulario(Model model){
 model.addAttribute("patrimonio",new Patrimonio());
 return "formulario";
}

@GetMapping("/editar/{id}")

public String editarFormulario(@PathVariable("id") Long id, Model model){
    Optional<Patrimonio> patrimonio = service.BuscarPorId(id);

    if(patrimonio.isPresent() ){
model.addAttribute("patrimonio",patrimonio.get());
return "formulario";

    }
    return "redirect:/patrimonios";
}

@PostMapping("/salvar")
    public String salvar(@ModelAttribute("patrimonio") Patrimonio patrimonio){
    service.Salvar(patrimonio);
    return "redirect:/patrimonios";

}
@GetMapping("/excluir")

public String excluir (@PathVariable("id") Long id){
    service.Deletar(id);
    return "redirect:/patrimonios";

}






}
