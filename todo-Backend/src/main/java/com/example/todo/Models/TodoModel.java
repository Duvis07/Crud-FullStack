package com.example.todo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoModel {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private boolean completed;

    public TodoModel() {
    }

    public TodoModel(Long id, String nombre, boolean completed) {
        this.id = id;
        this.nombre = nombre;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
