/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.services;

import com.digitalmarket.entities.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digitalmarket.repository.ProductsRepository;

/**
 *
 * @author Dario
 */
@Service
public interface  ProductsService {
    
    public List<Products> findAllProducts ();
    public Optional<Products> findById(Long id);
    public Long counter();
    public void deleteProductById(Long idKey);
    

}
