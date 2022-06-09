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
public class ClientsCategoriesDTO {
    public Integer idClientsCategory;
    public String name;
    public String description;
    public ClientsSubCategoriesDTO clientsSubCategories;
    public SisStatusDTO status;

    public Integer getIdClientsCategory() {
        return idClientsCategory;
    }

    public void setIdClientsCategory(Integer idClientsCategory) {
        this.idClientsCategory = idClientsCategory;
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

    public ClientsSubCategoriesDTO getClientsSubCategories() {
        return clientsSubCategories;
    }

    public void setClientsSubCategories(ClientsSubCategoriesDTO clientsSubCategories) {
        this.clientsSubCategories = clientsSubCategories;
    }

    public SisStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SisStatusDTO status) {
        this.status = status;
    }
    
    
}
