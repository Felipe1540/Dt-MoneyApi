package facultech.projetorestapi.controller;

import facultech.projetorestapi.model.UsuarioModel;
import facultech.projetorestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/api/usuario/logar")
    public boolean consultar (@RequestBody UsuarioModel user ) {
        List<UsuarioModel> users = (List<UsuarioModel>) repository.findAll();
        for (UsuarioModel item: users ){
            if (item.login == user.login & item.senha == user.senha){
                return true;
            }
        }
        return false;
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }

}
