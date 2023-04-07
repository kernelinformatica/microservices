/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.dtos;

import com.digitalmarket.entities.ProductsCategorys;

import java.io.ObjectInputFilter.Status;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Dario
 */

public class ProductsDTO     {
 
    
    public Integer idKey;
    public String name;
    public String shortName;
    public String description;
    public ProductsCategorysDTO idProdCategory;

    public Integer status;
    public Integer getIdKey() {
        return idKey;
    }

    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductsCategorysDTO getIdProdCategory() {
        return idProdCategory;
    }

    public void setIdProdCategory(ProductsCategorysDTO idProdCategory) {
        this.idProdCategory = idProdCategory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

   

   
   
    
   
   

    
   

  
            
}
