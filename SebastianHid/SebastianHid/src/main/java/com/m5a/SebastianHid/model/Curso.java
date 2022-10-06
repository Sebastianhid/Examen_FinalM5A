/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.SebastianHid.model;

/**
 *
 * @author Default
 */
public class Curso {
    
    public Long curso_id;
    public String nombre;
    public String nivel;
    public String descripcion;
    public Profesor prof_id;
    public Curso(){
        
    }

    public Curso(Long curso_id, String nombre, String nivel, String descripcion, Profesor prof_id) {
        this.curso_id = curso_id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.prof_id = prof_id;
    }

    

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Profesor getProf_id() {
        return prof_id;
    }

    public void setProf_id(Profesor prof_id) {
        this.prof_id = prof_id;
    }

    
    
}
