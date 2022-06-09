/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.serviceImpl;

import com.restfull.flexcore.entities.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restfull.flexcore.repository.ProductsRepository;
import com.restfull.flexcore.services.ProductsService;

/**
 *
 * @author Dario
 */
@Service
public class  ProductsServiceImpl implements ProductsService{
   
    private final ProductsRepository cerealRepository;

    public ProductsServiceImpl(ProductsRepository cerealRepository) {
        super();
        this.cerealRepository = cerealRepository;
    }

    public List<Products> findAll() {
        var cere = cerealRepository.findAll();
        var cereals = new ArrayList<Products>();
        cere.forEach(cereal -> cereals.add(cereal));
        return cereals;

    }

    
    public Optional<Products> FindById(Long id) {
        var cereal = cerealRepository.findById(id);
        
        try {
            return cereal;
        } catch (Exception ex) {
           Logger.getLogger(ProductsService.class.getName()).log(Level.SEVERE, null, ex);
           return cereal;
        }
    }

    
    public Long counter() {
        return cerealRepository.count();
    }
    
    public void deleteProductById(Long idKey) {
        cerealRepository.deleteById(idKey);
       
    }

 

  

}
