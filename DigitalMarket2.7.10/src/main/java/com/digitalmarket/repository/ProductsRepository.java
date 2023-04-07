/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.repository;

import com.digitalmarket.entities.Products;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

/**
 *
 * @author Dario
 */
@Repository
public interface ProductsRepository extends CrudRepository<Products, Long>   {
   public List<Products> findAll(); 
  
   
}
