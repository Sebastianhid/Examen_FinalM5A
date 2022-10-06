/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.SebastianHid.model;

/**
 *
 * @author Default
 */
public class Depto {
    public Long depto_id;
    public String nombre;
    public String direccion;
    public String descripcion;
public Depto(){
    
}
    public Depto(Long depto_id, String nombre, String direccion, String descripcion) {
        this.depto_id = depto_id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    public Long getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(Long depto_id) {
        this.depto_id = depto_id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
