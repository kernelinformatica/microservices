/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.flexcore.dtos;
import com.restfull.flexcore.entities.SisModuleRelClient;
import java.math.BigInteger;

/**
 *
 * @author Dario
 */
public class ClientsSubCategoriesDTO {
    public Integer idSubCategories;
    public String name;
    public String description;
    public ClientsDTO clients;
    public SisStatusDTO status;

    public Integer getIdSubCategories() {
        return idSubCategories;
    }

    public void setIdSubCategories(Integer idSubCategories) {
        this.idSubCategories = idSubCategories;
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

    public ClientsDTO getClients() {
        return clients;
    }

    public void setClients(ClientsDTO clients) {
        this.clients = clients;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }
    
    
}
