/*package com.sesi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.dto.PagamentoDto;
import com.sesi.projeto.entities.Pagamento;
import com.sesi.projeto.repositories.PagamentoRepositories;

@RestController
@RequestMapping(value = "pagamento")
public class PagamentoController {

    @Autowired
    PagamentoRepositories repo;

    @GetMapping
    public ResponseEntity<List<Pagamento>> mostraTodos() {
        List<Pagamento> pagamentos = repo.findAll();
        return ResponseEntity.ok(pagamentos); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> mostrarPorId(@PathVariable Long id) {
        Pagamento pag = repo.findById(id).orElse(null);
        if (pag == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pag);
    }

    @PostMapping
    public ResponseEntity<Pagamento> criar(@RequestBody PagamentoDto dto) {
        Pagamento pag = new Pagamento(dto);
        pag = repo.save(pag);  
        return ResponseEntity.ok(pag);  
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pagamento> atualizar(@PathVariable Long id, @RequestBody PagamentoDto dto) {
        Pagamento pag = repo.findById(id).orElse(null);
        if (pag == null) {
            return ResponseEntity.notFound().build();
        }
        pag.setMomento(dto.momento());
        pag = repo.save(pag);  
        return ResponseEntity.ok(pag);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Pagamento pag = repo.findById(id).orElse(null);
        if (pag == null) {
            return ResponseEntity.notFound().build();
        }
        repo.delete(pag);  
        return ResponseEntity.noContent().build();
    }
}*/
