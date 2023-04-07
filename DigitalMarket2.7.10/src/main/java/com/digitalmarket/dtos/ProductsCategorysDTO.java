/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalmarket.dtos;




import java.util.Date;


/**
 *
 * @author Dario
 */

public class ProductsCategorysDTO  {
 
    
   
    public Integer idProdCategory;
    public String name;
    public String description;
    public Integer status;

   
    public Integer getIdProdCategory() {
        return idProdCategory;
    }

    public void setIdProdCategory(Integer idProdCategory) {
        this.idProdCategory = idProdCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

   
   

   

   
   

    
   

  
            
}
