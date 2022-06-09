/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.services;

import com.restfull.flexcore.entities.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restfull.flexcore.repository.ProductsRepository;

/**
 *
 * @author Dario
 */
@Service
public interface  ProductsService {
    
    public List<Products> findAll ();
    public Optional<Products> FindById(Long id);
    public Long counter();
    public void deleteProductById(Long idKey);
    

}
