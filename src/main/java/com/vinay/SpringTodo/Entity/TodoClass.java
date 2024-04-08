package com.vinay.SpringTodo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoClass {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public String description;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "TodoClass{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
