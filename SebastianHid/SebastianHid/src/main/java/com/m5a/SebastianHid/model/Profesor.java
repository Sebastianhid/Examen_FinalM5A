/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.SebastianHid.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Profesor {

    public Long prof_id;
    public String nombre;
    public String direccion;
    public int Telefono;
    @JoinColumn(name = "depto_id", referencedColumnName = "depto_id")
    @ManyToOne(optional = false)
    public Depto depto_id;

    public Profesor(){
        
    }

    public Profesor(Long prof_id, String nombre, String direccion, int Telefono, Depto depto_id) {
        this.prof_id = prof_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.depto_id = depto_id;
    }
    

    public Long getProf_id() {
        return prof_id;
    }

    public void setProf_id(Long prof_id) {
        this.prof_id = prof_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

 

    public Depto getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(Depto depto_id) {
        this.depto_id = depto_id;
    }
    
    
    
}
