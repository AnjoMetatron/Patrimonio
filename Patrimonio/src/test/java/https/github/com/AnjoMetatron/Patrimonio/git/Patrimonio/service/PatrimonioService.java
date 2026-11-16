package https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.service;
import https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.model.Patrimonio;
import https.github.com.AnjoMetatron.Patrimonio.git.Patrimonio.repository.PatrimonioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PatrimonioService {
@Autowired

private PatrimonioRepository repository;
public List<Patrimonio> listarTodos(){
    return repository.findAll();
};

    public Optional<Patrimonio>BuscarPorId(Long Id){
      return repository.findById(Id);
    };

    public Patrimonio Salvar(Patrimonio patrimonio){
      return repository.save(patrimonio);
    };

    public void  Deletar(Long Id){
        repository.deleteById(Id);
    };
















}
