/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.controllers;
import com.restfull.flexcore.dtos.AppCodeDTO;
import com.restfull.flexcore.dtos.UsersDTO;
import com.restfull.flexcore.entities.Products;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.restfull.flexcore.serviceImpl.ProductsServiceImpl;
import com.sun.jdi.LongValue;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Dario
 */
@RestController 

public class ProductsController {
    private final ProductsServiceImpl cerealsService;
    
    public ProductsController(ProductsServiceImpl cerealsServices) {
        this.cerealsService = cerealsServices;
    }
    @GetMapping("/products")
    public List<UsersDTO> allCereals(){
      ModelMapper modelMapper = new ModelMapper();
      List<UsersDTO> products = cerealsService.findAll().stream().map(get->modelMapper.map(get, UsersDTO.class )).collect(Collectors.toList());
      return   products;  
       
       

    }
    
    @GetMapping("products/counter")
    public Long counter(){
        return cerealsService.counter();
    }
    @GetMapping("product/{idKey}")
   public Optional<Products> traerCereal(@PathVariable Long idKey){
       return cerealsService.FindById(idKey);
    }
    @DeleteMapping("/delete/product/{idKey}")
    public void delete(@PathVariable String idKey) {
         Long idProduct = Long.parseLong(idKey);
        cerealsService.deleteProductById(idProduct);
    }
    
    
    
  /*  @RequestMapping(value = "/cereals/{idKey}", method = RequestMethod.GET)
    @ResponseBody
     public Optional<Cereals> NombreCereal(@PathVariable("idCereal") Long idKey ){
        return cerealsService.findById(idKey);
    }
     
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public Products getGreeting() throws Exception {
        return (Products) cerealsService.findAll();
    }*/ 
    
}
