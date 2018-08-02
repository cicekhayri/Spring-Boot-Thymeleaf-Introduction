/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodnito.springbootwiththymeleaf.repository;

import com.kodnito.springbootwiththymeleaf.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hayricicek
 */
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    
}
