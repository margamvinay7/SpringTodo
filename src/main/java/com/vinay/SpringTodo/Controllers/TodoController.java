package com.vinay.SpringTodo.Controllers;

import com.vinay.SpringTodo.Entity.TodoClass;
import com.vinay.SpringTodo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private TodoRepository todoRepository;
    @PostMapping("/")
    public TodoClass createTodo(@RequestBody TodoClass todo){
        return todoRepository.save(todo);
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable("id") Integer id){
        todoRepository.deleteById(id);
        return "deleted todo is"+id;
    }

    @GetMapping("/")
    public List<TodoClass> getTodo(){
        return todoRepository.findAll();
    }

    @PutMapping("/{id}")
    public String updateTodo(@RequestBody TodoClass todo,@PathVariable("id") Integer id){
        return "Updated Todo"+todoRepository.updateTodo(todo.getName(),todo.getDescription(),id);
    }


}
