/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodnito.springbootwiththymeleaf.controller;

import com.kodnito.springbootwiththymeleaf.model.Todo;
import com.kodnito.springbootwiththymeleaf.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author hayricicek
 */
@Controller
public class TodoController {
    
    @Autowired
    TodoRepository todoRepository;
    
    @GetMapping("/todos")
    public String getAllTodos(Model model) {
        Iterable<Todo> todos = todoRepository.findAll();
        
        model.addAttribute("todos", todos);
        
        return "todos/alltodos";
    }
}
