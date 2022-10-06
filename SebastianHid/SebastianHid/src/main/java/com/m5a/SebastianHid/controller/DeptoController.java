/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.SebastianHid.controller;


import com.m5a.SebastianHid.model.Depto;
import com.m5a.SebastianHid.service.DeptoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ISTA
 */
@RestController
@RequestMapping("/api/depto")
public class DeptoController {
    
    @Autowired
    DeptoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<Depto>> listar() {
        return new ResponseEntity<>(service.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Depto> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Depto> crear(@RequestBody Depto de) {
        return new ResponseEntity<>(service.save(de), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Depto> eliminar(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Depto> actualizar(@PathVariable Long id, @RequestBody Depto e) {
        Depto d = service.findById(id);
        if (d == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                d.setNombre(e.getNombre());
                d.setDireccion(e.getDireccion());
                d.setDescripcion(e.getDescripcion());
                
                return new ResponseEntity<>(service.save(e), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }
}
