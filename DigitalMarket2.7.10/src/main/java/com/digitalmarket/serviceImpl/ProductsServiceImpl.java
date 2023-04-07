/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.serviceImpl;

import com.digitalmarket.entities.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digitalmarket.repository.ProductsRepository;
import com.digitalmarket.services.ProductsService;

/**
 * 
 * @author Dario
 */
@Service
public class  ProductsServiceImpl implements ProductsService{
   
    private final ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        super();
        this.productsRepository = productsRepository;
    }

    
       public List<Products> findAllProducts() {
        var prod = productsRepository.findAll();
        var products = new ArrayList<Products>();
        prod.forEach(product -> products.add(product));
        return products;
    }
    
    public Optional<Products> FindById(Long id) {
        var cereal = productsRepository.findById(id);
        
        try {
            return cereal;
        } catch (Exception ex) {
           Logger.getLogger(ProductsService.class.getName()).log(Level.SEVERE, null, ex);
           return cereal;
        }
    }

    
    public Long counter() {
        return productsRepository.count();
    }
    
    public void deleteProductById(Long idKey) {
        productsRepository.deleteById(idKey);
       
    }

    @Override
    public Optional<Products> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

 

  

}
