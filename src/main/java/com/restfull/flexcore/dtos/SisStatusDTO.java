/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;

import com.restfull.flexcore.entities.SisStatus;

import java.io.ObjectInputFilter.Status;
import java.util.Date;


/**
 *
 * @author Dario
 */

public class SisStatusDTO {
 
    
    public Integer idSisStatus;
    public String name;
    public String description;
    // agregar los dtos todas las las relaciones

    public Integer getIdSisStatus() {
        return idSisStatus;
    }

    public void setIdSisStatus(Integer idSisStatus) {
        this.idSisStatus = idSisStatus;
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
   
   

  
            
}
