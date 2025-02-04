/*package com.sesi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sesi.projeto.dto.PedidoDto;
import com.sesi.projeto.entities.Pedido;
import com.sesi.projeto.repositories.PedidoRepositories;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    PedidoRepositories repo;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Pedido>> mostrarTodos() {
        List<Pedido> pedidos = repo.findAll();
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        Pedido pedido = repo.findById(id).orElse(null);
        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedido);
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Pedido> registrarPedido(@RequestBody PedidoDto dto) {
        Pedido pedido = new Pedido(dto);
        pedido = repo.save(pedido); 
        return ResponseEntity.ok(pedido);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.ok("Pedido deletado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping(value = "/atualizar/{id}")
    public ResponseEntity<Pedido> atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedidoAtualizado) {
        Pedido pedido = repo.findById(id).orElse(null);
        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }
        pedido.setMomento(pedidoAtualizado.getMomento());
        pedido.setstatus(pedidoAtualizado.getstatus());
        pedido = repo.save(pedido); 
        return ResponseEntity.ok(pedido);
    }
}*/
