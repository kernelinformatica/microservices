/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.controllers;
import com.digitalmarket.dtos.AppCodeDTO;
import com.digitalmarket.dtos.ProductsDTO;
import com.digitalmarket.entities.Products;
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
import com.digitalmarket.serviceImpl.ProductsServiceImpl;
import com.sun.jdi.LongValue;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import static org.springframework.http.RequestEntity.post;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Dario
 */
@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)


public class ProductsController {
    private final ProductsServiceImpl productsService;
   // @Autowired
    public ProductsController(ProductsServiceImpl prodService) {
        this.productsService = prodService;
    }
    
    
    /*
   @GetMapping
    */
   @GetMapping("/products")
   public List<ProductsDTO> findAll(){
      
      ModelMapper modelMapper = new ModelMapper();
      List<ProductsDTO> products = productsService.findAllProducts().stream()
              .map(get->modelMapper.map(get, ProductsDTO.class ))
              .collect(Collectors.toList());
       System.out.print("Listado de Productos ----> Cantidad("+products.size()+")");
      return   products;  
    }
    
 
   @GetMapping("products/counter")
    public Long counter(){
         System.out.print("Cantidad de Productos: ----> "+productsService.counter());
         
        return productsService.counter();
    }
   
    @GetMapping("products/{idKey}")
   public Optional<Products> traerProducto(@PathVariable Long idKey){
        System.out.print("Traer Producto ----> "+idKey);
       return productsService.FindById(idKey);
    }
    @DeleteMapping("/product/delete/{idKey}")
    public void delete(@PathVariable String idKey) {
        System.out.print("Borrar Producto ----> "+idKey);
         Long idProduct = Long.parseLong(idKey);
        productsService.deleteProductById(idProduct);
    }
    
    
    /*
  
    
    
    
    
    
    /*
    @PuttMapping
    */
    
    
    /*
    DELETE
    */
    
    
    /*
    @PatchMapping
    */
    
    
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
