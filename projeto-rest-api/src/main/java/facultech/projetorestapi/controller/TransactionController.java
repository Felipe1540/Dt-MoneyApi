package facultech.projetorestapi.controller;
import facultech.projetorestapi.model.TransactionModel;
import facultech.projetorestapi.model.UsuarioModel;
import facultech.projetorestapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumns;
import java.util.Collections;
import java.util.List;


@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository repository;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/api/transaction/{codigo}")
    public List<TransactionModel> consultar (@PathVariable("codigo") Integer codigo){
        return (List<TransactionModel>) repository.findAll();
    }

    @PostMapping(path = "/api/transaction/save")
    public TransactionModel salvar(@RequestBody TransactionModel transaction){
        return repository.save(transaction);
    }

}
